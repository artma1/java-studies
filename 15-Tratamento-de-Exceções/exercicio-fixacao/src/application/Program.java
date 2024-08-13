package application;
import model.entities.Account;
import model.exception.ArgumentException;
import model.exception.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int acNumber; String name; double balance;
        double withdrawLimit, amount;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        acNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Initial balance: ");
        balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        withdrawLimit = sc.nextDouble();

        Account account = new Account(balance, name, acNumber, withdrawLimit);
        System.out.print("Enter the amount for withdraw: ");
        try {
            account.withdraw(sc.nextDouble());
        }
        catch (DomainException | ArgumentException e) {
            System.out.print("Withdraw error: " + e.getMessage());
        }
        System.out.print("New balance: " + account.getBalance());
        sc.close();
    }
}