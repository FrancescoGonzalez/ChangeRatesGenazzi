package S3;

import java.util.Scanner;

class UtilityStringhe3 {
    static String invertiStringa(String s) {
        if (s == null) {
            throw new NullPointerException("String  is null");
        }
       return  new StringBuilder(s).reverse().toString();
    }

}

class ClienteUtilityStrnghe3 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Testo: ");
        String notInvertedStr = s.next();
        String invertedStr = UtilityStringhe3.invertiStringa(notInvertedStr);
        System.out.println("Invertita: " + invertedStr);

    }
}
