package Cafe;

/**
 * Classe permettant l'ajout de chantilly à une boisson 
 */
public class DecorateurBoissonChantilly extends DecorateurIngredient {
	
	/**
	 * Constructeur
	 * 
	 *  @param boisson à décorer
	 */
	public DecorateurBoissonChantilly(Boisson boisson) {
		super(0.5, " Chantilly", boisson); //prix = 0.5 description="Chantilly"
	}
	
	
}
