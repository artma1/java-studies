package application;

import entities.PessoasAlturas;

import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        int n, idade;
        String nome;
        double altura, media = 0, porcentagem = 0;
        System.out.print("Quantas pessoas serão digitadas? ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        PessoasAlturas[] dados = new PessoasAlturas[n];

        for (int i = 0; i < dados.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa\n", i+1);
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();
            dados[i] = new PessoasAlturas(nome, idade, altura);
        }
        sc.close();

        for (int i = 0; i < dados.length; i++) {
            media += dados[i].getAltura();
            if (dados[i].getIdade() < 16) {
               porcentagem ++;
            }
        }
        media = media / 3;
        porcentagem = (porcentagem * 100)/n;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        for (int i = 0; i < dados.length; i++) {
            media += dados[i].getAltura();
            if (dados[i].getIdade() < 16) {
                System.out.println(dados[i].getNome());
            }
        }
    }
}

