package S9;

public class CassaCambioDollari {
    private int scorta;
    private double tassoDiCambio;
    public CassaCambioDollari() {
        this.scorta = 0;
        this.tassoDiCambio = 0;
    }

    public int quantiEuro() {
        return scorta;
    }
    public void mettiEuro(int euro) {
        if (euro < 0) {
            throw new IllegalArgumentException("EUR argoment cannot be negative");
        }
        scorta += euro;
    }
    public double qualeCambio() {
        return tassoDiCambio;
    }
    public void fissaCambio(double cambio) {
        if (cambio < 0) {
            throw new IllegalArgumentException("change value argoment cannot be negative");
        }
        tassoDiCambio = cambio;
    }
    public double cambia(int USD) {
        if (USD * tassoDiCambio > scorta) {
            throw new FondiInsufficentiException();
        }
        return USD * tassoDiCambio;
    }
}

class TestCassaCambioDollari {
    public static void main(String[] args) {
        CassaCambioDollari c = new CassaCambioDollari();
        c.mettiEuro(122);
        c.fissaCambio(1.12);
        c.qualeCambio();
        c.cambia(200);
    }
}


//LaScortaNonBastaException
class FondiInsufficentiException extends RuntimeException {

}
