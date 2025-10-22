package src;

public class Aplicacion {

	public Aplicacion() {
		//Creamos la ropa, seca y sucia
		Ropa camiseta = new Ropa("Negra", 48, false, true);

		//Creamos un operario y lo usamos para lavar la ropa
		Operario operario = new Operario();
		
		//Lavamos la camiseta y la secamos
		operario.lavar(camiseta);
		operario.secar(camiseta);
		
		//Teñimos la camiseta
		operario.tintar(camiseta, "Rojo");
	}

	public static void main(String args[]) {
		new Aplicacion();
	}
	
}
