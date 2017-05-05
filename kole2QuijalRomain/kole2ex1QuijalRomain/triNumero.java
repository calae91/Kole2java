import java.util.*;
/**
 * Décrivez votre classe triAlphabet ici.
 *
 * @author (Calae)
 * @version (1.0)
 */
class triNumero implements Comparator<Candidat> {
    
    public int compare(Candidat a, Candidat b) {
        
        return a.getNumero().compareToIgnoreCase(b.getNumero());
    }
}
