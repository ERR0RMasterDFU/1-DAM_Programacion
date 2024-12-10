package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, string;
		int entero=0;
		double doble=0;
		
		/*1. Hacer un programa donde se declaren varias variables de distinto tipo, se lee por teclado 
		un valor dado por el usuario y mostrar por la pantalla el valor con el formato adecuado 
		(usando printf).*/
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa en el que se declaran varias variables de distinto tipo!");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Introduzca una variable String");
		aux=sc.nextLine();
		string=aux;
		
		System.out.println("Introduzca una variable int");
		aux=sc.nextLine();
		entero=Integer.parseInt(aux);
		
		System.out.println("Introduzca una variable double");
		aux=sc.nextLine();
		doble= Double.parseDouble(aux);
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! y... Disfrute de sus variables :V.");
		System.out.println("---------------------------------------------------------------------------------");
		
	}

}
