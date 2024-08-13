package application;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Workspace\\estudandoJava\\17-Trabalhando-com-arquivos\\file2read\\file1.csv";
        List<Product> list = new ArrayList<>();
        String[] words;

        try (BufferedReader br = new BufferedReader(new FileReader((path)))) {
            String line = br.readLine();
            while (line != null) {
                words = line.split(",");
                String name = words[0];
                Double price = Double.parseDouble(words[1]);
                Integer quant = Integer.parseInt(words[2]);
                list.add(new Product(name, price, quant));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: unable to read file");
            e.printStackTrace();
        }
        boolean success = new File("C:\\Workspace\\estudandoJava\\17-Trabalhando-com-arquivos\\file2read\\out").mkdir();
        System.out.println("Folder successfully created: "+ success);
        String path2 = "C:\\Workspace\\estudandoJava\\17-Trabalhando-com-arquivos\\file2read\\out\\summary.csv";
        try (BufferedWriter br = new BufferedWriter(new FileWriter((path2)))) {
            for (Product p : list) {
                br.write(p.getName() + ",");
                br.write(String.valueOf(p.totalPrice()));
                br.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: unable to create folder and/or file");
            e.printStackTrace();
        }
    }
}