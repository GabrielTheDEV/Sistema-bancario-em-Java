package entities;

public abstract class Conta {
    private String titular;
    private String cpf;
    private double saldo;

    public Conta(){}

    private void rendimento(){

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double saldo){
        this.saldo = saldo;
    }
    public void trasferir(){}
}
