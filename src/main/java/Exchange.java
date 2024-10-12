package Models;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {

    public Currency locateCurrency(String currencyOption, double currencyAmount) {
        // Construir la URL completa con el par de monedas
        String baseUrl = "https://v6.exchangerate-api.com/v6/b73e1a9700db3c2b247a8ff4/pair/";
        String fullUrl = baseUrl + currencyOption;

        // Crear el URI con la URL completa
        URI direccion = URI.create(fullUrl);

        // Crear el cliente HTTP y la solicitud
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviar la solicitud y procesar la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir la respuesta JSON en un objeto Currency
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("No se puede convertir", e);
        }
    }
}
