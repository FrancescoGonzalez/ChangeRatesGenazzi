package S4;

import java.util.Scanner;

public class Compleanno {
   private String nome, cognome;
    private int giorno, mese, anno;

    public Compleanno(String nome, String cognome, int giorno, int mese, int anno) {
        if (nome == null) {
            throw new NullPointerException("variable \"nome\" is null");
        }
        if (cognome == null) {
            throw new NullPointerException("variable \"cognome\" is null");
        }
        if (giorno > 31 || giorno < 1) {
            throw new IllegalArgumentException("giorno non valido");
        }
        if (mese > 12 || mese < 1) {
            throw new IllegalArgumentException("mese non valido");

        }
        if (anno < 0) {
            throw new IllegalArgumentException("anno non valido");
        }
        // guard condition su tutto
        this.nome = nome;
        this.cognome = cognome;
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public int getMese() {
        return mese;
    }

    public String meseDiNascita() {
        switch (mese) {
            case 1:
                return "gennaio";
            case 2:
                return "febbraio";
            case 3:
                return "marzo";
            case 4:
                return "aprile";
            case 5:
                return "maggio";
            case 6:
                return "giugno";
            case 7:
                return "luglio";
            case 8:
                return "agosto";
            case 9:
                return "settembre";
            case 10:
                return "ottobre";
            case 11:
                return "novembre";
            default:
                return "dicembre";

        }
    }

    public int getGiorno() {
        return giorno;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
}

class ProvaCompleanno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = s.next();
        System.out.print("Cognome: ");
        String cognome = s.next();
        System.out.print("Giorno: ");
        int giorno = s.nextInt();
        System.out.print("Mese: ");
        int mese = s.nextInt();
        System.out.print("Anno: ");
        int anno = s.nextInt();

        Compleanno c = new Compleanno(nome, cognome, giorno, mese, anno);
        System.out.println("Dettaglio: " + nome + " " + cognome + ", nato il " + c.getGiorno() + " " + c.meseDiNascita() + " " + c.getAnno());
    }
}
