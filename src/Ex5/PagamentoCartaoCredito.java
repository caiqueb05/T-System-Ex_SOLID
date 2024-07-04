package Ex5;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Cartão de Crédito");
    }
}