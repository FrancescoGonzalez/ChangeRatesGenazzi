package ch.goca.school.currencyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RemoteCurrentServicePort {


    private final URI remoteServiceBaseAddress;
    private final String apiKey;

    public RemoteCurrentServicePort(URI remoteServiceBaseAddress, String apiKey) {
        this.remoteServiceBaseAddress = remoteServiceBaseAddress;
        this.apiKey = apiKey;
    }

    ConversionServiceResponse callConvertionService(String from, String to, double amount){
        // guard condition

        URI actualURI = buildActualURI(from,to, amount);
        // ConversionServiceResponse response =  call(actualURI);
        return null;//response;
    }

    private URI buildActualURI(String from, String to, double amount){
        // build actual url

        return null;

        
    }
    /*
    private ConversionServiceResponse call(URI uri){

       HttpRequest  request =  HttpRequest
                .newBuilder(uri).GET().build();
       HttpClient client =  HttpClient.newHttpClient();
       client.send(request, Http

       GUARDARE https://www.baeldung.com/java-9-http-client

    }

     */

}


class ConversionServiceResponse{}