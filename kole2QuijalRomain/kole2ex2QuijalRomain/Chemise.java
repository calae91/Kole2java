
/**
 * Décrivez votre classe Chemise ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Chemise extends Vetement
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private boolean imprime;


    /**
     * Constructeur d'objets de classe Chemise
     */
    public Chemise(boolean imprime)
    {
        super();
        this.imprime = imprime;
    }

    public boolean repasser(int temperature) throws TemperatureException,PresenceEthiquetteException
    {
        if(this.temperature < temperature)
        {
            throw new TemperatureException(); 
        }
        if(this.imprime = true)
        {
            throw new PresenceEthiquetteException();
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return "Identifiant : "+super.getIdentifiant()+" Temperature maximum  : "+super.getTemperature()+
        " imprime  : "+this.getImprime();
    }
    
    public boolean getImprime()
    {
        return this.imprime;
    }
  
    
}
