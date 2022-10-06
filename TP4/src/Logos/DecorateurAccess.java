package Logos;

public abstract class DecorateurAccess extends Personnage{

    /**
     * Constructeur
     *
     */
    public DecorateurAccess(double p, String nomImAcces, Personnage personnage,int decalx,int decaly){
        this.setPrix(this.getPrix() + p);
        this.setMyImage(personnage.getMyImage());
        this.getMyImage().paintOver(nomImAcces, decalx,decaly);

    }


}
