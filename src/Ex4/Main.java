package Ex4;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraSimples();
        Scanner scanner = new ScannerSimples();
        Fax fax = new FaxSimples();

        impressora.imprimirDocumento("Documento 1");
        scanner.escanearDocumento("Documento 2");
        fax.faxearDocumento("Documento 3");
    }
}