package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String aux;
		int opcion=0, tam=8, suma=0, cantCeros=0;
		double media=0;
		
		int [] numeros;
		numeros= new int [tam];
		
		/*3. Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números leídos por 
		teclado y mostrar la media de todos los elementos y la cantidad de números “cero” introducidos.*/
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que crea un array de enteros unidimensional de 8 posiciones y lo rellena con números leídos por teclado!");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
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
						System.out.println("Por favor, introduzca un número.");
						aux=sc.nextLine();
						numeros[i]=Integer.parseInt(aux);
						
						System.out.println(numeros[i]);
						
						suma+=numeros[i];
						
						if(numeros[i]==0) {
							
							cantCeros= cantCeros+1;
						}
						
					}
					
					media= suma/tam;
					
					System.out.println("La suma de todos los números es "+suma+".");
					System.out.println("La media es "+media+".");
					System.out.println("La cantidad de ceros que ha introducido es: "+cantCeros);
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.");
					break;
					
			}
		
		}while(opcion!=0);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su tercer array. >:)");
		System.out.println("-------------------------------------------------------------------------------------");

	}

}
