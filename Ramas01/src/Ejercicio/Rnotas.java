package Ejercicio;

public class Rnotas {
		static double todo=0;
		static int contador=0;
		static double mayor=0;
		static double menor=0;
	public static void main(String[] args) {

	}
		public static void agregarNota(double nota) {
		todo=todo+nota;
		contador++;
		mayor= Math.max(mayor, nota);
		menor= Math.min(menor, nota);
		}
		public static double calcularPromedio(int totalAlumnos) {
			return todo/contador;
		}
		public static double notaMaxima()  {
			return mayor;
		}
		public static double notaMinima() {
			return menor;
		}
}
