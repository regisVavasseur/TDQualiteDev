import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListeIp {

    private Set<AdresseIp> ips;

    public ListeIp(boolean trie) {
        this.ips = trie ? new TreeSet<>() : new HashSet<>();
    }

    public void chargerFichier(String name) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line = br.readLine();
        while(line != null){
            String[] strings = line.split(" ");
            ips.add(new AdresseIp(strings[0]));
            line = br.readLine();
        }

    }


    @Override
    public String toString() {
        return "ListeIp{" +
                "ips=" + ips +
                '}';
    }
}
