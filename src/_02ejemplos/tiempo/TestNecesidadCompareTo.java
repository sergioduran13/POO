package _02ejemplos.tiempo;

import java.util.Arrays;

public class TestNecesidadCompareTo {
	public static void main(String[] args) {

		// Si tengo un array tipo primitivo, se puede ordenar
		int[] numeros = { 4, 2, 3, 8, 1, 9 };
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));

		// un Array de String tambien se puede ordenar
		String[] nombres = { "Sergio", "Duran", "Cazorla", "the", "best" };
		Arrays.sort(nombres);
		System.out.println(Arrays.toString(nombres));

		// Un Array de tiempos se puede ordenar?
		//Solo si en la clase Tiempo indicamos que dos objetos tiempo se pueden comparar entre si

		Tiempo[] tiempos = { 
				new Tiempo(10, 20, 30), 
				new Tiempo(22, 12, 5), 
				new Tiempo(2, 20, 30),
				new Tiempo(20, 12, 5), 
				new Tiempo(00, 20, 30),
				new Tiempo(4, 12, 5),
		};
		Arrays.sort(tiempos);
		System.out.println(Arrays.toString(tiempos));

	}

}
