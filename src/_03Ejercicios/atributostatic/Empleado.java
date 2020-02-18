package _03Ejercicios.atributostatic;

import java.util.Calendar;
import _02ejemplos.tiempo.Tiempo;

public class Empleado implements Comparable<Empleado> {
	//Atributos de clase
	public static Tiempo hEntrada;
	public static Tiempo hSalida;

	
	//Atributos objeto
	private String nombre;
	private String dni;
	private int antiguedad;
	private double sueldo;

	// Constructor
	public Empleado(String dni, String nombre, int antiguedad, double sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		setAntiguedad(antiguedad);
		setSueldo(sueldo);
	}

	// OTROS METODOS
	public int antiguedadFecha() {
		int actual = Calendar.getInstance().get(Calendar.YEAR);
		int antig = 0;
		if (actual > antiguedad) {
			antig = actual - antiguedad;
		}
		return antig;
	}

	public void incrementarSueldo(double porcentaje) {
		sueldo = sueldo + sueldo * porcentaje / 100;
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAntiguedad(int antiguedad) {
		if (antiguedad < 0) {
			throw new IllegalArgumentException("Error");
		}
		this.antiguedad = antiguedad;
	}

	public void setSueldo(double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException("Valor incorrecto.");
		}
		this.sueldo = sueldo;
	}

	//Otros metodos
	public String toString() {
		String info = "DNI: " + this.dni + "\nNombre: " + this.nombre + "\nAño ingreso: " + this.antiguedad
				+ "\nSueldo: " + this.sueldo;
		return info;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Empleado))
			return false;
		Empleado e = (Empleado) o;
		if (this.dni.equals(e.dni)) {
			return true;
		} else
			return false;

	}
	

	public int compareTo(Empleado e) {
		return this.dni.compareTo(e.dni);
	}

	 public static double calcularIRPF(double salario){
		 double irpf;
		 
		 if (salario < 800)
			 irpf = 3;
		 else if (salario < 1000)
			 irpf = 10;
		 else if (salario < 1500)
			 irpf = 15;
		 else if (salario < 2100)
			 irpf = 20;
		 else
			 irpf = 30;
		 
		 return irpf;
	 }
	 }
