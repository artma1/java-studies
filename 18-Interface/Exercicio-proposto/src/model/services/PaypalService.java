package model.services;

import model.entities.Contract;

import java.time.LocalDateTime;

public class PaypalService implements PaymentService {

    private double contValue, parcelValue; private LocalDateTime date;
    private int numParcels;

    public PaypalService() {
    }

    public double getContValue() {
        return contValue;
    }

    public void setContValue(double contValue) {
        this.contValue = contValue;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getNumParcels() {
        return numParcels;
    }

    public void setNumParcels(int numParcels) {
        this.numParcels = numParcels;
    }

    public double getParcelValue() {
        return parcelValue;
    }

    public void setParcelValue(double parcelValue) {
        this.parcelValue = parcelValue;
    }


    @Override
    public double interest(double amount, int month) {
        amount += amount * 0.01 * month;
        return amount;
    }

    @Override
    public double paymentFee(double amount) {
        return amount * 1.02;
    }

}
