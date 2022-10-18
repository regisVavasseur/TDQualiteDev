package Simulation;

import Fabrique.FabriqueVehicule;
import Vehicule.Vehicule;

import java.util.Map;

public class Simulateur {
    private FabriqueVehicule fabriqueVehicule;

    // construire un simulateur à partir d'une fabrique de véhicules

    public Simulateur(FabriqueVehicule fabrique) {
        this.fabriqueVehicule = fabrique;
    }

    public Map<Vehicule,Integer> genererStats() {
        // générer des statistiques sur les véhicules
        Map<Vehicule,Integer> stats = null;
        for (int i = 0; i < 100 ; i++){
            Vehicule vehicule = fabriqueVehicule.creerVehicule();
            if (stats.containsKey(vehicule)){
                stats.put(vehicule, stats.get(vehicule) + 1);
            }else {
                stats.put(vehicule, 1);
            }
        }

    }

    public String ecrireStats() {
        // écrire les statistiques sur les véhicules

        return "";
    }
}
