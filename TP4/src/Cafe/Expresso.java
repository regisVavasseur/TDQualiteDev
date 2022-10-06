package Cafe;

/**
 * Classe correspondant a une boisson Cafe.Colombia
 * 
 */
public class Expresso extends Boisson {
	
	public Expresso() {
		description = " Cafe.Expresso";
	}

	/**
	 * @return prix de la boisson
	 */
	public double cout() {
		return 1.95;
	}
	
}
