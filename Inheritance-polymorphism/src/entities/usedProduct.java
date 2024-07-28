package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends Product {

    Date manufactureDate;

    public usedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat stdf2 = new SimpleDateFormat("dd/MM/yyyy");

        return getName()
                + " (used) $ "
                + String.format("%.2f",getPrice())
                + " (Manufacture date: "
                + stdf2.format(manufactureDate)
                + ")";
    }
}
