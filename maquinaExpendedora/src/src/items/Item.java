package src.items;

public class Item {
	
	private String ID, nombre;
	private double precio;
	private int cantidad;
	
	public Item (String ID, String nombre, double precio, int cantidad) {
		this.ID = ID;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public boolean disponible(){
		return cantidad >0;
	}
	
	public void comprar() {
		cantidad --;
	}

	public String getID() {
		return ID;
	}


	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
}
