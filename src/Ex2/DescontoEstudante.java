package Ex2;

public class DescontoEstudante implements CalculaDesconto {
    @Override
    public double calcularDesconto(double total) {
        return total * 0.1; // 10% de desconto
    }
}