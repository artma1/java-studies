package applicationex1;

import java.util.Scanner;
import entities.Retangulo;

//ler largura e altura de retângulo
// mostrar área, perímetro e diagonal
public class triangulo {
    public static void main(String[] args) {

        Retangulo rectangle = new Retangulo();

        System.out.println("Enter rectangle width and height:");

        Scanner sc = new Scanner(System.in);

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        sc.close();

        System.out.println(rectangle);
    }
}