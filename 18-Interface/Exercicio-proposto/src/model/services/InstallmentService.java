package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InstallmentService {
    private PaymentService service = new PaypalService();

    public List<Installment> invoiceGen(Contract contract, int month) {

        double parcel = contract.getValue()/month;
        List<Installment> installments = new ArrayList<>();

        for (int i = 1; i <= month; i++) {
            LocalDate installmentDate = contract.getDate().plusMonths((i));
            installments.add(new Installment(installmentDate, service.paymentFee(service.interest(parcel, i))));
        }
        return installments;
    }
}