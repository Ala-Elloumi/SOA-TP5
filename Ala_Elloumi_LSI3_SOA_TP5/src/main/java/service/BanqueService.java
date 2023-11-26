package service;

//les importations nécessaires
import metier.Compte;
import java.util.Date;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "BanqueService")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroTND")
    public double conversion(@WebParam (name="montant") double montant)
    {
        return montant*3.38;
    }
    @WebMethod (operationName ="getComptes")
    public List<Compte> getComptes()
    {
        return List.of (
                new Compte(1111,2400.00,new Date()),
                new Compte(2222,5200.00,new Date()),
                new Compte(3333,1800.00,new Date()),
                new Compte(4444,3600.00,new Date())
        );
    }
}
