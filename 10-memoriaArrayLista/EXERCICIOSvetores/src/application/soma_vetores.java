package application;
//Faça um programa para ler dois vetores A e B, contendo N elementos cada.
// Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
// elementos correspondentes de A e B. Imprima o vetor C gerado.

import java.util.Scanner;
import entities.SomaVetoresCria;

public class soma_vetores {
    public static void main (String[] args) {
    int n;
    System.out.print("Quantos valores vai ter cada vetor? ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int[] vetorA = SomaVetoresCria.criaVetor(n, "A");
    int[] vetorB = SomaVetoresCria.criaVetor(n, "B");

    System.out.println("VETOR RESULTANTE:");
    SomaVetoresCria.somaVetor(vetorA, vetorB);
    }
}
