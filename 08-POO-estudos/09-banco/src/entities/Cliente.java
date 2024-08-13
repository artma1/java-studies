package entities;

public class Cliente {
    private double saldo;
    private final int conta;
    private String nome;

    public Cliente (int conta, String nome, double depIni) {
        deposito(depIni); //encapsulei esse valor na função
        this.conta = conta;
        this.nome = nome;
    }
    public Cliente (int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public int getConta () {
        return conta;
    }
    public void setNome (String nome){
       this.nome = nome;
    }
    public String getNome () {
       return nome;
    }
    public double getSaldo () {
       return saldo;
    }

    public void deposito(double dep) {
        this.saldo = saldo + dep;
    }
    public void saque (double saque) {
        this.saldo = saldo - saque - 5.00;
    }

    public String accData () {
       return  "Account "
               + conta
               + ", Holder: "
               + nome
               +", Balance: $ "
               + saldo;
    }
}
