import java.util.Iterator;

public class main {

    public static void main(String[] args) {
        int[][] t = {{1,2},{3,4}};
        TableauEntier tab = new TableauEntier(t);

        System.out.println("Parcours ligne");
        Iterator<Integer> it = tab.parcoursLigne();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Parcours colonne");
        it = tab.parcoursColonne();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Parcours zigzag");
        it = tab.parcoursZigZag();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Integer i : tab) {
            System.out.println(i);

        }


    }
}
