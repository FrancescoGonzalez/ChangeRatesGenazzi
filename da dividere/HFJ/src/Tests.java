import javax.crypto.SealedObject;
import java.util.Calendar;

public class Tests {

    int a, b, c;

    public Tests (int a, int b, int c) {
        this.a = a; this.b = b; this.c = c;

    }

    public static void main(String[] args) {
        Tests t1 = new Tests(1, 2, 3);
        System.out.println(t1.a);
        Tests t2 = t1;
        t1.a = 0;
        System.out.println(t2.a);
    }
}
