package entities;

import java.util.Scanner;

public class AlunoAprovado {
    private String[] nome;
    private double[] nota1, nota2;
    int n;

    public AlunoAprovado(int n) {
        this.n = n;
    }

    public void populaVetor() {
        nome = new String[n];
        nota1 = new double[n];
        nota2 = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %da aluno:\n", i+1);
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();
    }

    public void aprovados() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((nota1[i] + nota2[i])/2 >= 6.0) {
                System.out.println(nome[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.print("NAO HA ALUNOS APROVADOS");
        }
    }
}
