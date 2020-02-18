package _03Ejercicios.gestionempleados;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Empresa {

	// Atributos
	private String nombre;
	private ArrayList<Empleado> plantilla;

	// constructor
	public Empresa(String nombre) {
		setNombre(nombre);
		setPlantilla(new ArrayList<>());
	}

	// Devuelve el numero de empleados de la empresa
	public int getNumeroEmpleados() {
		return plantilla.size();
	}

	// Getter
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Empleado> getPlantilla() {
		return plantilla;
	}

	// Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPlantilla(ArrayList<Empleado> plantilla) {
		this.plantilla = plantilla;
	}

	// Metodo Contratar
	public void contratar(Empleado e) throws IllegalArgumentException {
		if (plantilla.contains(e)) {
			throw new IllegalArgumentException("No se puede contratar a alguien que ya está contratado");
		} else {
			plantilla.add(e);
		}

	}

	// metodo despedir nombre
	public void despedir(Empleado e) throws NoSuchElementException {
		if (!plantilla.contains(e)) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		} else {
			plantilla.remove(e);
		}
	}

	// Metodo despedir dni
	public void despedir(String dni) throws NoSuchElementException {

		// Creo un empleado con el dni que quiero buscar
		Empleado e = new Empleado(dni, "", 0, 0);

		// Busco/elimino el Empleado e
		if (!plantilla.contains(e)) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		} else {
			plantilla.remove(e);
		}
	}

	// Metodo subir trienio
	public void subirTrienio(double porcentaje) {
		for (int i = 0; i < plantilla.size(); i++) {
			if (plantilla.get(i).antiguedadFecha() % 3 == 0) {
				plantilla.get(i).incrementarSueldo(porcentaje);
			}
		}
	}

	// Metodo subir trienio for each
	public void subirTrienioV2(double porcentaje) {
		for (Empleado e : this.plantilla) {
			if (e.antiguedadFecha() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
	}
	
	public String toString(){
		String info = "Empresa: " + nombre + "\n=====\n";
		for (int i = 0; i < plantilla.size(); i++) {
			info = info + plantilla.get(i).toString() + "\n-----\n";
		}
		return info;
	}
}
