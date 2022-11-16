package cursos.curso03.desafios.desafio_13_10_2022;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class desafio02_ClienteWebHTTP {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        String url = JOptionPane.showInputDialog(null, "Digite uma url: ");
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }
}
