package src;

public class Operario {
	private Lavadora lavadora;
	private Secadora secadora;
	
	/**
	 * Constructor de la clase operario
	 */
	public Operario() {
		System.out.println("Se crea el operario");
		this.lavadora = new Lavadora();
		this.secadora = new Secadora();
	}

	/**
	 * Metodo que lava la ropa usando una lavadora
	 * Deja la ropa mojada y limpia
	 * @param ropa
	 */
	public void lavar(Ropa ropa) {
		System.out.println("El operario lava la prenda");
		lavadora.lavar(ropa);
	}
	
	/**
	 * Metodo que seca la ropa usando una secadora
	 * Deja la ropa seca
	 * @param ropa
	 */
	public void secar(Ropa ropa) {
		System.out.println("El operario seca la prenda");
		secadora.secar(ropa);
	}
	
	/**
	 * Metodo que cmabia el color de la camiseta por el especificado
	 * @param ropa
	 * @param color
	 */
	public void tintar(Ropa ropa, String color) {
		System.out.println("El operario tiñe la prenda a " + color);
		ropa.teñir(color);
	}
}
