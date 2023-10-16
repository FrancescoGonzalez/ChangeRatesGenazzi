package S2;

public class NumeroIntero {
    public int numeroIntero;

    public NumeroIntero(int numeroIntero) {
        this.numeroIntero = numeroIntero;
    }

    public void stampaNumero() {
        System.out.println(numeroIntero);
    }
    public static void main(String[] args) {

        NumeroIntero n1 = new NumeroIntero(2);
        NumeroIntero n2 = new NumeroIntero(3);

        n1.numeroIntero = 11;
        n2.numeroIntero = n1.numeroIntero + 7;

        n2.stampaNumero();
    }
}
