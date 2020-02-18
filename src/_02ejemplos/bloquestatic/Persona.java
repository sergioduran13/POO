package _02ejemplos.bloquestatic;

public class Persona {
	//Un bloque de codigo static es un fragmento de codigo que se ejecuta automaticamente, 
	//la primera y una unica vez que se usa la clase
	static{
		System.out.println("Hola");
	}
	
	private String dni;
	private String nombre;
	
		
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	public String toString(){
		return dni + " - " + nombre;
	}
	
	
}