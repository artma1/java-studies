import java.util.Scanner;

public class exemplo0 {
    public static void main (String[] args) {

        int n = 4; double average = 0;
        System.out.println("Digite 4 valores e obtenha a média deles: ");
        double[] vetor = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            average +=vetor[i];
        }
        sc.close();
        System.out.print("Média = " + average/n);
    }
}
