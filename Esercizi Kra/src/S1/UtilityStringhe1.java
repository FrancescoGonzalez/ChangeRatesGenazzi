package S1;

import java.util.Scanner;

public class UtilityStringhe1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Stringa1: ");
        String s1 = s.next();
        System.out.println("Stringa1: ");
        String s2 = s.next();
        stampaIniziali(s1, s2);
    }
    static void stampaIniziali(String nome, String cognome) {
        System.out.println("Iniziali: " + nome.substring(0, 1) + cognome.substring(0, 1));
    }
}
