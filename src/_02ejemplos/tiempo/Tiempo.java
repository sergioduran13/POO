package _02ejemplos.tiempo;

//con implements Comparable estamos indicando que un objeto Tiempo se puede comparar con otro objeto Tiempo
public class Tiempo implements Comparable<Tiempo>{
	// Atributos (Información que almacenan los objetos de la clase)
	private int hora;
	private int minuto;
	private int segundo;

	// Métodos CONSTRUCTORES: Son los que se usan para crear objetos de la
	// clase. Permiten
	// que se pueda crear objetos de la clase con valores distintos a los
	// valores por defecto.

	public Tiempo(int hora, int minuto, int segundo) {
		this.setHora(hora); // Mejor que this.hora=hora;
		this.setMinuto(minuto); // Mejor que this.minuto=minuto;
		this.setSegundo(segundo); // Mejor que this.segundo=segundo;
	}

	// Constructor para crear las 0:0:0
	public Tiempo() {
		// this.hora = 0;
		// this.minuto = 0;
		// this.segundo = 0;

		// Llamando a otros de los constructores
		this(0, 0, 0);
	}

	// Constructor para crear objeto Tiempo a partir de un string
	public Tiempo(String texto) {
		int pos1 = texto.indexOf(":");
		int pos2 = texto.lastIndexOf(":");
		int h = Integer.parseInt(texto.substring(0, pos1));
		int m = Integer.parseInt(texto.substring(pos1 + 1, pos2));
		int s = Integer.parseInt(texto.substring(pos2 + 1));

		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}

	public Tiempo(int num) {
		int h = num / 3600;
		int m = num % 3600 / 60;
		int s = num % 60;

		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}

	// Métodos Getter: Permiten consultar el valor de los atributos
	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	// Métodos Setter: Permiten cambiar el valor de los atributos
	public void setHora(int hora) {
		/*
		 * if(hora<0){ hora=0; } if(hora>23){ hora=23; } this.hora=hora;
		 */
		if (hora < 0 || hora > 24) {
			throw new IllegalArgumentException("Hora incorrecta");
		}
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("Hora incorrecta");
		}
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		if (segundo < 0 || segundo > 59) {
			throw new IllegalArgumentException("Hora incorrecta");
		}
		this.segundo = segundo;
	}

	/**
	 * Devuelve un String con la información del objeto, tal cual queremos que
	 * se represente en pantalla.
	 * 
	 */
	public String toString() {
		String result = this.hora + ":" + this.minuto + ":" + this.segundo;
		return result;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Tiempo))
			return false;
		Tiempo t = (Tiempo) o;
		if (this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo) {
			return true;
		} else
			return false;

	}

	public int compareTo(Tiempo t) {
		if(this.hora < t.hora) return -1;
		else if (this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.segundo < t.segundo) return -1;
		else if(this.segundo > t.segundo) return 1;
		else return 0;
	}

	public int compareToV2(Tiempo t) {
		
		return (this.hora*3600 + this.minuto *60 + this.segundo) 
				- (t.hora * 3600 + t.minuto * 60 + t.segundo) ;
	}

	
	
}
