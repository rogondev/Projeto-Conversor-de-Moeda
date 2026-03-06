import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaMoeda {

    public Moeda buscaMoeda(String codigoMoeda) {

        HttpClient client = HttpClient.newHttpClient();
        String endereco = "https://v6.exchangerate-api.com/v6/467c1a2f38b04bef1b703000/latest/" + codigoMoeda;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);

        } catch (Exception e) {

            throw new RuntimeException("Não consegui obter os dados da moeda: " + e.getMessage());
        }




    }
}