package src;

public class Lavadora {

	/**
	 * Método que toma una pieza de ropa y la lava
	 * Dejando la pieza de ropa limpia y mojada
	 * @param ropa
	 */
	public void lavar(Ropa ropa) {
		System.out.println("La lavadora lava la prenda");
		ropa.setSucia(false);
		ropa.setMojada(true);
	}
	
}
