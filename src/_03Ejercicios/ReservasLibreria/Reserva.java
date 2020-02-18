package _03Ejercicios.ReservasLibreria;

import _03Ejercicios.gestionempleados.Empleado;

public class Reserva  implements Comparable <Reserva>  {
	private String nif;
	private String nombre;
	private String telefono;
	private int codigo;
	private int ejemplares;


	//Constructores
	
	public Reserva(String nif, String nombre ,String telefono ,int codigo , int ejemplares) {
		this.nif = nif;
		this.nombre = nombre;
		this.telefono = telefono;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
		
	}
	
	public Reserva(String nif, String nombre ,String telefono ,int codigo ) {
		this.nif = nif;
		this.nombre = nombre;
		this.telefono = telefono;
		this.codigo = codigo;
		//this(nif,nombre,telefono,codigo,1)
		
	}

	// Getter y Setter
	public String getNif() {
		return nif;
	}


	public String getNombre() {
		return nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public int getCodigo() {
		return codigo;
	}


	public int getEjemplares() {
		return ejemplares;
	}



	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	//Otros metodos
	
	public String toString(){
		return "NIF: " + nif + "\nNOMBRE: " + nombre + "\nTELEFONO: " + telefono + "\nCODIGO RESERVA: " 
				+ codigo + "\nCANTIDAD: " + ejemplares;
	}
	
	public boolean equals(Object o){
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Reserva))
			return false;
		Reserva r = (Reserva) o;
		if (this.nif.equals(r.nif) && (this.codigo == r.codigo)) 
			return true;
		 else
			return false;
	}

	public int compareTo(Reserva r) {
		if(this.codigo < r.codigo )
			return -1;
		else if(this.codigo > r.codigo )
			return 1;
		else return this.nif.compareTo(r.nif);
	}
	
	

}
