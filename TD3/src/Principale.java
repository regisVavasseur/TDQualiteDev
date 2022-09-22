import java.io.IOException;

public class Principale {
    public static void main(String[] args) throws IOException {
        ListeIp listeIp ;

        listeIp = new ListeIp(true );
        listeIp.chargerFichier("logs.txt");
        System.out.println(listeIp);

        listeIp = new ListeIp(false);
        listeIp.chargerFichier("logs.txt");
        System.out.println(listeIp);


    }
}
