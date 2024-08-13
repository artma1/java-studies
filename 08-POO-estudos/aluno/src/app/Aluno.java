package app;
//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos
// três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final,
// mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
// quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma
// classe Student para
//resolver este problema.
import entities.Student;
import alternativa.student;

import java.util.Scanner;

public class Aluno {
    public static void main (String[] args) {

        student student = new student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the name and grades of the Student: ");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade = %.2f%n", student.finale());
        student.pass();
    }
}
