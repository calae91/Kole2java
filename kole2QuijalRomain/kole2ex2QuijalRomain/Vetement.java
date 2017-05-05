
/**
 * Décrivez votre classe abstraite Vetement ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Vetement
{
    // variable d'instance - remplacez cet exemple par le vôtre
    String identifiant;
    int temperature;
    
    public int getTemperature(){
        return this.temperature;
    }
    public String getIdentifiant(){
        return this.identifiant;
    }

}
