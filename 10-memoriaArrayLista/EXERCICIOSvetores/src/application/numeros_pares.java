package application;
//Faça um programa que leia N números inteiros e armazene-os em um vetor.
// Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

import java.util.Scanner;

public class numeros_pares {
    public static void main (String[] args) {

        int n, quantidade = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] pares = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            pares[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nNUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (pares[i] % 2 == 0) {
            quantidade++;
            System.out.print(pares[i] + " ");
            }
        }
        System.out.println("\n\nQUANTIDADE DE PARES = " + quantidade);
    }
}
