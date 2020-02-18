package _02ejemplos.patronsigleton;

import java.util.Calendar;

public class TestObrero {

	public static void main(String[] args) {
		
		Obrero o1 = new Obrero("1","Sergio");
		Obrero o2 = new Obrero("2","Juan");
		Obrero o3 = new Obrero("3","arrrmai");

		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);

		System.out.println(Calendar.getInstance());
}

}
