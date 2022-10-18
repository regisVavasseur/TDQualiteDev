package Vehicule;

public abstract class Vehicule {

    private String type;
    private double vitesseMax;
    private double vitesse;

    public Vehicule(String type, double vitesseMax) {
        this.type = type;
        this.vitesseMax = vitesseMax;
    }

    public void accelerer(double vitesse) {
        this.vitesse += vitesse;
    }

    public void decelerer(double vitesse) {
        this.vitesse -= vitesse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
}
