package Ex3;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}