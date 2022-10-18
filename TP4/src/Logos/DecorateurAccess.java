package Logos;

public abstract class DecorateurAccess extends Personnage{
    private Personnage personnage;

    /**
     * Constructeur
     *
     */
    public DecorateurAccess(double p, Personnage personnage, String nomIm, int decalx, int decaly) {
        this.personnage = personnage;
        this.setPrix(this.getPrix() + p);
        this.setMyImage(personnage.getMyImage());


    }

    @Override
    public abstract MyImage getMyImage();
}
