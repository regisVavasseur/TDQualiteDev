public class main {

    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.adjonction("toto","0612345678");
        annuaire.adjonction("titi","0123456789");
        annuaire.adjonction("tata","0123456789");
        annuaire.adjonction("tutu","0123456789");
        annuaire.adjonction("tete","0123456789");

        annuaire.domaine();
        System.out.println(annuaire.acces("toto"));



    }
}
