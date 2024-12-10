package ejercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0, numVen=0, veinte=20, cien=100;
		double sueldoF=0, dinVen=0, salarMen=0;
		
		/*17. Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de 
		un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra 
		por ventas se calculará mediante el 20 % de lo vendido en total al mes.*/
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el salario mensual de un vendedor!");
		System.out.println("--------------------------------------------------------------------------");
		
		do {
			System.out.println("----------------------------------");
			System.out.println("Pulse 1 para INICIAR el programa.");
			System.out.println("Pulse 0 para SALIR del programa.");
			System.out.println("----------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					System.out.println("Por favor, introduzca su sueldo fijo.");
					aux=sc.nextLine();
					sueldoF=Double.parseDouble(aux);
				
					System.out.println("Por favor, introduzca su número de ventas mensuales.");
					aux=sc.nextLine();
					numVen=Integer.parseInt(aux);
					
					dinVen= veinte*(numVen)/cien;
					salarMen=sueldoF+dinVen;
					
					System.out.printf("\nSu salario mensual es de %.2f €.\n\n", salarMen);
				break;
				
				case 0:
					System.out.println("-----------------------------------------------------------------------------------");
					System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su salario mensual >:)");
					System.out.println("-----------------------------------------------------------------------------------");
				break;
				
				default:
					System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.\n");
				break;	
			}
			
		}while(opcion!=0);

	}

}
