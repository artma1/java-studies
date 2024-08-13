package entities;

public abstract class TaxPayer {

    String name; Double income;
    public TaxPayer() {
    }

    public TaxPayer(String name, Double income) {
        this.income = income;
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double taxResult ();
}
