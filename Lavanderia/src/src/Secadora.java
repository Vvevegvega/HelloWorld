package src;

public class Secadora {
	
	/**
	 * Método que toma una pieza de Ropa
	 * y cambia su estado a seca
	 * @param ropa
	 */
	public void secar(Ropa ropa) {
		System.out.println("La sacadora lava la ropa");
		ropa.setMojada(false);
	}
}
