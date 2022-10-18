package Logos;

public class DecorateurChapeau extends DecorateurAccess{

    //ajoute le chapeau à la taupe

    public DecorateurChapeau(Personnage personnage){
       super(0.5, personnage,"img/Chapeau.png",280,42);

    }


    @Override
    public MyImage getMyImage() {
        MyImage myImage = new MyImage(this.getNomIm());
        //paintover
        return myImage;
    }
}

