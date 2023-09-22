package S5;

import java.util.Scanner;

public class Lampadina {
    private boolean accesa;

    Lampadina() {
        accesa = false;
    }
    public void accendi() {
        accesa = true;
    }
    public void spegni() {
        accesa = false;
    }
    public boolean status() {
        return accesa;
    }
    public String statusMessage() {
        return "Stato: " + (accesa ? "lampadina accesa" : "Lampadina spenta");
    }
}

class TestLampadina {
    public static void main(String[] args) {
        Lampadina l = new Lampadina();
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.print("Operazione (spegni, accendi, controlla): ");
            String operazione = s.next();
            switch (operazione) {
                case "spegni":
                    l.spegni();
                    System.out.println(l.statusMessage());
                    break;
                case "accendi":
                    l.accendi();
                    System.out.println(l.statusMessage());
                    break;
                case "controlla":
                    System.out.println(l.statusMessage());
                    break;
                default:
                    System.out.println("Errore, \"" + operazione + "\" non specificato.");
                    break;
            }
            System.out.print("Continuare? (true/false) ");
            exit = !s.nextBoolean();
        } while (!exit);
    }
}
