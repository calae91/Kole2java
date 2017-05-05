import java.util.*;
/**
 * Décrivez votre classe triAlphabet ici.
 *
 * @author (Calae)
 * @version (1.0)
 */
class triMoyenne implements Comparator<Candidat> {
    
    public int compare(Candidat a, Candidat b) {
        
        return a.getMoyenne().compareToIgnoreCase(b.getMoyenne());
    }
}
