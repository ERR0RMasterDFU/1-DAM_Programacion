package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int numHor=0, numHorEx=0, dieciseis=16, cuarenta=40, veinte=20, opcion=0;
		double salario=0;
		
		
		/*16. Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
			Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga 
			16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa 
			deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario 
			que le corresponde.*/
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el salario semanal de un trabajador!");
		System.out.println("-------------------------------------------------------------------------");
		
		do {
			System.out.println("----------------------------------");
			System.out.println("Pulse 1 para INICIAR el programa.");
			System.out.println("Pulse 0 para SALIR del programa.");
			System.out.println("----------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					System.out.println("Por favor, introduzca el número de horas trabajadas.");
					aux=sc.nextLine();
					numHor=Integer.parseInt(aux);
					
					if(numHor<=cuarenta){
						salario= dieciseis*numHor;
						
						System.out.printf("\nSu salario semanal es de %.2f €.\n",salario);
					}
					else {
						numHorEx=numHor-cuarenta;
						salario= (dieciseis*cuarenta)+(numHorEx*veinte);
						
						System.out.printf("\nSu salario semanal es de %.2f €.\n",salario);
					}
				break;
				
				case 0:
					System.out.println("-----------------------------------------------------------------------------------");
					System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su salario semanal >:)");
					System.out.println("-----------------------------------------------------------------------------------");
				break;
				
				default:
					System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.\n");
				break;
			}
			
		}while(opcion!=0);

	}

}
