package S12;

public class Auto2{
    private String targa;
    private int kmPercorsi;
    private final int annoImmatricolazione;
    private final double prezzoBaseSenzaExtra;
    private String proprietario;
    private boolean ariaCondizionata;
    private boolean verniceMetallizzata;

    private boolean autoradio;

    private boolean antifurto;

    public Auto2(String targa, int annoImmatricolazione, double prezzoBase) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.prezzoBaseSenzaExtra = prezzoBase;
    }
    public double getPrezzoBase() {
        double prezzoFinale = prezzoBaseSenzaExtra;
        if (ariaCondizionata) {
            prezzoFinale += prezzoFinale * 0.1;
        } else {
            prezzoFinale -= prezzoFinale * 0.1;
        }
        if (verniceMetallizzata) {
            prezzoFinale += prezzoFinale * 0.1;
        } else {
            prezzoFinale -= prezzoFinale * 0.1;
        }
        if (autoradio) {
            prezzoFinale += prezzoFinale * 0.1;
        } else {
            prezzoFinale -= prezzoFinale * 0.1;
        }
        if (antifurto) {
            prezzoFinale += prezzoFinale * 0.1;
        } else {
            prezzoFinale -= prezzoFinale * 0.1;
        }
        return prezzoFinale;
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

    public void aggiungiAriaCondizionata() {
        ariaCondizionata = true;
    }
    public void rimuoviAriaCondizionata() {
        ariaCondizionata = false;
    }
    public void aggiungiVerniceMetallizata() {
        verniceMetallizzata = true;
    }
    public void rimuoviVerniceMetallizata() {
        verniceMetallizzata = false;

    }
    public void aggiungiAutoradio() {
        autoradio = true;
    }
    public void rimuoviAutoradio() {
        autoradio = false;

    }
    public void aggiungiAntifurto() {
        antifurto = true;
    }
    public void rimuoviAntifurto() {
        antifurto = false;

    }
    public boolean accessoriata() {
        return ariaCondizionata || verniceMetallizzata || autoradio || antifurto;
    }
    public boolean superAccessoriata() {
        return ariaCondizionata && verniceMetallizzata && autoradio && antifurto;
    }

    public static void main(String[] args) {
        Auto2 a = new Auto2("TI 123456", 2006, 27544.6);
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
    public static double getPrezzoCorrente(int anno, Auto2 auto) {
        return auto.getPrezzoBase() * Math.pow(0.8, anno - auto.getAnnoImmatricolazione());
    }
}
