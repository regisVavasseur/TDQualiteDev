package Fabrique;

import Vehicule.Vehicule;
import Vehicule.Pieton;

public class FabriquePieton implements FabriqueVehicule{
    @Override
    public Vehicule creerVehicule() {
        return new Pieton();
    }
}
