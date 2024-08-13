package entities;

import java.util.Scanner;

public class SomaVetoresCria {
    public static int[] criaVetor(int n, String nome) {
        int[] vetor = new int[n];
        System.out.printf("Digite os valores do vetor %s:\n", nome);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }
    public static void somaVetor(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}
