package client;
import java.util.List;
import service.BanqueService;
import service.BanqueServiceService;
import service.Compte;

public class ClientWS {

    public static void main(String[] args) {
        // Créer une instance du service web
        BanqueServiceService banqueServiceService = new BanqueServiceService();
        BanqueService banqueServicePort = banqueServiceService.getBanqueServicePort();

        // Tester la conversion de devise
        double montantTND = 100.0;
        double montantEuro = banqueServicePort.conversionEuroTND(montantTND);
        System.out.println("Montant converti : " + montantEuro);

        // Tester l'obtention de la liste des comptes
        List<Compte> listComptes = banqueServicePort.getComptes();

        // Affichage de la liste des comptes
        System.out.println("Liste des comptes : ");
        int i=1;
        for (Compte x:listComptes) {
            System.out.println("Compte "+i+" : "+"code : "+x.getCode()+" solde : "+x.getSolde());
            i++;
        }
    }
}
