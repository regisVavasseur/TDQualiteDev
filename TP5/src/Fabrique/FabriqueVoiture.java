package Fabrique;

import Vehicule.Vehicule;
import Vehicule.Voiture;

public class FabriqueVoiture implements FabriqueVehicule{
    @Override
    public Vehicule creerVehicule() {
        return new Voiture();
    }
}
