package _03Ejercicios.gestionempleados;

import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce empleado 1: ");
		String dni1 = tec.nextLine();
		String nombre1 = tec.nextLine();
		int antiguedad1 = tec.nextInt();
		double sueldo1 = tec.nextDouble();
		tec.nextLine();
		Empleado e1 = new Empleado(dni1, nombre1, antiguedad1, sueldo1);

		System.out.println("Introduce empleado 2: ");
		String dni2 = tec.nextLine();
		String nombre2 = tec.nextLine();
		int antiguedad2 = tec.nextInt();
		double sueldo2 = tec.nextDouble();
		Empleado e2 = new Empleado(dni2, nombre2, antiguedad2, sueldo2);

		// incrementar 20% al que menos cobre
		if (e1.getSueldo() < e2.getSueldo()) {
			e1.incrementarSueldo(20);
			System.out.println(e1);
		} else {
			e2.incrementarSueldo(20);
			System.out.println(e2);
		}

		// incrementar 10% al mas antiguo
		if (e1.antiguedadFecha() > e2.antiguedadFecha()) {
			e1.incrementarSueldo(10);
			System.out.println(e1);
		} else {
			e2.incrementarSueldo(10);
			System.out.println(e2);
		}

		if (e1.equals(e2)) {
			System.out.println("FUNCIONA");
		}

		System.out.println(e1.compareTo(e2));

		// Muestra el irpf que correspondería a cada empleado.
		System.out.println("IRPF Empleado 1: ");
		System.out.println(Empleado.calcularIRPF(e1.getSueldo() / 12) + "%");

		System.out.println("IRPF Empleado 2: ");
		System.out.println(Empleado.calcularIRPF(e2.getSueldo() / 12) + "%");
	}

}
