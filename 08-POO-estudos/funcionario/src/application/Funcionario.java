package application;


import entitites.Employee;

import java.util.Scanner;

public class Funcionario {

    public static void main(String [] args) {

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary() );
        System.out.print("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        sc.close();

        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary);
}}
