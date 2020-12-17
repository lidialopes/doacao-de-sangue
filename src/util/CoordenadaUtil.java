package util;

import model.*;
import dao.DoadorDAO;
import org.json.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class CoordenadaUtil {
    private static final double EARTH_RADIUS_KM = 6371;

     public double calculaDistanciaEntre(HashMap<String, Double> coordenadaDoador,
            HashMap<String, Double> coordenadaReceptor) {

        double latDoador = Math.toRadians(coordenadaDoador.get("lat"));
        double latReceptor = Math.toRadians(coordenadaReceptor.get("lat"));

        double deltaLongitudeInRad = Math.toRadians(coordenadaDoador.get("lon")
                - coordenadaDoador.get("lon"));

        return Math.acos(Math.cos(latDoador) * Math.cos(latReceptor)
                * Math.cos(deltaLongitudeInRad) + Math.sin(latDoador)
                * Math.sin(latReceptor))
                * EARTH_RADIUS_KM;
    }
    
    public HashMap<String, Double> addressToCoordinates(String endereco){
        String uri = "https://nominatim.openstreetmap.org/search?format=json&q=Hospital+" + endereco.replace(" ", "+");

        System.out.println(uri);
        
        JSONObject res = sendGet(uri);
        
        HashMap<String, Double> coordinates = new HashMap<>();
        coordinates.put("lat", res.getDouble("lat"));
        coordinates.put("lon", res.getDouble("lon"));
        
        return coordinates;
    }
    
    private JSONObject sendGet(String uri){
        JSONObject res = new JSONObject();
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            
            System.out.println(uri);
            System.out.println(request);
            
            
            String body = response.body();
            if(body.charAt(0) != '{')
                body = body.substring(1, body.length()-1);

            res = new JSONObject(body);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
