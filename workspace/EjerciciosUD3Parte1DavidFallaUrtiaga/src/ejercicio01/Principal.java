package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, nomAsig, fecha;
		int opcion, aula;
		
		Cabecera a1;
		
		/*1. Implementar una clase que modele la cabecera de los exámenes de un centro escolar. La información sobre 
		cada examen será el nombre de la asignatura, aula donde se realiza y un String con la fecha. Solo tendrá un 
		método para imprimir adecuadamente dicha cabecera.*/
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que modela la cabecera de los exámenes de un centro escolar.!");
		System.out.println("--------------------------------------------------------------------------------------");
	
		do {
			
			System.out.println("--------------------------------------");
			System.out.println("1. INICIAR EL PROGRAMA");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("--------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					System.out.println("Por favor, introduzca la materia de la que se va a examinar.");
					aux=sc.nextLine();
					nomAsig=aux;
					
					System.out.println("\nPor favor, introduzca el número del aula en el que se va a realizar el examen.");
					aux=sc.nextLine();
					aula=Integer.parseInt(aux);
					
					System.out.println("\nPor favor, introduzca la fecha de realización del examen.");
					aux=sc.nextLine();
					fecha=aux;
					
					a1=new Cabecera(nomAsig, aula, fecha);
					
					a1.cabeceraExam();
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Lo sentimos, no existe ninguna tecla asignada a esa opción. Por favor, elija otra.");
					break;
					
			}
		
		}while(opcion!=0);

	
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su cabecera >:).");
		System.out.println("-----------------------------------------------------------------------------------");

	}

}
