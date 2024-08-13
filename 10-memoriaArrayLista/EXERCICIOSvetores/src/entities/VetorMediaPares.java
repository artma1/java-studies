package entities;

import java.util.Scanner;

public class VetorMediaPares {
    private int nPares;
    private double[] vetor;
    private double mediaPares;

    public void criaVetor(int n) {
        vetor = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] % 2 == 0) {
                mediaPares += vetor[i];
                nPares++;
            }
        }
        sc.close();
        if (mediaPares != 0) {
            mediaPares /= nPares;
            System.out.print("MEDIA DOS PARES = " + mediaPares);
        } else {
            System.out.print("NENHUM NUMERO PAR");
        }
    }
}
