import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class ParcoursTest {

    private TableauEntier tab;

    @BeforeEach
    void setUp() {
        int[][] t = {{1,2}, {3,4}};
        tab = new TableauEntier(t);
    }



    @Test
    public void parcoursLigneTest(){
        Iterator<Integer> it = tab.parcoursLigne();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertTrue(it.hasNext());
        assertEquals(3, it.next());
        assertTrue(it.hasNext());
        assertEquals(4, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void parcoursColonneTest(){
        Iterator<Integer> it = tab.parcoursColonne();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
        assertTrue(it.hasNext());
        assertEquals(3, it.next());
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertTrue(it.hasNext());
        assertEquals(4, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void parcoursZigZagTest(){
        Iterator<Integer> it = tab.parcoursZigZag();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertTrue(it.hasNext());
        assertEquals(4, it.next());
        assertTrue(it.hasNext());
        assertEquals(3, it.next());
        assertFalse(it.hasNext());
    }


}
