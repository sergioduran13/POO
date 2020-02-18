package _03Ejercicios.ReservasLibreria;

import java.util.Scanner;

public class TestReservas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nif , nif2;
		String nombre, nombre2;
		String telefono, telefono2;
		int codigo, codigo2;
		int ejemplares, ejemplares2;
		Reserva reserva1;
		Reserva reserva2;

		
		System.out.println("RESERVA 1 \n----------");
		System.out.println("NIF: ");
		nif = tec.next();
		System.out.println("NOMBRE: ");
		nombre = tec.next();
		System.out.println("TELEFONO: ");
		telefono = tec.next();
		System.out.println("CODIGO: ");
		codigo = tec.nextInt();
		System.out.println("EJEMPLARES: ");
		ejemplares = tec.nextInt();

		 reserva1 = new Reserva(nif, nombre, telefono, codigo, ejemplares);

		do {
			
			System.out.println("RESERVA 2 \n----------");
			System.out.println("NIF: ");
			nif2 = tec.next();
			System.out.println("NOMBRE: ");
			nombre2 = tec.next();
			System.out.println("TELEFONO: ");
			telefono2 = tec.next();
			System.out.println("CODIGO: ");
			codigo2 = tec.nextInt();
			System.out.println("EJEMPLARES: ");
			ejemplares2 = tec.nextInt();
			
			 reserva2 = new Reserva(nif2, nombre2, telefono2, codigo2, ejemplares2);
	
		} while (reserva1.equals(reserva2));
		
		System.out.println("\n" +reserva1.toString());
		System.out.println("=====================");
		System.out.println(reserva2.toString());

		
		System.out.println("=====================");

		System.out.println("\nRESERVA AUMENTADA EN 1 ");
		reserva1.setEjemplares(ejemplares+1);
		reserva2.setEjemplares(ejemplares2+1);

		System.out.println("=====================");

		System.out.println("\nORDENACION DE RESERVAS: \n");
		
		if(reserva1.compareTo(reserva2) > 0 ){
			System.out.println(reserva2.toString());
			System.out.println("------------");
			System.out.println(reserva1.toString());
		} else {
			System.out.println(reserva1.toString());
			System.out.println("------------");
			System.out.println(reserva2.toString());
		}
		
		//Prueba metodos ListaReservas
		ListaReservas lista = new ListaReservas();
		lista.reservar(nif2, nombre2, telefono2, codigo2, ejemplares2);
		lista.reservasLibro(codigo2);
		
		

	}

}
