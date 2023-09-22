package S8;

public class CD {
    private String autore, titolo, casaDiscografica, proprietario;

    public CD(String autore, String titolo, String casaDiscografica) {
        if (autore == null) {
            throw new IllegalArgumentException("autore cannot be null.");
        }
        if (titolo == null) {
            throw new IllegalArgumentException("titolo cannot be null.");
        }
        if (casaDiscografica == null) {
            throw new IllegalArgumentException("casaDiscografica cannot be null.");
        }
        this.autore = autore;
        this.titolo = titolo;
        this.casaDiscografica = casaDiscografica;
    }
    public void stampaCD() {
        System.out.println("Autore: " + autore);
        System.out.println("Titolo: " + titolo);
        System.out.println("Casa Discografica: " + casaDiscografica);
    }
    public void stampaProprietarioCD() {
        System.out.println("Nome del proprietario: " + proprietario);
    }


    public void setProprietario(String proprietario) {
        if (proprietario == null) {
            throw new IllegalArgumentException("proprietario cannot be null.");
        }
        this.proprietario = proprietario;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getAutore() {
        return autore;
    }

    public String getCasaDiscografica() {
        return casaDiscografica;
    }

    public String getTitolo() {
        return titolo;
    }

    public static void main(String[] args) { // preso direttamente dall'esercizio
        CD cd = new CD("Sting", "Inside", "EMI");
        cd.stampaCD();
        cd.setProprietario("Davide");
        cd.stampaProprietarioCD();
    }
}
