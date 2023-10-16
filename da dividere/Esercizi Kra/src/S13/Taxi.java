package S13;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Taxi {
    private List<Corsa> corse = new ArrayList<>();

    public void addCorsa(Corsa c) {
        corse.add(c);
    }

    public int getNumCorse() {
        return corse.size();
    }
    public double getCorsaPiuCara() {
        double max = 0;
        for (Corsa c : corse) {
            if (c.getCosto() > max) {
                max = c.getCosto();
            }
        }
        return max;
    }

    public boolean existCitta(String citta) {
        for (Corsa c : corse) {
            if (c.getLuogoDiPartenza().equals(citta) || c.getLuogoDiDestinazione().equals(citta)) {
                return true;
            }
        }
        return false;
    }
    public double getCostoTotale() { //guardare soluzioni, ci sono cose strane
        double costo = 0;
        for (Corsa c : corse) {
            costo += c.getCosto();
        }
        return costo;
    }
}



class Corsa {
    private Date data;
    private String luogoDiPartenza;
    private String luogoDiDestinazione;
    private double kmPercorsi;

    private double costo;

    public Corsa(Date data, String luogoDiPartenza, String luogoDiDestinazione, double kmPercorsi, double costo) {

        this.data = data;
        this.luogoDiPartenza = luogoDiPartenza;
        this.luogoDiDestinazione = luogoDiDestinazione;
        this.kmPercorsi = kmPercorsi;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public double getKmPercorsi() {
        return kmPercorsi;
    }

    public Date getData() {
        return data;
    }

    public String getLuogoDiDestinazione() {
        return luogoDiDestinazione;
    }

    public String getLuogoDiPartenza() {
        return luogoDiPartenza;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setKmPercorsi(double kmPercorsi) {
        this.kmPercorsi = kmPercorsi;
    }

    public void setLuogoDiDestinazione(String luogoDiDestinazione) {
        this.luogoDiDestinazione = luogoDiDestinazione;
    }
    public void setLuogoDiPartenza(String luogoDiPartenza) {
        this.luogoDiPartenza = luogoDiPartenza;
    }

}

class Tester {
    public static void main(String[] args) { //preso da schede
        Taxi taxi = new Taxi();

        Date data = new Date();
        Corsa c = new Corsa(data, "Locarno", "Muralto", 4,
                11.2f);
        taxi.addCorsa(c);
        taxi.addCorsa(new Corsa(new Date(), "Ascona",
                "Minusio", 9, 15.4f));
        taxi.addCorsa(new Corsa(new Date(), "Lugano",
                "Locarno", 43, 92.7f));
        taxi.addCorsa(new Corsa(new Date(), "Tenero",
                "Brissago", 11, 18.4f));

        System.out.println("Numero corse: " +
                taxi.getNumCorse());
        System.out.println("Costo totale: " +
                taxi.getCostoTotale());
        System.out.println("Corsa più cara: " +
                taxi.getCorsaPiuCara());
        System.out.println("Locarno è presente? " +
                (taxi.existCitta("Locarno") ? "SI" : "NO"));
        System.out.println("Solduno è presente? " +
                (taxi.existCitta("Solduno") ? "SI" : "NO"));
    }
}
