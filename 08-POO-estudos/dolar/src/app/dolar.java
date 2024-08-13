package app;
// ler cotação do dolar
//ler valor em dolares a ser comprado
// informar quantos reais voa ser pagos pelo valor a ser comprado considerando 6% de IOF
// criar uma classe CurrencyConverter para fazer os cálculos

import util.CurrencyConverter;
import java.util.Scanner;

public class dolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What's the dollar price? ");
        CurrencyConverter.dolarprice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dolars = sc.nextDouble();
        sc.close();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calc());
    }
}
