package Ex2;

public class Pedido {
    private double total;
    private CalculaDesconto desconto;

    public Pedido(double total) {
        this.total = total;
    }

    public void setDesconto(CalculaDesconto desconto) {
        this.desconto = desconto;
    }

    public double getTotalComDesconto() {
        if (desconto != null) {
            return total - desconto.calcularDesconto(total);
        }
        return total;
    }
}
