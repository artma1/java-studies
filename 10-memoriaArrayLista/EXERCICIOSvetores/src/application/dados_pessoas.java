package application;
//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

import entities.PessoasDadosMF;

import java.util.Scanner;

public class dados_pessoas {
    public static void main (String[] args) {
        int n;
        System.out.print("Quantas pessoas serão digitadas? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        PessoasDadosMF pessoas = new PessoasDadosMF(n);
        pessoas.populaVetor();
        System.out.printf("Menor altura = %.2f\n", pessoas.menorAltura());
        System.out.printf("Maior altura = %.2f\n", pessoas.maiorAltura());
        System.out.printf("Media das alturas das mulheres = %.2f\n", pessoas.mediaMulheres());
        System.out.printf("Numero de homens = %d\n", pessoas.numHomens());
        sc.close();
    }
}
