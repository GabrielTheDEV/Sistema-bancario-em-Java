package entities;

public abstract class Conta {
    private String titular;
    private String cpf;
    protected double saldo;

    public Conta(){}

    protected void rendimento(double taxa){
        saldo += saldo * taxa;
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
        this.saldo -= saldo;
    }
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    public void trasferir(int idConta , double saldo ,double taxa){}


}
