package Ex1;

public class Main {
    public static void main(String[] args) {
        Relatório relatório = new Relatório("Relatório Financeiro", "Conteúdo do Relatório Financeiro");

        relatório.gerar(relatório);
        relatório.imprimir(relatório);
    }
}
