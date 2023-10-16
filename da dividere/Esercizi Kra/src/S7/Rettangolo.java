package S7;




public class Rettangolo {
    private int lung = 1;
    private int largh = 1;

    private int perimetro = calculatePerimetro();
    public int getPerimetro() {
        return this.perimetro;
    }

    private int calculatePerimetro(){
        return (lung + largh) * 2;
    }
    public int getArea() {
        return lung * largh;
    }

    public void setLarghezza(int largh) {
        if (largh < 0) {
            throw new IllegalArgumentException("height cannot be less than 0");
        }
        this.largh = largh;
        this.perimetro = calculatePerimetro();
    }

    public void setLunghezza(int lung) {
        if (lung < 0) {
            throw new IllegalArgumentException("weight cannot be less than 0");
        }
        this.lung = lung;
        this.perimetro = calculatePerimetro();
    }
}

class ProvaRettangolo {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo();
        r.setLunghezza(5);
        System.out.println("Lunghezza: " + 5);
        r.setLarghezza(3);
        System.out.println("Larghezza: " + 3);
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Area: " + r.getArea());
    }
}
