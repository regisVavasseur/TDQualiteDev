package Fabrique;

import Vehicule.*;

import java.util.Random;

public class FabriqueIntersection implements FabriqueVehicule{
    private double probaVoiture;
    private double probaPieton;
    private double probaByc;
    private double probaBus;

    public FabriqueIntersection() {
        this.probaVoiture = 80;
        this.probaPieton = 10;
        this.probaByc = 5;
        this.probaBus = 5;
    }

    public FabriqueIntersection(double probaVoiture, double probaPieton, double probaByc, double probaBus) {
        double condition = probaBus + probaByc + probaPieton + probaVoiture;
        if (condition != 100 || probaVoiture < 0 || probaPieton < 0 || probaByc < 0 || probaBus < 0) {
            throw new IllegalArgumentException("Les probabilités doivent être égales à 1");
        }else {
            this.probaVoiture = probaVoiture;
            this.probaPieton = probaPieton;
            this.probaByc = probaByc;
            this.probaBus = probaBus;
        }
    }

    public Vehicule creerVehicule(){

        double alea = Math.random() * 100;
        if (alea < probaVoiture) {
            return new Voiture();
        }else if (alea < probaVoiture + probaPieton) {
            return new Pieton();
        }else if (alea < probaVoiture + probaPieton + probaByc) {
            return new Bicyclette();
        }else {
            return new Bus();
        }
    }


}
