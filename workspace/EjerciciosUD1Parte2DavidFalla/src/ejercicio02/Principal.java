package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String aux;
		int num=0, numx2=0, numx3=0, numMit=0, dos=2, tres=3;
		
		/*2. Realizar un programa que lea un valor entero por teclado y muestre por pantalla su doble, su triple y 
		su mitad.*/
		
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee un valor entero por teclado y muestra por pantalla su doble, su triple y su mitad!");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca su número ENTERO.");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		numx2= num*dos;
		System.out.println("El doble de "+num+" es "+numx2+".");
		
		numx3=num*tres;
		System.out.println("El triple de "+num+" es "+numx3+".");
		
		numMit=num/dos;
		System.out.println("La mitad de "+num+" es "+numMit+".");
	
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! y... ¡Disfrute de sus números ENTEROS :V!");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		
	}

}
