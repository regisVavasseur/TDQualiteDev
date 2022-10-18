package Fabrique;

import Vehicule.*;

public class FabriqueBus implements FabriqueVehicule{
    @Override
    public Vehicule creerVehicule() {
        return new Bus();
    }
}

