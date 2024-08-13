package application;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
// mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição
// do maior elemento, considerando a primeira posição como 0 (zero).

import java.util.Scanner;
import entities.MaiorValor;

public class maior_posicao {
    public static void main(String[] args) {
        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        MaiorValor.populaVetor(n);
        MaiorValor.calculaVetor();
        System.out.println("MAIOR VALOR: " + MaiorValor.getMaior());
        System.out.print("POSICAO DO MAIOR VALOR: " + MaiorValor.getIndex());
        sc.close();

    }
}
