public class ParcoursZigZag extends Parcours{

    public ParcoursZigZag(TableauEntier tab) {
        super(tab);
    }

    @Override
    public void suivant() {

        if(l == 0 && c < tab.getLargeur() - 1){
            c++;
        }else if(l == 0 && c == tab.getLargeur() - 1){
            l++;
        }else if(l < tab.getHauteur() - 1 && c == 0){
            l++;
        }else if(l == tab.getHauteur() - 1 && c < tab.getLargeur() - 1){
            c++;
        }else if(l < tab.getHauteur() - 1 && c == tab.getLargeur() - 1){
            l++;
        }else if(l == tab.getHauteur() - 1 && c == tab.getLargeur() - 1){
            c--;
        }else if(l == tab.getHauteur() - 1 && c > 0){
            c--;
        }else if(l > 0 && c == 0){
            l--;
        }else if(l > 0 && c > 0){
            l--;
            c--;
        }
    }

    @Override
    public boolean hasNext() {
        return nbParcourus < tab.getLargeur() * tab.getHauteur();
    }

}
