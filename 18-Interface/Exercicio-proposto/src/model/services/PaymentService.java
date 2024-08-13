package model.services;

import model.entities.Contract;

public interface PaymentService {

    double paymentFee(double amount);
    double interest(double amount, int numParcels);
}
