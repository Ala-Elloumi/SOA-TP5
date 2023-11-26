package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        // URL du service Web
        String url = "http://localhost:8084/";

        // Publier le service web en specifiant l'URL du service et une instance du service web
        // On utilise la méthode statique publish de la classe Endpoint
        Endpoint.publish(url, new BanqueService());

        // Affichage pour tester l'execution du classe serveur
        System.out.println("Service web publié à l'adresse : " + url);

    }
}
