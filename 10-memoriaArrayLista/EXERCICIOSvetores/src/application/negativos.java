package application;

import java.util.Scanner;

public class negativos {
    public static void main (String[] args) {
        int n;
        System.out.print("Quantos números você vai digitar? ");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         double[] vetor = new double[n];
         for (int i = 0; i < n; i++) {
             System.out.print("Digite um número: ");
             vetor[i] = sc.nextDouble();
         }
    sc.close();
         System.out.println("NÚMEROS NEGATIVOS:");
        for ( int i = 0; i< n; i++) {
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
