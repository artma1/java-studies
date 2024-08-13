package application;

import entities.Rent;

import java.util.Arrays;
import java.util.Scanner;

public class pensionato_desafio {
    public static void main (String[] args) {

        int n, nRooms, totalRooms = 10;
        String name, email;

        Rent[] rent = new Rent[totalRooms];
        System.out.print("How many rooms will be rented? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\n");
            System.out.println("Rent #" + (i+1) + ": ");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Room: ");
            nRooms = sc.nextInt();
            rent[nRooms] = new Rent(name, email, nRooms);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < totalRooms; i++) {
            if(rent[i] != null) {
                System.out.printf("%d: %s, %s\n", rent[i].getRoom(), rent[i].getName(), rent[i].getEmail());
            }
        }
    System.out.println(Arrays.toString(rent));
    }
}
