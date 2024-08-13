package application;

import model.entities.Elected;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        System.out.println("Adding names and votes to archive...");
        Scanner sc = new Scanner(System.lineSeparator());
        //primeira lista list para escrever o arquivo, a segunda
        //electedList é o que resgato do arquivo
        List<String> list = new ArrayList<>();
        List<Elected> electedList = new ArrayList<>();

        list.add("Alex Blue,15");
        list.add("Maria Green,22");
        list.add("Bob Brown,21");
        list.add("Alex Blue,30");
        list.add("Bob Brown,15");
        list.add("Maria Green,27");
        list.add("Maria Green,22");
        list.add("Bob Brown,25");
        list.add("Alex Blue,31");

        File file = new File("C:\\Workspace\\estudandoJava\\19-Generics-Set-Map\\exercicio-proposto-map");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file + "\\out\\listVote.csv"))) {
            for (String line : list) {
                br.write(line);
                br.newLine();
            }
            System.out.println("File wrote successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file + "\\out\\listVote.csv"))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                electedList.add(new Elected(fields[0], Integer.parseInt(fields[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       /* System.out.println("\nPRINTING LIST:");
        for (Elected e : electedList) {
            System.out.println("name: "+ e.getName() + "votes: "+ e.getVotes());
       } */

        Map<String, Integer> electedTotal = new HashMap<>();
        for (Elected e : electedList) {
            if (electedTotal.containsKey(e.getName())) {
               Integer a = electedTotal.get(e.getName()) + e.getVotes();
               electedTotal.put(e.getName(), a);
            } else {
                electedTotal.put(e.getName(), e.getVotes());
            }
        }
        System.out.println("Alex Blue: " + electedTotal.get("Alex Blue"));
        System.out.println("Maria Green: " + electedTotal.get("Maria Green"));
        System.out.println("Bob Brown: " + electedTotal.get("Bob Brown"));
    }
}