import java.util.ArrayList;
import java.util.List;

public class Primes {

    public static void main(String[] args) {
        System.out.println(primes(20));
    }
    public static List<Integer> primes (int max) {
        List<Integer> primes = new ArrayList<>();
        boolean isPrime = true;

        if (max < 0) {
            primes.add(-1);
            return primes;
        }


        for (int i = 2; i <= max; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0 && !(j == 1 || j == i)) {
                    isPrime = false;
                }

            }
            if (isPrime) {
                primes.add(i);
            } else {
                isPrime = true;
            }
        }

        return primes;
    }

    public static boolean isPrime (int number) {
        List<Integer> primes = primes(number);
        return primes.contains(number);
    }
}