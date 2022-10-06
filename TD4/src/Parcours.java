import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer> {

    protected TableauEntier tab;
    protected int l;
    protected int c;
    protected int nbParcourus;

    public Parcours(TableauEntier tab) {
        this.tab = tab;
        this.l = 0;
        this.c = 0;
        this.nbParcourus = 0;
    }

    public abstract void suivant();

    @Override
    public Integer next() {
        Integer valeureCourante = tab.valeurA(l, c);
        suivant();
        nbParcourus++;
        return valeureCourante;
    }
}
