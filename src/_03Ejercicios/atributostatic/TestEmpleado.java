package _03Ejercicios.atributostatic;

import _02ejemplos.tiempo.Tiempo;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("78459852a","Sergio",2010,15000);
		Empleado e2 = new Empleado("45129832a","Paula",2034,25000);

		//Todos los empleado comparten la hEntrada y hSalida
		
		e1.hEntrada = new Tiempo(8,0,0);
		e1.hSalida = new Tiempo(16,0,0);
		
		//Si modifico la hora de entrada o salida de e1, estoy modificando la de e2(es la misma)
		System.out.println(e2.hEntrada);
		System.out.println(e2.hSalida);
		//No es del todo correcto acceder a un atributo static (de clase) como si fuera un atributo de objeto
		
		Empleado.hEntrada = new Tiempo(8,00,0);
		Empleado.hSalida = new Tiempo(16,0,0);
		System.out.println("\n" + Empleado.hEntrada);
		System.out.println(Empleado.hSalida);

	}

}
