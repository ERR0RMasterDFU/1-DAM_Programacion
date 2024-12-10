package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0, opcion2=0;
		double saldo=1200.00, dinRet=0, nuevoSal=0, precEnt=6.00, numEnt=0, precTot=0, dinIng=0;
		
		/*18. Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo, 
		retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos 
		necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al 
		saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.*/
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que simula la interfaz de un cajero automático!");
		System.out.println("------------------------------------------------------------------------");
		
		do {
		
		System.out.println("-------------------------------------");
		System.out.println("Pulse 1 para INICIAR el programa.");
		System.out.println("Pulse 0 para SALIR del programa.");
		System.out.println("-------------------------------------");
		
		aux= sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion){
			
			case 1:
				System.out.println("-------------------------------------");
				System.out.println("Pulse 1 para VER SALDO.");
				System.out.println("Pulse 2 para RETIRAR DINERO.");
				System.out.println("Pulse 3 para COMPRAR ENTRADAS.");
				System.out.println("Pulse 4 para INGRESAR DINERO.");
				System.out.println("-------------------------------------");
				
				aux= sc.nextLine();
				opcion2=Integer.parseInt(aux);
				
				switch(opcion2) {
				
					case 1:
						System.out.printf("\nSu saldo actual es de %.2f€.\n", saldo);
					break;
					
					case 2:
						System.out.println("Por favor, introduzca la cantidad de dinero que desea retirar.");
						aux= sc.nextLine();
						dinRet=Double.parseDouble(aux);
						
						if(dinRet<=saldo) {
							
							saldo= saldo-dinRet;
							
							System.out.printf("\nOperación realizada con éxito. Su saldo acual es de %.2f€.\n", saldo);
						}
						else {
							System.out.println("Lo sentimos, su saldo es inferior a la cantidad de dinero que desea retirar.");
						}
					break;
				
					case 3:
						System.out.printf("\nCada entrada cuesta %.2f€. ¿Cuántas desea comprar?\n", precEnt);
						aux= sc.nextLine();
						numEnt=Double.parseDouble(aux);
						
						precTot= numEnt*precEnt;
						
						if(precTot<=saldo) {
							
							System.out.printf("\nEl precio total que tendría que pagar por las entradas sería de %.2f€.", precTot);
							
							saldo= saldo-precTot;
							
							System.out.printf("\nOperación realizada con éxito. Su saldo actual es de %.2f€.\n", saldo);
						}
						else {
							System.out.println("Lo sentimos, su saldo es inferior a la cantidad de dinero que posee el precio total de las entradas.");
						}
					break;
					
					case 4:
						
						System.out.println("Por favor, introduzca la cantidad de dinero que desea ingresar.");
						aux= sc.nextLine();
						dinIng= Double.parseDouble(aux);
						
						saldo= saldo+dinIng;
						
						System.out.printf("\nOperación realizada con éxito. Ahora su saldo actual es de %.2f€.\n", saldo);
					break;
						
					default:
						System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.");
					break;
				
				}	
			break;
		
			case 0:
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su cajero automático >:)");
				System.out.println("-------------------------------------------------------------------------------------");
			break;
			
			default:
				System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.");
			break;
		
		}
		
		}while(opcion!=0);
		
	}

}
