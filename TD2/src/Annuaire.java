import java.util.HashMap;

public class Annuaire extends HashMap<String, String> {
    private String noms;
    private String telephone;

    public Annuaire() {
    }

    public HashMap<String,String> domaine() {
        HashMap<String,String> res = new HashMap<String,String>();
        for (int i = 0; i < this.size(); i++) {
            res.clone();
        }
    }
}


