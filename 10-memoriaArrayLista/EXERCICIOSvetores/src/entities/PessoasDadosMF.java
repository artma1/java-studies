package entities;

import java.util.Scanner;

public class PessoasDadosMF {
    private int n, nHomens;
    private double[] alturas;
    private String[] genero;
    private double mediaMulheres, menorAltura, maiorAltura;

public PessoasDadosMF (int n) {
    this.n = n;
}

    public double getMediaMulheres() {
        return mediaMulheres;
    }

    public int getNumHomens() {
        return nHomens;
    }

    public double getMenorAltura() {
        return menorAltura;
    }

    public double getMaiorAltura() {
        return maiorAltura;
    }

    public void populaVetor() {
        alturas = new double[n];
        genero = new String[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero %da pessoa: ", i+1);
            genero[i] = sc.next();
        }
    }

    public double mediaMulheres() {
        int cont = 0; mediaMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i].equalsIgnoreCase("F")) {
                mediaMulheres+= alturas[i];
                cont++;
            }
        }
        mediaMulheres /= cont;
        return mediaMulheres;
    }
    public double menorAltura() {
        menorAltura = alturas[0];
        for (int i = 0; i < n; i++) {
            if (menorAltura > alturas[i]) {
                menorAltura = alturas[i];
            }
        }
        return menorAltura;
    }
    public double maiorAltura() {
        for (int i = 0; i < n; i++) {
            if (maiorAltura < alturas[i]) {
                maiorAltura = alturas[i];
            }
        }
        return maiorAltura;
    }
    public int numHomens() {
        nHomens = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i].equalsIgnoreCase("M")) {
                nHomens++;
            }
        }
        return nHomens;
    }
}