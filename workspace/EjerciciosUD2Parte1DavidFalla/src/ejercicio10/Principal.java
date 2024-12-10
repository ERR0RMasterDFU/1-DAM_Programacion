package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0, numEnt=0;
		double precEnt, precTot;

		/*10. Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada 
		una. Se debe leer la sala deseada y mostrar:
		a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo, 
		sala vip, sala 3D, sala normal y sala para niños).
		b. Pedir el número de entradas.
		c. Calcular el precio final y mostrarlo.*/
		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee la película que elijas y calcula su precio!");
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("\nSi quiere ver la película Final Fantasy VII: Advent Children pulse 1.");
		System.out.println("Si quiere ver la película Naruto: Road to Boruto pulse 2.");
		System.out.println("Si quiere ver la película Jujutsu Kaisen 0 pulse 3.");
		System.out.println("Si quiere ver la película Kimetsu No Yaiba: El Tren infinito pulse 4.");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		System.out.println("\nPor favor, introduzca el número de entradas que desea:");
		aux=sc.nextLine();
		numEnt=Integer.parseInt(aux);
		
		switch(opcion) {
			
		case 1: 
			System.out.println("\nFinal Fantasy VII: Advent Children. (SALA 3D)");
			
			System.out.println("\nPor favor, introduzca el precio de las entradas para la SALA 3D:");
			aux=sc.nextLine();
			precEnt=Integer.parseInt(aux);
			
			precTot=precEnt*numEnt;
			
			System.out.printf("\nEl precio Total es de %.2f €.\n", precTot);
			break;
			
		case 2:
			System.out.println("\nNaruto: Road to Boruto. (SALA PARA NIÑOS)");
			
			System.out.println("\nPor favor, introduzca el precio de las entradas para la SALA DE NIÑOS:");
			aux=sc.nextLine();
			precEnt=Integer.parseInt(aux);
		
			precTot=precEnt*numEnt;
			
			System.out.printf("\nEl precio Total es de %.2f €.\n", precTot);
			break;
				
		case 3:
			System.out.println("\nJujutsu Kaisen 0. (SALA VIP)");
			
			System.out.println("\nPor favor, introduzca el precio de las entradas para la SALA VIP:");
			aux=sc.nextLine();
			precEnt=Integer.parseInt(aux);
			
			precTot=precEnt*numEnt;
			
			System.out.printf("\nEl precio Total es de %.2f €.\n", precTot);
			break;
				
		case 4:
			System.out.println("\nKimetsu No Yaiba: El Tren infinito. (SALA NORMAL)");
			
			System.out.println("\nPor favor, introduzca el precio de las entradas para la SALA NORMAL:");
			aux=sc.nextLine();
			precEnt=Integer.parseInt(aux);
			
			precTot=precEnt*numEnt;
			
			System.out.printf("\nEl precio Total es de %.2f €.\n", precTot);
			break;
				
		default:
			System.out.println("\nSala no disponible. Por favor, elija otra entre las disponibles.");
			break;
		}
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! Y... Disfrute de su película. >:)");
		System.out.println("------------------------------------------------------------------------");
		
	}

}
