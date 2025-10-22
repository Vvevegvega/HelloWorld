package src;

import java.util.Random;

public class Jugador {
	private String nombre;
	private int puntosDeVida, puntosDeMagia;
	
	public Jugador(String nombre) {
		this.nombre= nombre;	
		this.puntosDeVida = 100;
		this.puntosDeMagia = 100;
	}
	
	/**
	 * Metodo que Genera un valor de daño como si se lanzase un dado de 12 caras
	 * y daña al defensor por esa misma cantidad de daño
	 * @param defensor
	 * @return cadena de texto con el mensaje del ataque exitoso
	 */
	public String atacar(Jugador defensor, int daño) {
		defensor.recibirDaño(daño);
		
		return nombre + " ataca a " + defensor.getNombre() + " por un total de " + daño + " PV!";
	}
	
	/*
	public String atacar(Jugador defensor) {
		int daño = getDaño();
		defensor.recibirDaño(daño);
		
		return nombre + " ataca a " + defensor.getNombre() + " por un total de " + daño + " PV!";
	}
	*/
	
	public int getDaño() {
		return new Random().nextInt(12) + 1;
	}
	
	/**
	 * Metodo que actualiza los puntos de vida según el daño recibido
	 * @param puntosDeDaño
	 */
	public void recibirDaño(int puntosDeDaño) {
		this.puntosDeVida -= puntosDeDaño;
		
		if(this.puntosDeVida <0) this.puntosDeVida=0;
	}
	
	/**
	 * Metodo que devuelve la cadena de texto con el estado actual del jugador
	 * @return String estado actual del jugador
	 */
	public String getEstado() {
		return nombre + ":\t" + puntosDeVida + " PV\t" + puntosDeMagia + " PM";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Metodo que devuelve el estado actual de los puntos de vida del jugador.
	 * @return true if puntosDeVida <0
	 * @return false if puntosDeVida>0
	 */
	public boolean isAlive() {
		return puntosDeVida >0;
	}

}
