package src;

public class Ropa {
	private boolean isMojada;
	private boolean isSucia;
	private String color;
	private final int talla;
	
	/**
	 * Public base constructor que deja los valores
	 * de isMojado e isSucio a false por defecto
	 * @param color
	 * @param talla
	 */
	public Ropa(String color, int talla) {
		this(color, talla, false, false);
	}
	
	/**
	 * Public constructor para todos los campos
	 * @param color
	 * @param talla
	 * @param isMojada
	 * @param isSucia
	 */
	public Ropa(String color, int talla, boolean isMojada, boolean isSucia) {
		this.talla = talla;
		this.color = color;
		this.isMojada = isMojada;
		this.isSucia = isSucia;
		
		System.out.println("La camiseta es creada");
	}
	
	/**
	 * Metodo que cambia el estado de isMojada
	 * por el parametro
	 * @param mojada
	 */
	public void setMojada(boolean mojada) {
		System.out.println("La prenda cambia de mojado a seco o viceversa");
		this.isMojada = mojada;
	}
	
	/**
	 * Metodo que cambia el estado de isSucia
	 * por el parametro
	 * @param sucia
	 */
	public void setSucia(boolean sucia) {
		System.out.println("La prenda cambia de sucio a limpio o viceversa");
		this.isSucia = sucia;
	}
	
	/**
	 * Metodo que recibe un parametro para 
	 * cambiar el color de la ropa
	 * @param color
	 */
	public void teñir(String color) {
		System.out.println("La prenda cambia de color a " + color);
		this.color = color;
	}
	
	/**
	 * Getter para el campo isMojada
	 * @return
	 */
	public boolean isMojada() {
		return isMojada;
	}
	
	/**
	 * Getter para el campo isSucia
	 * @return
	 */
	public boolean isSucia() {
		return isSucia;
	}

	/**
	 * Getter para el campo color
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Getter para el campo talla
	 * @return
	 */
	public int getTalla() {
		return talla;
	}
	
}
