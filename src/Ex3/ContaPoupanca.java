package Ex3;

public class ContaPoupanca extends Conta {

    private static final double TAXA = 1.02;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor * TAXA;
        if (valor > 0 && saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }
}
