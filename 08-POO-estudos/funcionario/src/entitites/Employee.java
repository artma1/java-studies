package entitites;

public class Employee {
    public String name;
    public double grossSalary, tax, netSalary;

    public double netSalary() {
        netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary (double percentage) {
         netSalary += (grossSalary * percentage) / 100;
    }
}
