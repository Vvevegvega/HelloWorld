package src;

import java.util.Random;

public class Partida {
	
	public static void main(String args[]) {
		//exercise1();
		exercise2();
	}
	
	public static void exercise1() {
		//Creamos 2 personajes
		Jugador jugador1 = new Jugador("Ivan");
		Jugador jugador2 = new Jugador("Eve");
		
		//Mostramos sus estados por pantalla
		System.out.println(jugador1.getEstado());
		System.out.println(jugador2.getEstado());
		
		//Se pegan
		System.out.println(jugador1.atacar(jugador2, jugador1.getDaño()));
		System.out.println(jugador2.atacar(jugador1, jugador2.getDaño()));
		
		//Mostramos sus estados por pantalla otra vez
		System.out.println(jugador1.getEstado());
		System.out.println(jugador2.getEstado());
	}
	
	public static void exercise2() {
		//Creamos 2 personajes
		Jugador jugador1 = new Jugador("Ivan");
		Jugador jugador2 = new Jugador("Eve");
		
		Random random = new Random();
		
		//Mostramos sus estados por pantalla
		System.out.println(jugador1.getEstado());
		System.out.println(jugador2.getEstado());
		
		System.out.println(getSeparador());
		System.out.println(getTextoInicio());
		System.out.println(getSeparador());
		
		//Mientras los jugadore esten vivos, que se peguen aleatoriamente
		while(jugador1.isAlive() && jugador2.isAlive()) {
			
			//Se selecciona quien pega a quien
			if(random.nextBoolean()) {
				System.out.println(jugador1.atacar(jugador2, jugador1.getDaño()));
			}else {
				System.out.println(jugador2.atacar(jugador1, jugador2.getDaño()));
			}
			
			//Se vuelven a mostrar los estaods
			System.out.println(jugador1.getEstado());
			System.out.println(jugador2.getEstado());
			System.out.println(getSeparador());
			
		}
		
		//Texto de fin de juego
		if(jugador1.isAlive()) {
			System.out.println("Player1 wins!");
		}else {
			System.out.println("Player2 wins!");
		}		
	}

	private static String getTextoInicio() {
		return "Fight!";
	}

	private static String getSeparador() {
		return "--------------------------------------------";
	}
}
