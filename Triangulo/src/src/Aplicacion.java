package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Aplicacion {

	public Aplicacion() {
		//triangulo();
		//fibonacci();
		codificacionChula2();
	}
	
	private void codificacionChula() {
		Random random = new Random();
		int[] pass = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i = 0 ; i < pass.length ; i++) {
			for(int j = 0; j < 5000; j ++) {
				for(int x = i ; x < pass.length; x++) {
					pass[x] = random.nextInt(10);
				}
				for(int x = 0 ; x < pass.length; x++) {
					System.out.print(pass[x]);
				}
				System.out.println("");
			}
			pass[i] = random.nextInt(10);
		}
	}
	
	private void codificacionChula2() {
		Random random = new Random();
		int solved = 0;
		int[][] pass = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},
				{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},
				{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
		
        ArrayList<Integer> list = new ArrayList<Integer>(pass.length);
        for(int i = 1; i <= pass.length; i++) {
            list.add(i);
        }
		
		for(int i = 0 ; i < pass.length ; i++) {
			for(int j = 0; j < 1000; j ++) {
				for(int x = 0 ; x < pass.length; x++) {
					if(pass[x][0] == 0) {
						pass[x][1] = random.nextInt(10);
					}
					System.out.print(pass[x][1]);
				}
				System.out.println("");
			}
			
			solved = random.nextInt(list.size());
			list.remove(solved);
			
			pass[solved][0] = 1;
			pass[solved][1] = 0; //random.nextInt(10);
			
			for(int x = 0 ; x < pass.length; x++) {
				System.out.print(pass[x][1]);
			}
		}
		System.out.println("A ver");
	}

	private void fibonacci() {
		int previous = 0;
		int fibonacci = 1;
		int aux;
		System.out.println(previous);
		System.out.println(fibonacci);
		for(long i = 0 ; i< 100 ; i++) {
			aux = previous;
			previous = fibonacci;
			fibonacci = fibonacci + aux;
			System.out.println(fibonacci);

		}
	}
	
	private void triangulo() {
       Triangulo triangulo = new Triangulo();
        int tamaño;
        do{

            System.out.println("Introduzca el tamaño del triángulo o zero para salir:");
            tamaño = MyInput.readInt();
            while(tamaño < 0){
                System.out.println("Valor inválido, por favor introduzca el tamaño de nuevo");
                tamaño = MyInput.readInt();
            }
            triangulo.createTriangleOfBase(tamaño);
            triangulo.createInversedTriangleOfBase(tamaño);
        }while(tamaño !=0);
	}
	
	public static void main(String args[]) {
		new Aplicacion();
	}
	
}
