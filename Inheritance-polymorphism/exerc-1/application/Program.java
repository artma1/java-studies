package application;

import entities.ImportedProduct;
import entities.Product;
import entities.usedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        char type; String name; Double price;
        List<Product> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Product #"+ (i+1) +" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy");
                Date date = std.parse(sc.next());

                list.add(new usedProduct(name, price, date));
            } else {
                list.add(new Product(name, price));
            }
        }
        sc.close();

        System.out.println("\nPRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }
    }
}