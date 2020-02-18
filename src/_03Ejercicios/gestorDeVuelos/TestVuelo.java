package _03Ejercicios.gestorDeVuelos;

import java.util.Scanner;

import _02ejemplos.tiempo.Tiempo;

public class TestVuelo {

	public static void main(String[] args) {
		
		Vuelo v = new Vuelo("3487", "VAL" , "MAD", new Tiempo(10,0,0), new Tiempo(12,0,0), 50);
		
		v.reservarAsiento("Andres", "4577612375");
		v.reservarAsiento("Sergio", "4561233");
		v.reservarAsiento("Pepito", "456124475");
		v.reservarAsiento("AAAAAAhhh siii?", "451212375");
		v.reservarAsiento("ValeVale tio", "4561231275");
		v.reservarAsiento("Emmmmm si bueno, no", "455612375");
		v.reservarAsiento("ay! CLARO!!", "456123775");
		v.reservarAsiento("Jerez ", "456123785");
		v.reservarAsiento("Tito MC", "456123075");

		v.reservarAsiento("Vicente", "789456", 'V');
		v.reservarAsiento("Villar", "789sr456", 'V');
		v.reservarAsiento("Victoria", "7563489456", 'V');

		v.reservarAsiento("Paco", "+65666", 'P');
		v.reservarAsiento("Pedrito", "+65654566", 'P');

		System.out.println(v);
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Asiento a cancelar: ");
		int asiento = tec.nextInt();
		while(asiento> v.getCapacidad()){
			System.out.println("Capacidad del avion menor al asiento solicitado");
			System.out.println("\nAsiento a cancelar: ");
			asiento = tec.nextInt();
			}
		v.cancelarReserva(asiento);
		System.out.println(v);
		
		
	}

}
