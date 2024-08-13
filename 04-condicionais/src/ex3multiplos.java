import java.util.Scanner;

public class ex3multiplos {
    public static void main(String[] args){
        System.out.println("Digite dois números para checar se são múltiplos: ");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String s = "é múltiplo";
        String z = "não é múltiplo";
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a % b == 0 || b % a ==0){
            System.out.printf("Os números %d e %d são múltiplos.", a, b);
        }
        else
            System.out.printf("Os números %d e %d não são múltiplos.", a, b);
        c = (c % b != 0) ? 10 : 20;
        System.out.print(c);
        sc.close();
    }
}
