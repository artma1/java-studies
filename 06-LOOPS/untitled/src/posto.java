import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        int alcool = 0, gasolina = 0, diesel = 0, codigo;
        System.out.println("Digite o código do combustível, para sair, digite 4: ");
        Scanner sc = new Scanner(System.in);
        do {
            codigo = sc.nextInt();
            switch (codigo) {
                case (1):
                    alcool++;
                    break;
                case (2):
                    gasolina++;
                    break;
                case (3):
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido.");
                    break;
            }
        }while (codigo !=4);
        sc.close();
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}