package entities;

import java.util.Scanner;

public class AbaixoMedia {
    private int n;
    private double mediaVetor, menor;
    private double[] vetor;

    public AbaixoMedia (int n) {
        this.n = n;
    }

    public double getMedia() {
        return mediaVetor;
    }

    public void criaVetor() {
        vetor = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            mediaVetor += vetor[i];
        }
        mediaVetor /= n;
        sc.close();
    }

    public void elementos() {
        for (int i = 0; i < n; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.println(vetor[i]);
            }
        }
    }
}
