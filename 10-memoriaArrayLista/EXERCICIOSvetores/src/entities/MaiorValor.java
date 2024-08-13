package entities;

import java.util.Scanner;

public class MaiorValor {
    private static double[] vetor;
    private static double maior, index;
    private static int n;

    public static double getMaior() {
        return maior;
    }
    public static double getIndex() {
        return index;
    }

    public static void populaVetor(int n) {
        vetor = new double[n];
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        sc.close();
    }

    public static void calculaVetor() {
        n = vetor.length;
        maior = vetor[0];
        index = 0;
        for (int i = 0; i < n; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
                index = i;
            }
        }
    }
}
