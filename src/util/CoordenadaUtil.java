package util;

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
}
