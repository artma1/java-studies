package entities;

import java.util.Scanner;

public class Pessoa {
    private int n;
    private String[] nome;
    private int[] idade;
    private int velho, iVelho;

     public Pessoa(int n) {
        this.n = n;
    }
    public void dadosPessoas() {
        nome = new String[n];
        idade = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        sc.close();
    }

    public String maisVelho() {
        for (int i = 0; i < n; i++) {
            if (velho < idade[i]) {
                velho = idade[i];
                iVelho = i;
            }
        }
        return nome[iVelho];
    }
}
