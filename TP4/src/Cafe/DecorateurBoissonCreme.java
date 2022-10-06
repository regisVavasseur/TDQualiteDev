package Cafe;

public class DecorateurBoissonCreme extends DecorateurIngredient {

    /**
     * Constructeur
     *
     * @param boisson à décorer
     */
    public DecorateurBoissonCreme(Boisson boisson) {
        super(0.55, " Chantilly", boisson); //prix = 0.5 description="Chantilly"
    }


}


