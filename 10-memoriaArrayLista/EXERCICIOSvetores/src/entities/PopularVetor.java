package entities;

import java.util.Arrays;
import java.util.Scanner;

public class PopularVetor {
    private static int tamanhoVetor;
    private static double[] vetor;

    public static double[] popularV (int tamanhoVetor) {
        PopularVetor.tamanhoVetor = tamanhoVetor;
        Scanner sc = new Scanner(System.in);
        vetor = new double[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        sc.close();
        System.out.print("Vetor: " + Arrays.toString(vetor));
        return vetor;
    }

    public static double[] getVetor() {
        return vetor;
    }
}
