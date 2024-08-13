import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vogais tem na seguinte frase?");
        frase = sc.nextLine();
        System.out.println(checaVogais(frase));
    }

    public static String checaVogais (String frase) {
       Integer sum = 0;
       for (int i = 0; i < frase.length(); i++) {
           if (frase.compareToIgnoreCase("a") == 1) {
               sum++;
           }
       }
       return "soma das vogais = "
               + sum;
    }
}

