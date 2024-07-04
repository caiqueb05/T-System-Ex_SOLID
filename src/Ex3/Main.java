package Ex3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);

        contaCorrente.depositar(500);
        contaPoupanca.depositar(500);

        contaCorrente.sacar(200);
        contaPoupanca.sacar(200);

        System.out.println("Saldo final conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo final conta poupança: R$" + contaPoupanca.getSaldo());
    }
}