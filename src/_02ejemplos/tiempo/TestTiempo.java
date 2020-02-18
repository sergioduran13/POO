package _02ejemplos.tiempo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTiempo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Tiempo t = new Tiempo();

		System.out.println("Introduce hora minuto segundo");
		t.setHora(tec.nextInt());
		t.setMinuto(tec.nextInt());
		t.setSegundo(tec.nextInt());
		
		System.out.println(t.toString());
		System.out.println(t);
		
		ArrayList<Tiempo> lista = new ArrayList<>();
		lista.add(t);
		System.out.println(lista);
	}

}
