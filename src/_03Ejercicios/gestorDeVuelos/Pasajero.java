package _03Ejercicios.gestorDeVuelos;

public class Pasajero {

private String dni;
private String nombre;
	
	
	public Pasajero(String dni, String nombre) {
		setDni(dni);
		setNombre(nombre);
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString() {
		return dni + " - " + nombre;
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	

}
