import entities.UserPremium;
import entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite nome e index de usuario:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int index = sc.nextInt();
        String perk;

        System.out.println("O usuário é premium? (S/N)");
        String teste = sc.next();
        if (teste.equals("S") || teste.equals("s") ) {
            System.out.println("Escolha o benefício digitando o número: ");
            System.out.println("1- Desconto extra");
            System.out.println("2- 3000 Milhas");
            System.out.println("3- Smartwatch");
            String escolha = sc.next();
            switch (escolha) {
                case "1":
                    perk = "1- Desconto extra";
                    break;
                case "2":
                    perk = "2- 3000 Milhas";
                    break;
                case "3":
                    perk = "3- Smartwatch";
                default:
                    perk = "1- Desconto extra";
                    break;
            }
            UserPremium usuario = new UserPremium(index, name, perk);
            System.out.println(usuario);
        } else {
            User usuario = new User(index, name);
            System.out.println(usuario);
        }
    }
}