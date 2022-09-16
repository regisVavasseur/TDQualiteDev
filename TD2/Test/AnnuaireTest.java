import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnuaireTest {
    private Annuaire annuaire;

    @BeforeEach
    void setUp(){
        annuaire = new Annuaire();
        annuaire.adjonction("toto","0612345678");
    }

    @Test
    void accesExist() {
        // méthode à tester
        String numero = annuaire.acces("toto");
        // validation des résultats
        assertEquals("0612345678",numero,"ça devrait être le même numéro");
    }

    @Test
    void accesNotExist() {

        // méthode à tester

        // validation des résultats
        assertNull(annuaire.acces("Didier"),"le nom ne devrait pas être dans le hashMap");
    }

    @Test
    void adjonction() {
        // méthode à tester
        annuaire.adjonction("titi","0123456789");
        // validation des résultats
        assertTrue(annuaire.containsKey("titi"));
    }

    @Test
    void suppression() {
        // méthode à tester
        annuaire.suppression("toto");
        // validation des résultats
        assertFalse(annuaire.containsKey("toto"));
    }

    @Test
    void changement() {
        // méthode à tester
        annuaire.changement("toto","1234");
        // validation des résultats
        assertEquals("1234",annuaire.acces("toto"));
    }

    @Test
    void changementNotExist(){
        // méthode à tester
        annuaire.changement("titi","1234");
        // validation des résultats
        assertFalse(annuaire.containsKey("titi"));
        assertEquals("0612345678", annuaire.acces("toto"));
    }
}