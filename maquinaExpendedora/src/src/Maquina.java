package src;

import java.util.HashMap;

import src.items.*;

public class Maquina {

	private HashMap<String, Item> inventario;
	private String direccion; 
	private int huecos;
	private double saldo;
	
	public Maquina(String direccion, int huecos) {
		this.direccion = direccion;
		this.huecos = huecos;
		this.saldo = 0;
		
		this.inventario = new HashMap<String, Item>();
		
		obtenerInventario();
	}
	
	public void meterDinero(double dinero) {
		this.saldo+=dinero;
	}
	
	public Boolean obtenerItem(String id) {
		Item item = inventario.get(id);
		if(item != null) {
			if(item.getPrecio() > saldo) {
				System.out.println(item.toString());
			}else {
				item.comprar();
				saldo -= item.getPrecio();
				devolverCambio();
			}
			return true;
		}
		return false;
	}
	
	private void devolverCambio() {
		
	}

	private boolean obtenerInventario() {
		inventario.put("1A", new Bebida("1A", "Cocaloca", 1, 5));
		
		inventario.put("1B", new Objeto("1B", "Mechero" , 2, 3));
		
		inventario.put("1C", new Comida("1C", "Cheetos", 1.5, 5));
		inventario.put("2C", new Comida("2C", "Lays", 1.9, 5));
		inventario.put("3C", new Comida("3C", "Ramen", 2.8, 5));
		inventario.put("4C", new Comida("4C", "Lacasitos", 2.0, 5));
		inventario.put("5C", new Comida("5C", "Herseys", 2.3, 5));
		
		return true;
	}
}
