package ch.goca.school.currencyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RemoteCurrentServicePort {

    private final String apiKey;

    public RemoteCurrentServicePort(String apiKey) {
        this.apiKey = apiKey;
    }

    ConversionServiceResponse callConvertionService(String from, String to){

        URI actualURI = buildActualURI(from,to, true);
        return call(actualURI, from, to);
    }

    ConversionServiceResponse callConvertionService(String currency){

        URI actualURI = buildActualURI(currency, "", false);
        return call(actualURI);
    }

    private URI buildActualURI(String from, String to, boolean convert) {
        try {
            String uri;
            if (convert) {
                uri = "http://data.fixer.io/api/latest?access_key=" + apiKey + "&symbols=" + from + "," + to;
            } else {
                uri = "http://data.fixer.io/api/symbols?access_key=" + apiKey;

            }
            return new URI(uri);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        
    }
    private ConversionServiceResponse call(URI uri, String from, String to){
        try {
            HttpRequest request = HttpRequest.newBuilder(uri) //crea la richiesta
                    .GET()
                    .build();
            HttpResponse<String> response = HttpClient.newBuilder() //gestisce e ritorna la risposta
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new ConversionServiceResponse(response.body(), from, to);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private ConversionServiceResponse call(URI uri){
        try {
            HttpRequest request = HttpRequest.newBuilder(uri) //crea la richiesta
                    .GET()
                    .build();
            HttpResponse<String> response = HttpClient.newBuilder() //gestisce e ritorna la risposta
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new ConversionServiceResponse(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}