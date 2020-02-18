package _03Ejercicios.gestionempleados;

public class TestEmpresa {

	public static void main(String[] args) {
		 //Creamos una empresa
		
		Empresa emp = new Empresa("1º Dam Software");
		emp.contratar(new Empleado("484848" , "SergioDuran", 2020,18000));
		emp.contratar(new Empleado("121212" , "asdasdasd", 2010,20000));
		emp.contratar(new Empleado("1212199" , "qweqweqw", 2018,22000));
		emp.contratar(new Empleado("78787" , "ghjghj", 2015,240000));
		emp.contratar(new Empleado("4.33384848" , "xzcczxc", 2000,18000));

		System.out.println(emp);
		
		//Despedir a alguien por dni
		emp.despedir("484848");
		//Despedir a alguien
		emp.despedir(new Empleado ("4.33384848" , "", 0,0));
		
		System.out.println(emp);

	}
}
