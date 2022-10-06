import java.util.HashMap;
import java.util.Set;

public class AnnuaireComp extends HashMap<Personne,String> {
    private String numeros;
    private Personne personne;

    public AnnuaireComp(){
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     */
    public void domaine() {
        Set<Personne> personnes = this.keySet();
        for (Personne personne : personnes) {
            System.out.println(personne);

        }
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     *
     * @param nom
     * @return
     */
    public String acces(String nom, String prenom) {
        Personne personne = new Personne(nom, prenom);
        return this.get(personne);

    }

    /**
     * adjonction d'un couple (nom, numéro) dans l'annuaire; le nom ne doit pas
     * déjà être une entrée de la table; il le devient après l'adjonction; si nom existe déjà, la
     * méthode ne fait rien.
     *
     * @param nom
     * @param numero
     */
    public void adjonction(String numero, String nom, String prenom) {
        this.putIfAbsent(new Personne(nom, prenom),numero);
    }

    /**
     * suppression d'une entrée de la table; si le nom n'existe pas, ne fait rien
     *
     * @param nom
     */
    public void suppression(String nom,String prenom) {
        Personne personne = new Personne(nom, prenom);
        if (this.containsKey(personne))
            this.remove(personne);
    }

    /**
     * changement du numéro associé au nom donné en paramètre; si nom
     * n'existe pas, la méthode ne fait rien.
     *
     * @param nom
     */
    public void changement(String prenom,String nom, String numero) {
        Personne personne = new Personne(nom, prenom);
        if (this.containsKey(personne)) put(personne,numero);
    }


}
