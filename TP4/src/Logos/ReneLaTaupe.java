package Logos;


public class ReneLaTaupe extends Personnage{

    public ReneLaTaupe(String text) {


        setNomIm("img/Taupe.jpg");
        setText(text);
        setPrix(1);
        setMyImage(new MyImage(getNomIm()));
        getMyImage().textOver(getText(), 200,50);


    }
}
