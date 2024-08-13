package application;

import model.entities.User;
import model.services.Find;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Encontre o nome na lista");
        System.out.print("Escolha o tamanho da lista: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Escolha o nome a ser encontrado: ");
        String nome = sc.next();
        List<User> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new User("Artur"+i, "arturbonzao@gmail.com", n));
        }
        Find finder = new Find();
        System.out.println(finder.findName(list, nome));
    }
}