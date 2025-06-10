package entities;

public class ContaPoupanca extends Conta{

    protected void rendimento() {
        super.rendimento(0.005);
    }

    @Override
    public void sacar(double saldo) {
        double taxa = 2.00;
        super.sacar(saldo + taxa);
    }

    @Override
    public void trasferir(int idConta, double saldo, double taxa) {
        super.trasferir(idConta, saldo, 2.00);
    }
}
