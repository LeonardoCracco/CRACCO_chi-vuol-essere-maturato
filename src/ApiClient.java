import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ApiClient {
    private final HttpClient client  = HttpClient.newHttpClient();

    public String fetchQuestions(int amount, String type, String difficulty){
        String url = "https://opentdb.com/api.php?amount=10&category=21&difficulty=easy&type=multiple";
        HttpRequest request = HttpRequest.newBuilder()
                .header("content-Type", "application/json")
                .uri(java.net.URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response;
        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        }catch (IOException | InterruptedException e){
            return  "errore nella richiesta API";
        }
        return response.body();
    }
}
