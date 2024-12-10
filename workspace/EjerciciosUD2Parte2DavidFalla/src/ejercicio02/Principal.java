package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0, tam=10, numero=0, dos=2;
		int [] numeros;
		numeros= new int [tam];
		
		/*2. Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones, 
		cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.*/
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que rellena automáticamente un array de enteros con 10 posiciones!");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		do {
			
			System.out.println("----------------------------------");
			System.out.println("1. INICIAR PROGRAMA.");
			System.out.println("0. SALIR DEL PROGRAMA.");
			System.out.println("----------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					
					for (int i = 0; i < numeros.length; i++) {
						
						numero=i*dos;
						
						System.out.println(numero);
						
					}
					break;
					
				case 0:
					break;
				
				default:
					System.out.println("Lo siento, no hay ninguna opción asignada a esa tecla. Por favor, escoja otra.");
					break;
			}
		
		}while(opcion!=0);
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! Y... Disfrute de su segundo array >:)");
		System.out.println("--------------------------------------------------------------------------------------");
	
	}

}
