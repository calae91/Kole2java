import java.util.*;
import java.util.Collection.*;
/**
 * Décrivez votre classe Concours ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Concours
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Candidat> candidats;

    /**
     * Constructeur d'objets de classe Concours
     */
    public Concours()
    {
        this.candidats = new ArrayList<Candidat>();
    }
    
    public int triMoyenne(Concours c)
    {
        Collections.sort(c.candidats,new triMoyenne());
        int i = 1;
        String x="";
        for(Candidat Cand:this.candidats)
        {
            if(i>=3){
                System.out.println(c);
                return 1;
            }
            x+= Cand.getMoyenne() + " ";
            i += 1;
        }
        return 0;
    }

   
    public void triNumero(Concours c)
    {
        Collections.sort(c.candidats,new triNumero());
    }
    
    public void ajoutCandidat(Candidat c)
    {
        this.candidats.add(c);
    }
    public String afficherList()
    {
        String c = "";
     for(Candidat Cand:this.candidats)
     {
        c+= Cand.getNumero() + "+";
    }
    System.out.println(c);
    return c;
    }
    
    

}
