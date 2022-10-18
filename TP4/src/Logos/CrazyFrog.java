package Logos;

public class CrazyFrog extends Personnage {

    public CrazyFrog() {
        this.setNomIm("img/CrazyFrog.png");
        this.setPrix(1);
        this.setMyImage(new MyImage(getNomIm()));
    }


}
