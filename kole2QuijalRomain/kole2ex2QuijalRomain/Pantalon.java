/**
 * Décrivez votre classe Chemise ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pantalon extends Vetement
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    


    /**
     * Constructeur d'objets de classe Chemise
     */
    public Pantalon()
    {
        super();
    }

    public boolean repasser(int temperature) throws TemperatureException
    {
        if(this.temperature < temperature)
        {
            throw new TemperatureException(); 
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return "Identifiant : "+super.getIdentifiant()+" Temperature maximum  : "+super.getTemperature();
    }
    
  
    
}
