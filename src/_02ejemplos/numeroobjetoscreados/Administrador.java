package _02ejemplos.numeroobjetoscreados;

import java.util.NoSuchElementException;

public class Administrador {
	private final int MAXADMIN = 10;
	private static int contAdministradores = 0;
	
	private String usr;
	private String pwd;
	
	public Administrador( String usr, String pwd){
		if(contAdministradores < MAXADMIN){
		this.usr = usr;
		this.pwd = pwd;
		contAdministradores++;
		}else{
			throw new NoSuchElementException("Alcanzado numero maximo de admins");
		}
	}
	
	public String toString(){
		return usr + " - " + pwd.replaceAll(".", "*");
	}
	
}
