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

    private String text;

    /*public Personnage(String text, String nomIm, double prix) {
        this.nomIm = nomIm;
        this.prix = prix;
        this.text = text;
        this.myImage = new MyImage(nomIm);
        this.myImage.textOver(text, 100,100);

    }*/

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
