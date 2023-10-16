package ch.goca.school.currencyconverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyService {
    private final RemoteCurrentServicePort remoteService;

    public CurrencyService(RemoteCurrentServicePort remoteService) {
        this.remoteService = remoteService;
    }

    public double convertAmount(String from, String to, double amount){
        isValid(from);
        isValid(to);

        ConversionServiceResponse c = remoteService.callConvertionService(from.toUpperCase(), to.toUpperCase());

        return (amount / c.getValueFrom()) * c.getValueTo();
    }

    public String getFullName(String currency) {
        isValid(currency);

        ConversionServiceResponse c = remoteService.callConvertionService(currency.toUpperCase());
        if (c.getFullName(currency) == null) {
            throw new InvalidCurrencyException("the currency " + currency + " doesn't exist");
        }

        return c.getFullName(currency);

    }

    public Map<String, Double> convertMoreAmounts(String from, String... amounts) { // calls convertAmounts(); for every amount, and add the result to an array
        Map<String, Double> result = new HashMap<>();
        isValid(from);

        for (String amount : amounts) {
            isValid(amount);
            result.put(amount, convertAmount(from, amount, 1));
        }

        return result;

    }

    public void isValid(String currency) { // if is NOT valid it will throw an exception
        if (currency.length() != 3) {
            throw new InvalidCurrencyException("The currency " + currency + " needs to be of 3 letters to be valid");
        }
    }
}
