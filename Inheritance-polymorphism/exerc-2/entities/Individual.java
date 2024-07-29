package entities;

public class Individual extends TaxPayer {

    Double expenditures;

    public Individual(String name, Double income, Double expenditures) {
        super(name, income);
        this.expenditures = expenditures;
    }

    public Double getExpenditures() {
        return expenditures;
    }

    public void setExpenditures(Double expenditures) {
        this.expenditures = expenditures;
    }

    @Override
    public Double taxResult() {
        if (income < 20000) {
            return income * 0.15 - expenditures * 0.5;
        } else
            return income * 0.25 - expenditures * 0.5;
    }

    @Override
    public String toString() {
        return name
                + " $ "
                + String.format("%.2f", taxResult());
    }
}
