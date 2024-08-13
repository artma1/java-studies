package application;

import model.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Integer studentsNumb;
        System.out.print("How many students for course A? ");
        Scanner sc = new Scanner(System.in);
        studentsNumb = sc.nextInt();
        Set<Student> a = new HashSet<>();
        for (int i = 0; i < studentsNumb; i++) {
            a.add(new Student(sc.nextInt()));
        }
        System.out.print("How many students for course B? ");
        studentsNumb = sc.nextInt();
        for (int i = 0; i < studentsNumb; i++) {
            a.add(new Student(sc.nextInt()));
        }
        System.out.print("How many students for course C? ");
        studentsNumb = sc.nextInt();
        for (int i = 0; i < studentsNumb; i++) {
            a.add(new Student(sc.nextInt()));
        }

        int sum = 0;
        for (Student s : a) {
            sum ++;
        }
        System.out.print("Total students: " + sum);
    }
}