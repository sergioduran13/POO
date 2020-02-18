package _02ejemplos.tiempo;

import java.util.Scanner;

public class TestUsoCompare {
	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//tiempo de fin tiene que ser posterior al de inicio
		
		System.out.println("Inicio: ");
		Tiempo tInicio = leerTiempo();
		Tiempo tFin;
		
		do{
		System.out.println("Fin: ");
		 tFin = leerTiempo();
		}while(tInicio.compareTo(tFin) >=0);
	}
	
	public static Tiempo leerTiempo(){
		System.out.println("Introduce tiempo:");
		String hms = tec.next();
		Tiempo t = new Tiempo(hms);
		return t;
	}
}
