package application;

import java.util.Scanner;
import entities.AbaixoMedia;
//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
public class abaixo_da_media {
    public static void main(String[] args) {
        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        AbaixoMedia vetor = new AbaixoMedia(n);

        vetor.criaVetor();
        System.out.printf("MEDIA DO VETOR = %.3f\n", vetor.getMedia());
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        vetor.elementos();
        sc.close();
    }
}
