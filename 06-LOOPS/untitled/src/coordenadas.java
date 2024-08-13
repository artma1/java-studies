//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
// indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o
// quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
//Exemplo:
//Entrada: Saída:
//2 2
//3 -2
//-8 -1
//-7 1
//0 2
//primeiro
//quarto
//terceiro
//segundo

import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        int xcoord = 1, ycoord = 1;
        System.out.println("Digite os valores das coordenadas:");
        Scanner sc = new Scanner(System.in);
        while (xcoord != 0 && ycoord != 0) {
            xcoord = sc.nextInt();
            ycoord = sc.nextInt();

            if (xcoord > 0 && ycoord > 0) {
                System.out.println("Primeiro quadrante");
            } else if (xcoord < 0 && ycoord > 0) {
                System.out.println("Segundo quadrante");
            } else if (xcoord < 0 && ycoord < 0) {
                System.out.println("Terceiro quadrante");
            } else if (xcoord > 0 && ycoord < 0) {
                System.out.println("Quarto quadrante");
            }
        }
        System.out.println("fim");
    }
}