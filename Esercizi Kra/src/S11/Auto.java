package S11;

public class Auto {
    private String targa;
    private int kmPercorsi;
    private final int annoImmatricolazione;
    private final double prezzoBase;
    private String proprietario;
    public Auto(String targa, int annoImmatricolazione, double prezzoBase) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.prezzoBase = prezzoBase;
    }
    public double getPrezzoBase() {
        return prezzoBase;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public String getProprietario() {
        return proprietario;
    }
    public int getKmPercorsi() {
        return kmPercorsi;
    }

    public String getTarga() {
        return targa;
    }

    public void aggiungiKmPercorsi(int Km) {
        kmPercorsi += Km;
    }

    public void setProprietario(String prop) {
        proprietario = prop;
    }

    public static void main(String[] args) {
        Auto a = new Auto("TI 123456", 2006, 27544.6);
        a.setProprietario("Davide");
        a.aggiungiKmPercorsi(45768);

        System.out.println("Targa: " + a.getTarga());
        System.out.println("Km: " + a.getKmPercorsi());
        System.out.println("Anno immatricolazione: " +
                a.getAnnoImmatricolazione());
        System.out.println("Prezzo base: " +
                a.getPrezzoBase());
        System.out.println("Prezzo occasione: " +
                ClienteAuto.getPrezzoCorrente(2014, a));
    }
}

class ClienteAuto {
    public static double getPrezzoCorrente(int anno, Auto auto) {
        return auto.getPrezzoBase() * Math.pow(0.8, anno - auto.getAnnoImmatricolazione());
    }
}
