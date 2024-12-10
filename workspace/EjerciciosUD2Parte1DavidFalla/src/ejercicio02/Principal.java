package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		
		String aux;
		double num1=0, num2=0, div=0;
		/*2. Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un 
		mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de 
		la división con dos decimales si no lo es.*/
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee 2 números double y determina su división!");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, introduzca el primer número.");
		aux=sc.nextLine();
		num1=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca el segundo número.");
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		
		div=num1/num2;
		
		if(num2==0) {
			System.out.println("\nERROR. Dividir algo entre 0 va en contra de las normas matemáticas insensato. >:(");
		}else {
			System.out.printf("\nEl resultado de la división es %.2f", div);
		}
		
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su calculadora de divisiones >:)");
		System.out.println("---------------------------------------------------------------------------------------------");	
		
	}

}
