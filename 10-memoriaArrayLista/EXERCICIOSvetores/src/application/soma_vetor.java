package application;

import entities.PopularVetor;
import entities.SomaMedia;

import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        System.out.print("Quantos números você vai digitar? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PopularVetor.popularV(n);
        sc.close();

        System.out.print("\nSoma: " + SomaMedia.soma());
        System.out.print("\nMédia: " + SomaMedia.media(PopularVetor.getVetor()));
        }
    }

