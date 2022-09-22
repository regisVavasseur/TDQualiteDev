import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnnuaureCompTest {
    private AnnuaireComp annuaire;

    @BeforeEach
    void setUp() {
        this.annuaire = new AnnuaireComp();
        annuaire.adjonction("0612345678", "toto", "titi");
        annuaire.adjonction("0123456789", "titi", "tata");
        annuaire.adjonction("1234567890", "tata", "tutu");
    }


    @Test
    void acces() {

        Personne personne = new Personne("toto", "titi");
        // méthode à tester
        annuaire.acces("toto", "titi");
        // validation des résultats
        assertEquals("0612345678", annuaire.acces("toto", "titi"), "ça devrait être le même numéro");

    }


    @Test
    void suppression() {

        annuaire.suppression("toto", "titi");
        // validation des résultats
        assertFalse(annuaire.containsKey("toto"));


    }

    @Test
    void changement() {
          // méthode à tester
        annuaire.changement("toto", "titi", "1234567890");
        Personne personne = new Personne("toto", "titi");
        // validation des résultats
        assertTrue(annuaire.containsKey(personne));
        assertEquals("1234567890", annuaire.acces("toto", "titi"));
    }

    @Test
    void changementNotExist() {
          // méthode à tester
        annuaire.changement("TEST", "TEST", "1234");
        Personne personne = new Personne("TEST", "TEST");
        // validation des résultats
        assertFalse(annuaire.containsKey(personne));
    }


}
