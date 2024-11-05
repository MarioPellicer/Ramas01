package Ejercicio;

import java.util.Scanner;



public class Ramas01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion = -1;
		do {
			eleccion = Funciones.dimeEntero(
					"Selecciona lo que quieres hacer: \n1. Agregar nota de un alumno \n2. Calcular promedio \n3. Mostrar nota mas alta \n4. Mostrar nota mas baja \n0. Salir", sc);
			
			if (eleccion == 1) {
				
			}
			
			if (eleccion == 2) {
				
			}
			
			if (eleccion == 3) {
				
			}
			
			if (eleccion == 4) {
				
			}
			
		} while (eleccion != 0);
		
		sc.close();

	}

}
