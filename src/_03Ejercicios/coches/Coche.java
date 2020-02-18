package _03Ejercicios.coches;

public class Coche {

	// Atributos
	private boolean enMarcha;
	private int velocidadMaxima;
	private double velocidadActual;
	private int rpmMaxima;
	private int rpmActual;
	private int marcha;

	// Constructores
	public Coche() {
		enMarcha = false;
		velocidadMaxima = 180;
		velocidadActual = 0;
		rpmMaxima = 65000;
		rpmActual = 0;
		marcha = 0;
	}

	public Coche(int velocidadMaxima, int rpmMaxima) {
		enMarcha = false;
		this.velocidadMaxima = velocidadMaxima;
		velocidadActual = 0;
		this.rpmMaxima = rpmMaxima;
		rpmActual = 0;
		marcha = 0;
	}

	// Getters y Setters

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public int getRpmMaxima() {
		return rpmMaxima;
	}

	public int getRpmActual() {
		return rpmActual;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setVelocidadActual(double velocidad) {
		if (velocidad > this.velocidadMaxima)
			velocidad = velocidadMaxima;
		else if (velocidad < 0)
			velocidad = 0;
		this.velocidadActual = velocidad;
	}

	public void setRpmMaxima(int rpmMaxima) {
		this.rpmMaxima = rpmMaxima;
	}

	public void setRpmActual(int rpm) {
		if (rpm > rpmMaxima)
			rpm = rpmMaxima;
		else if (rpm < 0)
			rpm = 0;
		this.rpmActual = rpm;
	}

	public void setMarcha(int marcha) {
		if (marcha > 5)
			marcha = 5;
		else if (marcha < 0)
			marcha = 0;
		this.marcha = marcha;
	}

	// OTROS METODOS:

	public String toString() {
		return "ENCENDIDO: " + this.enMarcha + "\nVelocidad Maxima: " + this.velocidadMaxima + "\nVelocidad Actual: "
				+ this.velocidadActual + "\nRPM Maximos: " + this.rpmMaxima + "\nRPM Actual: " + this.rpmActual
				+ "\nMarcha: " + this.marcha;
	}

	public void arrancar(){
			this.enMarcha = true;
	}
	public void apagar(){
		this.enMarcha = false;
		this.velocidadActual = 0;
		this.rpmActual = 0;
		this.marcha = 0;
}
	
	public void acelerar (double v){
		
		if(this.enMarcha = true ){
			setVelocidadActual(this.velocidadActual = this.velocidadActual + v);
			rpmActual = rpmActual + ((int)v*70);
		
		}
	}
}
