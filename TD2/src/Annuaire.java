import java.util.HashMap;
import java.util.Set;

public class Annuaire extends HashMap<String, String> {
    private String noms;
    private String telephone;

    public Annuaire() {
    }

    public Set<String> domaine() {
        return this.keySet();
    }


}


