package model.entities;

import model.services.PaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate date;
    private double parcelValue;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getParcelValue() {
        return parcelValue;
    }

    public void setParcelValue(double parcelValue) {
        this.parcelValue = parcelValue;
    }

    public Installment(LocalDate date, double parcelValue) {
        this.date = date;
        this.parcelValue = parcelValue;
    }
    @Override
    public String toString() {
        return date.format(fmt)
                + " - "
                + getParcelValue();
    }
}
