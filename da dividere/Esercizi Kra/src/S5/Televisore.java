package S5;

public class Televisore {
    private static final int MAX_VOLUME  = 40;
    private static final int MAX_CHANNEL  = 999;
    private int canale=0;
    private int volume=0;
    private boolean acceso=false;
    public static void main(String[] args) {
        Televisore t = new Televisore();
        t.accendi();
        t.cambiaVolume(25);
        t.cambiaCanale(12);
        t.spegni();
        t.cambiaVolume(50);
        t.cambiaCanale(24);
    }

    private void spegni() {
        acceso = false;
        System.out.println("Televisore spento");
    }

    private void cambiaCanale(int i) {
        if (i > MAX_CHANNEL || i < 0) {
            throw new IllegalArgumentException("Illegal value of channel");
        }
        if (acceso) {
            canale = i;
            System.out.println(i);
        } else {
            // IllegalStateException
            System.out.println("Televisore spento!!");
        }
    }

    private void cambiaVolume(int i) {
        if (i > MAX_VOLUME || i < 0) {
            throw new IllegalArgumentException("Illegal value of volume");
        }
        if (acceso) {
            volume = i;
            System.out.println("Volume: " + i);
        } else {
            System.out.println("Televisore spento!!");
        }
    }

    private void accendi() {
        acceso = true;
        System.out.println("Televisore acceso");
    }

}
