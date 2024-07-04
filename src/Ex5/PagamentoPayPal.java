package Ex5;

public class PagamentoPayPal implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via PayPal");
    }
}
