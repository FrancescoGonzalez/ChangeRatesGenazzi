package ch.goca.school.currencyconverter;

public class CurrencyService {
    private RemoteCurrentServicePort remoteService;

    public CurrencyService(RemoteCurrentServicePort remoteService) {
        this.remoteService = remoteService;
    }

    public double convertAmount(String from, String to, double amount){
        return 0;
    }
}
