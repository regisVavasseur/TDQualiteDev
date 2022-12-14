import java.util.HashMap;
import java.util.Set;

public class Annuaire extends HashMap<String, String> {
    private String noms;
    private String telephone;


    public Annuaire() {
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     */
    public void domaine() {
        Set<String> noms = this.keySet();
        for (String nom : noms) {
            System.out.println(nom);

        }
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     *
     * @param nom
     * @return
     */
    public String acces(String nom) {
        return this.get(nom);

    }

    /**
     * adjonction d'un couple (nom, numéro) dans l'annuaire; le nom ne doit pas
     * déjà être une entrée de la table; il le devient après l'adjonction; si nom existe déjà, la
     * méthode ne fait rien.
     *
     * @param nom
     * @param numero
     */
    public void adjonction(String nom, String numero) {
        this.putIfAbsent(nom, numero);
    }

    /**
     * suppression d'une entrée de la table; si le nom n'existe pas, ne fait rien
     *
     * @param nom
     */
    public void suppression(String nom) {
        if (this.containsKey(nom))
            this.remove(nom);
    }

    /**
     * changement du numéro associé au nom donné en paramètre; si nom
     * n'existe pas, la méthode ne fait rien.
     *
     * @param nom
     */
    public void changement(String nom, String numero) {
        if (this.containsKey(nom)) put(nom, numero);
    }


}


