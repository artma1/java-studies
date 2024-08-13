package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        int n, duration;
        String depName, name;
        String level;
        Double baseSalary, valuePHour;

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the department's name: ");
        depName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Level: ");
        level = sc.next();
        System.out.print("Base salary: ");
        baseSalary = sc.nextDouble();
        System.out.println("How many contracts to this worker? ");
        n = sc.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(depName));
        for(int i = 0; i < n; i++) {
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            valuePHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            duration = sc.nextInt();
            HourContract contract = new HourContract(date, valuePHour, duration);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}