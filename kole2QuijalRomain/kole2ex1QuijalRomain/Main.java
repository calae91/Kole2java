
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public  class Main
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public Main()
    {
        Candidat c1 = new Candidat("12","0123","Gaston","julien");
        Candidat c2 = new Candidat("16","0783","lea","soso");
        Candidat c3 = new Candidat("7","9123","Gaston","pierre");
        Candidat c4 = new Candidat("8","0134","emile","zola");
        Candidat c5 = new Candidat("19","9876","ivre","leo");
       
        Concours concours = new Concours();
        
        concours.ajoutCandidat(c1);
        concours.ajoutCandidat(c2);
        concours.ajoutCandidat(c3);
        concours.ajoutCandidat(c4);
        concours.ajoutCandidat(c5);
        
        concours.triNumero(concours);
        concours.afficherList();
        
        concours.triMoyenne(concours);
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
   
}
