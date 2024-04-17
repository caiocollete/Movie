package com.caiocollete.modules;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class APIComunication {
    private String apiKey;

    public APIComunication(String apiKey){ this.apiKey = apiKey;}


    public List<Movie> request() throws IOException, InterruptedException, URISyntaxException {
        Gson gson = new Gson();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://imdb-top-100-movies.p.rapidapi.com/"))
                .header("X-RapidAPI-Key", this.apiKey) // use your key
                .header("X-RapidAPI-Host", "imdb-top-100-movies.p.rapidapi.com")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonBody = response.body(); // pega a string retornada apos chamar a API
        JsonArray json = JsonParser.parseString(jsonBody).getAsJsonArray(); // transforma a string em json

        //List<Movie> movie = gson.fromJson(json, new TypeToken<List<Movie>>() {}.getType());
        return gson.fromJson(json, new TypeToken<List<Movie>>() {}.getType()); // transforma o json em uma List<Movie> e retorna uma List<Movie>
    }
}
