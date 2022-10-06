package Logos;


public class ReneLaTaupe{
	/**
     * Chemin d'acces au fichier
     * contenant l'image de fond du logo
     */
    protected String nomIm;
    
    /**
     * Prix du logo
     */
    protected double prix;
    
    /**
     * Constructeur
     */
    public ReneLaTaupe() {
        nomIm = "img/Taupe.jpg";
        prix=3.65;
    }
    
    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    public MyImage getLogo(){
        return new MyImage(nomIm);
    }
    
    /**
     * @return le prix du logo
     */
    public double combienCaCoute(){
        return prix;
    }
}
