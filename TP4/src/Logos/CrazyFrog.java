package Logos;

public class CrazyFrog extends Personnage{

    public CrazyFrog(String text) {


       setNomIm("img/CrazyFrog.jpg");
        setText(text);
        setPrix(1);
        setMyImage(new MyImage(getNomIm()));
        getMyImage().textOver(getText(), 200,50);

    }


}
