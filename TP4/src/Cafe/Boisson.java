package Cafe;

/**
 * Classe abstraite representant une boisson 
 * 
 */
public abstract class Boisson {
	
	/**
	 * Description de la  boisson 
	 * 
	 */
	protected String description = "Cafe.Boisson inconnue";
	
	
	/**
	 * @return la description de la boisson  
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * Classe abstraite 
	 * @return cout de la boisson
	 */
	public abstract double cout();

	public String toString(){
		return this.description + " : " + this.cout() + " euros";
	}
}
