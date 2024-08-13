package entities;

public class Company extends TaxPayer {

    int employees;

    public Company(String name, Double income, int employees) {
        super(name, income);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public Double taxResult() {
        if (employees <= 10) {
            return income * 0.16;
        } else
            return income * 0.14;
    }

    @Override
    public String toString() {
        return name
                + " $ "
                + String.format("%.2f", taxResult());
    }
}
