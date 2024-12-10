package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);	
		
		String aux;
		double num1=0, num2=0;
		//1. Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la 
		//posibilidad de que sean iguales.
		
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee 2 números y determina el mayor o igual de ellos!");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, introduzca el primer número.");
		aux=sc.nextLine();
		num1=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca el segundo número.");
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		if (num1==num2) {
			System.out.println("\nAmbos números introducidos("+num1+") y ("+num2+") poseen el mismo valor.");
		}else {
		if(num1>num2) {
			System.out.println("\nEl primer número introducido ("+num1+") es mayor que el segundo ("+num2+").");
		}else {
			System.out.println("\nEl segundo número introducido ("+num2+") es mayor que el primero ("+num1+").");
		}
		}
		System.out.println("\n-----------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su comparador de números >:)");
		System.out.println("-----------------------------------------------------------------------------------------");	
	
	}

}
