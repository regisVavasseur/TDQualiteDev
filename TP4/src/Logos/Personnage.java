package Logos;

public abstract class Personnage {
    /**
     * Chemin d'acces au fichier
     * contenant l'image de fond du logo
     */

    private MyImage myImage;
    private String nomIm;

    /**
     * Prix du logo
     */
    private double prix;




    public MyImage getMyImage() {
        return myImage;
    }

    public void setMyImage(MyImage myImage) {
        this.myImage = myImage;
    }

    public String getNomIm() {
        return nomIm;
    }

    public void setNomIm(String nomIm) {
        this.nomIm = nomIm;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
