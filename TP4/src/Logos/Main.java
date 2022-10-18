package Logos;



public class Main
{
   
    public static void main(String args[])
    {
        //Personnage l = new ReneLaTaupe("Rene la Taupe");
        //l = new DecorateurChapeau(l,280,42);
        //l = new DecorateurLunettes(l,255,76);
        //l = new DecorateurCandy(l,441 , 202);
        //l = new DecorateurSmiley(l,260,210);

        //Personnage l =

        Personnage l2 = new CrazyFrog();
        l2 = new DecorateurChapeau(l2,280,42);
        l2 = new DecorateurLunettes(l2,255,76);
        l2 = new DecorateurCandy(l2,441 , 202);
        l2 = new DecorateurSmiley(l2,260,210);



        //l.getMyImage().display();  // Permet l'affichage dans une fenetre de l'image associee
        //l2.getMyImage().display();

    }
        
}
