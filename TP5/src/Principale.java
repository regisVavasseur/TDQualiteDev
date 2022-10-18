import Fabrique.FabriqueVehicule;
import Fabrique.FabriqueVoiture;
import Vehicule.Vehicule;

public class Principale {
    public static void main(String[] args) {
        FabriqueVehicule fabrique = new FabriqueVoiture();
        Vehicule vehicule = fabrique.creerVehicule();
    }
}
