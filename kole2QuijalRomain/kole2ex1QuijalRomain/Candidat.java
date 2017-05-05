
/**
 * Décrivez votre classe Candidat ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Candidat
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String moyenne;
    private String numero_anonyme;
    private String nom;
    private String prenom;

    /**
     * Constructeur d'objets de classe Candidat
     */
    public Candidat(String moyenne, String numero_anonyme, String nom,String prenom)
    {
        this.moyenne = moyenne;
        this.numero_anonyme = numero_anonyme;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getMoyenne()
    {
        return this.moyenne;
    }
    public String getNumero()
    {
        return this.numero_anonyme;
    }

}
