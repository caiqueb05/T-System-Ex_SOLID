package Ex2;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;

    public Cliente(String nome, String cpf, String endereco, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
