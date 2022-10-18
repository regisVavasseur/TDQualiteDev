package Fabrique;

import Vehicule.*;

public class FabriqueBicyclette implements FabriqueVehicule{
    @Override
    public Vehicule creerVehicule() {
        return new Bicyclette();
    }
}

