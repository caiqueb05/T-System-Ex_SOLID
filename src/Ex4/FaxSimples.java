package Ex4;

public class FaxSimples implements Fax {
    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Enviando fax do documento: " + documento);
    }
}