import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num = 0;
        Scanner sc = new Scanner(System.in);
        while (num != -1) {
            System.out.print("Digite o número para testar: ");
            num = sc.nextInt();
            System.out.print(testePrimo(num));
        }
    }

    public static String testePrimo(double num) {

        if (num == 1 || num == 0 || num == 2 || num == 3) {
            return "O número " + num + " é primo\n";
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return "O número " + num + " não é primo\n";
                }
            }
        }
        return "O número " + num + " é primo\n";
    }
}
