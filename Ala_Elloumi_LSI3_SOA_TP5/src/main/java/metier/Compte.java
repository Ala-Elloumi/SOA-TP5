package metier;

//les importations nécessaires
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;
    public Compte()
    {
        this.code=0;
        this.solde=0.0;
        this.dateCreation=null;
    }
    public Compte(int code, double solde, Date dateCreation)
    {
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    public int getcode()
    {
        return code;
    }
    public void setcode(int c)
    {
        code=c;
    }
    public double getsolde()
    {
        return solde;
    }
    public void setsolde(double s)
    {
        solde=s;
    }
    public Date getdateCreation()
    {
        return dateCreation;
    }
    public void setdateCreation(Date d)
    {
        dateCreation=d;
    }
    @Override
    public String toString()
    {
        return "code : "+code+" solde : "+solde+" date : "+dateCreation;
    }
}
