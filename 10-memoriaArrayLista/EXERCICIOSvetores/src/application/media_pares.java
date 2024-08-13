package application;

import java.util.Scanner;
import entities.VetorMediaPares;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class media_pares {
    public static void main (String[] args) {
        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        VetorMediaPares vetor = new VetorMediaPares();
        vetor.criaVetor(n);
        sc.close();
    }
}
