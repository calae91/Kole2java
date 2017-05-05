import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe dressing ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Dressing
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Vetement> vetements;

    /**
     * Constructeur d'objets de classe dressing
     */
    public Dressing()
    {
        this.vetements= new ArrayList();
    }
    /**
     * ajoute un vetement
     */
    public void ajouterVetement(Vetement vetement)
    {
        if(vetement!=null)
            this.vetements.add(vetement);
    }
    
    public void afficherVetements()
    {
        List<Vetement> vetements = new ArrayList();
        String c = "";
        for(Vetement v:this.vetements)
        {
            c += v + "\n";
        }
        System.out.println(c);

    }
}