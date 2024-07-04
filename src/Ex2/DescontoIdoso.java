package Ex2;

public class DescontoIdoso implements CalculaDesconto {
    @Override
    public double calcularDesconto(double total) {
        return total * 0.15; // 15% de desconto
    }
}