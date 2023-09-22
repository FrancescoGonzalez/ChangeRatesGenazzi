package S9;
public class Termometro {
    private int tempInCelsius = 0;

    public void misura(int nuovaTemp) {
        if (nuovaTemp < -235) {
            throw new IllegalArgumentException("The temperature is too low!");
        }
        if (nuovaTemp > 500) {
            throw new IllegalArgumentException("The temperature is too hot!");
        }
        this.tempInCelsius = nuovaTemp;
    }
    public int celsius() {
        return tempInCelsius;
    }
    public double fahrenheit() {
        return tempInCelsius * 9.0 / 5.0 + 32.0;
    }
    public String tipo() {
        if (tempInCelsius <= 0) {
            return "molto freddo";
        } else if (tempInCelsius <= 18) {
            return "freddo";
        } else if (tempInCelsius <= 35) {
            return "gradevole";
        } else if (tempInCelsius <= 45) {
            return "caldo";
        } else {
            return "molto caldo";
        }
    }




}

class S9E2 { // preso dall'esercizio
    public static void main(String[] args) {
        Termometro t = new Termometro();
        t.misura(26);
        System.out.println("Temperatura in Celsius: " + t.celsius());
        System.out.println("Temperatura in Fahrenheit: " +
                t.fahrenheit());
        System.out.println("Tipo temperatura: " + t.tipo());
    }
}
