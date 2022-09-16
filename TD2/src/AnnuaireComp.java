import java.util.HashMap;
import java.util.Set;

public class AnnuaireComp extends HashMap<String,Personne> {
    private String numeros;
    private Personne personne;

    public AnnuaireComp(){
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     */
    public void domaine() {
        Set<String> numeros = this.keySet();
        for (String numero : numeros) {
            System.out.println(numero);

        }
    }

    /**
     * affichage de l'ensemble des noms de l'annuaire (appelé aussi le domaine de
     * la table)
     *
     * @param nom
     * @return
     */
    public Personne acces(String numero) {
        return this.get(numero);

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
        this.putIfAbsent(nom, new Personne(nom, prenom));
    }

    /**
     * suppression d'une entrée de la table; si le nom n'existe pas, ne fait rien
     *
     * @param nom
     */
    public void suppression(String numero) {
        if (this.containsKey(numero))
            this.remove(numero);
    }

    /**
     * changement du numéro associé au nom donné en paramètre; si nom
     * n'existe pas, la méthode ne fait rien.
     *
     * @param nom
     */
    public void changement(String numero, String nom, String prenom) {
        if (this.containsKey(numero)) put(nom, new Personne(nom, prenom));
    }
}
