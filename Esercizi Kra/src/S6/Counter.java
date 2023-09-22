package S6;

public class Counter {
    private int v;

    Counter(int v) {
        if (v < 0) {
            throw new IllegalArgumentException("\"v\" cannot be less than 0");
        }
        this.v = v;
    }
    Counter(){
        this(1);
    }
    public void reset() {
        this.v = 0;
    }
    public void inc() {
        this.v++;
    }
    public void dec() {
        this.v--;
    }
    public int getV() {
        return this.v;
    }
}

class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(20);

        for (int i = 0; i < 10; i++) {
            System.out.print(c1.getV() + " ");
            c1.inc();
        }
        c1.reset();
        System.out.println(c1.getV());

        for (int i = 20; i > 9; i--) {
            System.out.print(c2.getV() + " ");
            c2.dec();
        }
        c2.reset();
        System.out.println(c1.getV());
    }
}
