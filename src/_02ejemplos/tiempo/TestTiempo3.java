package _02ejemplos.tiempo;

public class TestTiempo3 {
	public static void main(String[] args) {
		//Constructor con 3 parámetros
		Tiempo t=new Tiempo(10,20,30);
		System.out.println(t);

		//Constructor con String
		Tiempo t2=new Tiempo("20:52:13");
		System.out.println(t2);

		//Constructor con int
		Tiempo t3=new Tiempo(3600);
		System.out.println(t3);
		
		
		Tiempo t4 =new Tiempo("20:45");
		System.out.println(t4);
		}
	
	

}
