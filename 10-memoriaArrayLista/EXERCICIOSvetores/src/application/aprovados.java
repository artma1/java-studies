package application;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

import entities.AlunoAprovado;

import java.util.Scanner;

public class aprovados {
    public static void main (String[] args) {
    int n;
    System.out.print("Quantos alunos serão digitados? ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    AlunoAprovado aluno = new AlunoAprovado(n);
    aluno.populaVetor();
    System.out.println("Alunos aprovados:");
    aluno.aprovados();
    }
}
