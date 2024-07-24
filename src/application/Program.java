package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String clientStatus = sc.next();
        System.out.print("How many items to this order? ");
        int nItems = sc.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(clientStatus), client);

        for (int i = 0; i < nItems; i++) {
            System.out.println("Enter item #" + (i+1) + " data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem items = new OrderItem (productQuantity, productPrice, product);
            order.addItem(items);
        }
        System.out.println("ORDER SUMARY:");
        System.out.println("Order moment: " + sdf.format(order.getMoment()));
        System.out.println("Order status: " + clientStatus);
        System.out.println("Client: " + client);

        System.out.println("\nOrder items:");
        System.out.println(order.getOrderItems());

        System.out.print("Total price: " + order.total());

        sc.close();
    }
}