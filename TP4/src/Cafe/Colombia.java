package Cafe;

/**
 * Classe correspondant a une boisson Cafe.Colombia
 * 
 */
public class Colombia extends Boisson {
	
	public Colombia(){
		description = " Cafe.Colombia";
	}
	
	/**
	 * @return prix de la boisson
	 */
	public double cout() {
		return 1.3;
	}

}
