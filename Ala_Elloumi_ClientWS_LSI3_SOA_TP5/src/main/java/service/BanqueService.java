
package service;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroTND", targetNamespace = "http://service/", className = "service.ConversionEuroTND")
    @ResponseWrapper(localName = "conversionEuroTNDResponse", targetNamespace = "http://service/", className = "service.ConversionEuroTNDResponse")
    @Action(input = "http://service/BanqueService/conversionEuroTNDRequest", output = "http://service/BanqueService/conversionEuroTNDResponse")
    public double conversionEuroTND(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://service/", className = "service.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://service/", className = "service.GetComptesResponse")
    @Action(input = "http://service/BanqueService/getComptesRequest", output = "http://service/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

}