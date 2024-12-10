package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0;
		
		String [] nombres={"Manuel", "Pablo", "Fran", "Paula", "Iuli"};
		
		/*1. Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y 
		mostrarlo por la pantalla mediante un bucle for.*/
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que crea un array de tipo String con el nombre de 5 personas!");
		System.out.println("--------------------------------------------------------------------------------------");
		
		do {
		
			System.out.println("-------------------------");
			System.out.println("1. INICIAR PROGRAMA.");
			System.out.println("0. SALIR DEL PROGRAMA.");
			System.out.println("-------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					for (int i = 0; i < nombres.length; i++) {
						
						System.out.println(nombres[i]);	
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
		System.out.println("¡Muchas gracias por usar nuestro programa! Y... Disfrute de su primer array >:)");
		System.out.println("--------------------------------------------------------------------------------------");
		
	}

}
