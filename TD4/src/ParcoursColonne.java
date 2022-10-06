public class ParcoursColonne extends Parcours{

    public ParcoursColonne(TableauEntier tab) {
        super(tab);
    }

    @Override
    public void suivant() {
        if(l < tab.getHauteur() - 1){
            l++;
        }else{
            c++;
            l = 0;
        }
    }

    @Override
    public boolean hasNext() {
        return nbParcourus < tab.getLargeur() * tab.getHauteur();
    }

}
