import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TableauEntier implements Iterable<Integer> {

    private int[][] tab;


    public TableauEntier(int[][] tab) {
        this.tab = tab;
    }

    public int valeurA(int l, int c){
        return tab[l][c];
    }

    public int getLargeur(){
        return tab[0].length;
    }

    public int getHauteur(){
        return tab.length;
    }

    public ParcoursLigne parcoursLigne(){
        return new ParcoursLigne(this);
    }

    public ParcoursColonne parcoursColonne(){
        return new ParcoursColonne(this);
    }

    public ParcoursZigZag parcoursZigZag(){
        return new ParcoursZigZag(this);
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
