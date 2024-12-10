package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		
		String aux;
		int num=0, dos=2, rest=0;
		//3. Leer un número y mostrar por la salida estándar si dicho número es o no par.
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee un número y determina si es par o impar!");
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, introduzca el número.");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		rest=num%dos;
		
		if(rest==0) {
			System.out.println("\nEl número introducido es PAR.");
		}else {
			System.out.println("\nEl número introducido es IMPAR.");
		}
		
		System.out.println("\n----------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de sus pares y nones >:)");
		System.out.println("----------------------------------------------------------------------------------");	
		
	}

}
