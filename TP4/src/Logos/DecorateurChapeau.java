package Logos;

public class DecorateurChapeau extends DecorateurAccess{

    //ajoute le chapeau à la taupe

    public DecorateurChapeau(Personnage personnage, int decalx, int decaly){
       super(0.5, "img/Chapeau.png", personnage, decalx, decaly);

    }


}

