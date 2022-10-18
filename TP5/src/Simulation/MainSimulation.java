package Simulation;

import Fabrique.FabriqueIntersection;
import Fabrique.FabriqueVehicule;
import Fabrique.FabriqueVoiture;

public class MainSimulation {

    public static void main(String[] args) {
        FabriqueVehicule fabrique = new FabriqueIntersection();
        Simulateur simulateur = new Simulateur(fabrique);

        System.out.println(simulateur.ecrireStats());
    }
}
