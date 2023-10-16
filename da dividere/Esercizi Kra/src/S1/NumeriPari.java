package S1;

import java.util.Scanner;

public class NumeriPari {
    public static void main(String[] args) {
        printEven();
    }

    public static void printEven() {
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int n = scan.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nTotale: " + sum);
        System.out.print("\nRicominciare? ");
        if (scan.next().equals("y")) {
            printEven();
        }
    }
}
