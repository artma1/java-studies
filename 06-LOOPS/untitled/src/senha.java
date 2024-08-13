import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        System.out.print("Digite a senha: ");
        String senha;
        Scanner sc = new Scanner(System.in);
        senha = sc.next();
        while (!senha.equals("2002")){
            System.out.println("Senha Inválida");
            senha = sc.next();
        }
        System.out.print("Acesso Permitido");
        sc.close();
        }
    }
