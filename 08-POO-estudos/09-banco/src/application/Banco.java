package application;

import java.util.Scanner;
import entities.Cliente;

public class Banco {

    public static void main(String[] args) {

        String verif, acHolder;
        int acNumber;
        double initDep = 0, deposit, withdraw;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        acNumber = sc.nextInt();
        System.out.print("Enter the account holder: ");
        sc.nextLine();
        acHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        verif = sc.nextLine();

        if (verif.equals("y")) {
            System.out.print("Enter the initial deposit: ");
            initDep = sc.nextDouble();
        }

        Cliente cliente = new Cliente(acNumber, acHolder, initDep);
        System.out.println("\nAccount data: ");
        System.out.println(cliente.accData());

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        cliente.deposito(deposit);

        System.out.println("Updated data: ");
        System.out.println(cliente.accData());

        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        cliente.saque(withdraw);

        System.out.println("Updated data: ");
        System.out.println(cliente.accData());

        sc.close();
}
}