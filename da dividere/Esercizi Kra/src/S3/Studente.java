package S3;

public class Studente {
    private final String nome;
    private final String cognome;
    private final int eta;

    Studente(String nome, String cognome, int eta) {
        if (nome == null || cognome == null) {
            throw new NullPointerException("Nome o Cognome nullo");
        }
        if (eta < 0) {
            throw new IllegalArgumentException("the age should be positive");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }



    void stampaStudente() {
        System.out.println("Studente: " + nome + " " + cognome);
    }
    int getEta() {
        return eta;
    }
}

class S3E1 {
    public static void main(String[] args) {
        Studente s = new Studente("Ugo", "Fantozzi", 21);
        s.stampaStudente();
        System.out.println("Eta: " + s.getEta());
    }
}
