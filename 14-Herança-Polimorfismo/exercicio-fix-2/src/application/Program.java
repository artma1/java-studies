package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int n; char payerType; String name; Double income;
        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer number #"+ (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            payerType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Anual income: ");
            income = sc.nextDouble();
            if (payerType == 'i') {
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                list.add(new Individual(name, income, expenditures));
            } else if (payerType == 'c') {
                System.out.print("Number of employees: ");
                int nEmployees = sc.nextInt();
                list.add(new Company(name, income, nEmployees));
            }
        }
        System.out.println("\nTAXES PAID:");
        double sum = 0;
        for (TaxPayer payer : list) {
            sum += payer.taxResult();
            System.out.println(payer);
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
    }
}