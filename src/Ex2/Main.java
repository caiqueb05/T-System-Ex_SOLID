package Ex2;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100);

        pedido.setDesconto(new DescontoEstudante());

        System.out.println("Total com desconto: R$" + pedido.getTotalComDesconto());
    }
}