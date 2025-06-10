package entities;

public class ContaCorrente extends Conta{

    protected void rendimento() {
        super.rendimento(0.0);
    }

    @Override
    public void sacar(double saldo) {
        double taxa = 0.50;
        super.sacar(saldo + taxa);
    }

    @Override
    public void trasferir(int idConta, double saldo, double taxa) {
        super.trasferir(idConta, saldo, 1.00);
    }
}
