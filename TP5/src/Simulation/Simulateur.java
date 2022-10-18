package Simulation;

import Fabrique.FabriqueVehicule;
import Vehicule.Vehicule;

import java.util.HashMap;
import java.util.Map;

public class Simulateur {
    private FabriqueVehicule fabriqueVehicule;
    //private Map<String, Integer> stats;

    // construire un simulateur à partir d'une fabrique de véhicules

    public Simulateur(FabriqueVehicule fabrique) {
        this.fabriqueVehicule = fabrique;

    }

    private Map<String,Integer> genererStats() {
        // générer des statistiques sur les véhicules
        Map<String,Integer> stats = new HashMap<>();
        for (int i = 0; i < 100 ; i++){
            Vehicule vehicule = fabriqueVehicule.creerVehicule();
            if (stats.containsKey(vehicule.getType())){
                stats.put(vehicule.getType(), stats.get(vehicule.getType()) + 1);
            }else {
                stats.put(vehicule.getType(), 1);
            }
        }
        return stats;
    }

    public String ecrireStats() {
        // écrire les statistiques sur les véhicules

        String text = "";
        for (Map.Entry<String, Integer> entry : genererStats().entrySet()) {
            text += entry.getKey().toString() + " : " + entry.getValue() + " \n";
        }
        return text;
    }
}
