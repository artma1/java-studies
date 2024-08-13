import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
        }
        else
            System.out.printf("O número %d é ímpar", num);
        sc.close();
        }
    }
