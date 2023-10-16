package ch.goca.school.currencyconverter;

import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        CurrencyService c = new CurrencyService(new RemoteCurrentServicePort("24aa603ac83ad85bfcd29cd112e7ee36"));

        Map<String, Double> m = c.convertMoreAmounts("chf", "usd", "eur", "cop", "cad");

        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        System.out.println(c.getFullName("STD"));


        System.out.println(c.convertAmount("CHF", "EUR", 1200.9));
    }
}
