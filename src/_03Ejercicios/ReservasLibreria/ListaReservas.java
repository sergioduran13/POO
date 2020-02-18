package _03Ejercicios.ReservasLibreria;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import _03Ejercicios.gestionempleados.Empleado;

public class ListaReservas {

	private ArrayList<Reserva> listaReserva;
	
	//Constructor
	public ListaReservas(){
		listaReserva = new ArrayList<>();
	}
	
	public void reservar(String nif, String nombre, String telefono, int codigo, int ejemplares)
			throws IllegalArgumentException {
	
		System.out.println("======\nCREACION DE RESERVA\n=====");
		Reserva info = new Reserva(nif, nombre, telefono, codigo, ejemplares);
	
		if (listaReserva.contains(info))
			throw new IllegalArgumentException("La reserva ya estaba en la lista.");
		else
			listaReserva.add(info);
	}
	
	public void cancelar(String nif, int codigo) throws NoSuchElementException{
			Reserva cancelacion = new Reserva( nif ,"", "",codigo ,0 );
			if(listaReserva.contains(cancelacion)){
				listaReserva.remove(cancelacion);
			}else{
				throw new NoSuchElementException("No existe nadie con esos datos.");
			}
	}
	
	public String toString(){
		String result="";
		for (int i = 0; i < listaReserva.size(); i++) {
			result = result + listaReserva.get(i).toString()+"\n------\n";
		}
		return result;
	}
	public int numEjemplaresReservadosLibro(int codigo){
		int cont=0;

		for (int i = 0; i < listaReserva.size(); i++) {
			if(listaReserva.get(i).getCodigo() == codigo){
				cont+= listaReserva.get(i).getEjemplares();
			}
		}
		return cont ;
	}
	
	public void reservasLibro(int codigo){
		for (int i = 0; i < listaReserva.size(); i++) {
			if(listaReserva.get(i).getCodigo() == codigo){
				System.out.println("NOMBRE: " + listaReserva.get(i).getNombre());
				System.out.println("TELEFONO: " + listaReserva.get(i).getTelefono());
				System.out.println("==========");

			}
		}
	}

}
