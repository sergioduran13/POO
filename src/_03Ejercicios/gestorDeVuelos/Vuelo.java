package _03Ejercicios.gestorDeVuelos;

import java.util.Random;

import _02ejemplos.tiempo.Tiempo;

public class Vuelo {
	private String id;
	private String origen;
	private String destino;
	private Tiempo hSalida;
	private Tiempo hLlegada;
	private int capacidad;
	private int numReserva;
	Pasajero[] pasaje;
	
	public int getCapacidad(){
		return this.capacidad;
	}
	
	public Pasajero[] getPasajero(){
		return this.pasaje;
	}
	
	public String getId(){
		return this.id;
	}
	public Tiempo getHsalida(){
		return this.hSalida;
	}
	public Tiempo getHllegada(){
		return this.hLlegada;
	}

	public Vuelo(String id, String origen, String destino, Tiempo hSalida, Tiempo hLlegada, int capacidad) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.hSalida = hSalida;
		this.hLlegada = hLlegada;
		this.capacidad = capacidad;
		numReserva = 0;
		pasaje = new Pasajero[capacidad + 1];
	}

	public boolean hayLibres() {
		return (numReserva < capacidad);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		
		Vuelo other = (Vuelo) o;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public int reservarAsiento(String nombrePasajero, String nifPasajero) throws IllegalArgumentException {
		Pasajero reserva = new Pasajero(nifPasajero, nombrePasajero);
		int result;
		// vemos si esta lleno
		if (!hayLibres()) {
			result = 0;
		} else {
			// comprobamos si el pasajero ya está en el vuelo
			for (int i = 1; i < pasaje.length; i++) {
				if (reserva.equals(pasaje[i])) {
					throw new IllegalArgumentException("Pasajero duplicado");
				}
			}
			// Asignamos numero asiento al azar
			Random r = new Random();
			int num;

			do {
				num = r.nextInt(capacidad) + 1;
			} while (pasaje[num] != null);

			result = num;
			pasaje[num] = reserva;
			numReserva++;
		}
		return result;
	}

	public int reservarAsiento(String nombrePasajero, String nifPasajero, char preferencia)
			throws IllegalArgumentException {
		Pasajero reserva = new Pasajero(nifPasajero, nombrePasajero);
		int result = 0;
		boolean enc = false;
		// vemos si esta lleno el vuelo
		if (!hayLibres()) {
			result = 0;
		} else {
			// comprobamos si el pasajero ya está en el vuelo
			for (int i = 1; i < pasaje.length; i++) {
				if (reserva.equals(pasaje[i])) {
					throw new IllegalArgumentException("Pasajero duplicado");
				}
			}

			// Preferencia P
			if (preferencia == 'P') {
				for (int i = 2; i < pasaje.length && !enc; i = i + 2) {
					if (pasaje[i] == null) {
						result = i;
						pasaje[i] = reserva;
						enc = true;
						numReserva++;
					}
				}
				// Preferencia V
			} else {
				for (int i = 1; i < pasaje.length && !enc; i = i + 2) {
					if (pasaje[i] == null) {
						result = i;
						pasaje[i] = reserva;
						enc = true;
						numReserva++;

					}
				}
			}
			// Si no hay hueco de tu preferencia se te asignara el primero libre
			if (!enc) {
				for (int i = 1; i < pasaje.length && !enc; i++) {
					if (pasaje[i] == null) {
						result = i;
						pasaje[i] = reserva;
						enc = true;
						numReserva++;

					}
				}
			}
		}
		return result;
	}

	public void cancelarReserva(int numAsiento) throws IllegalArgumentException {
		if (pasaje[numAsiento] == null)
			throw new IllegalArgumentException("Ese asiento no estaba reservado");
		else {
			pasaje[numAsiento] = null;
			numReserva--;
		}
	}

	public String toString() {
		String infoVuelo = id + " " + origen + " " + destino + " " + hSalida.toString() + " " + hLlegada.toString();
		String infoPasajeros = "\n";
		for (int i = 1; i < pasaje.length; i++) {
			infoPasajeros = infoPasajeros + "\nAsiento " + i + ": " + pasaje[i];
		}
		return infoVuelo + "Pasajeros: " + infoPasajeros;
	}

}
