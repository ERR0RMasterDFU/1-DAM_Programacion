package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=0;
				
		System.out.println("Hola, diga la edad");
		System.out.println(edad);
		edad=23;
		System.out.println(edad);
		System.out.println("Introduzca una nueva");
		edad=Leer.datoInt();
		System.out.println(edad);
		

		
		
		
		
	}

}
