public class ParcoursLigne extends Parcours{

        public ParcoursLigne(TableauEntier tab) {
            super(tab);
        }

        @Override
        public void suivant() {
            if(c < tab.getLargeur() - 1){
                c++;
            }else{
                l++;
                c = 0;
            }
        }

        @Override
        public boolean hasNext() {
            return nbParcourus < tab.getLargeur() * tab.getHauteur();
        }

}
