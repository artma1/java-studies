package application;
//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

import entities.Pessoa;

import java.util.Scanner;

public class mais_velho {
    public static void main (String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        Pessoa pessoa = new Pessoa(n);
        pessoa.dadosPessoas();
        System.out.print("PESSOA MAIS VELHA: " + pessoa.maisVelho());
        sc.close();
    }
}
