package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String aux, nombre, calle;
		int edad;
		double notaMedia;
		
		//Instanciamos un objeto con valores.
		
		System.out.println("Diga el nombre.");
		aux=sc.nextLine();
		nombre=(aux);
		
		System.out.println("Diga la edad.");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		System.out.println("Diga la nota media.");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		
		System.out.println("Diga la calle donde vive ahora.");
		aux=sc.nextLine();
		calle=(aux);
		
		Alumno01 a1=new Alumno01 (nombre, edad, notaMedia);
		
		a1.mostrarDatos("Condes de bustillo"); //Calle introducida a CASCAPORRA.
		

		
		
	}

}
