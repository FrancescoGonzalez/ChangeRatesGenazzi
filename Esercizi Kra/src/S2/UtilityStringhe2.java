package S2;

import java.util.Scanner;

public class UtilityStringhe2 {
    static void stampa(String nome, String cognome) {
        System.out.println("Nome Completo: " + nome + " " + cognome);
    }
    static boolean verificaNome (String nome) {
        if (nome.length() <= 4) {
            return true;
        }
        return false;
    }
}

class ClienteUtilityStringhe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = s.next();
        System.out.print("Cognome: ");
        String cognome = s.next();
        UtilityStringhe2.stampa(nome, cognome);
        if (UtilityStringhe2.verificaNome(nome)) {
            System.out.println("Il nome è maggiore di 4!");
        } else {
            System.out.println("Il nome non è maggiore di 4!");

        }

    }
}
