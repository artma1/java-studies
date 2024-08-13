package application;//juros simples 1%
//taxa de pagamento 2%
//ler os dados de um contrato (numero, data, valor total)
// ler numero de meses para parcelar, gerar registros de
//parcelas (data e valor)
//primeira parcela 1 mes após data do contrato
//segunda dois meses após.


import model.entities.Contract;
import model.services.InstallmentService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int num, parcels; LocalDate date;
        double contractValue;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        num = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        contractValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        parcels = sc.nextInt();
        Contract contract = new Contract(num, contractValue, date);
        InstallmentService service = new InstallmentService();

        System.out.println("Parcelas");
        for (int i = 0; i < parcels; i++)
        {
            System.out.println(service.invoiceGen(contract, parcels).get(i));
        }

        sc.close();
    }
}