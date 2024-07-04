package Ex5;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento pagamentoComCartao = new SistemaPagamento(new PagamentoCartaoCredito());
        pagamentoComCartao.processarPagamento(100);

        SistemaPagamento pagamentoComPayPal = new SistemaPagamento(new PagamentoPayPal());
        pagamentoComPayPal.processarPagamento(200);
    }
}