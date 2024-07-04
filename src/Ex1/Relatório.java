package Ex1;

public class Relatório implements ImprimirRelatorio, GerarRelatorio {
    private String nome;
    private String conteúdo;

    public Relatório(String nome, String conteúdo) {
        this.nome = nome;
        this.conteúdo = conteúdo;
    }

    @Override
    public void gerar(Relatório relatório) {
        System.out.println("Gerando relatório: " + relatório.getNome());
    }

    @Override
    public void imprimir(Relatório relatório) {
        System.out.println("Imprimindo relatório: " + relatório.getNome());
        System.out.println("Conteúdo: " + relatório.getConteúdo());
    }

    public String getNome() {
        return nome;
    }

    public String getConteúdo() {
        return conteúdo;
    }
}
