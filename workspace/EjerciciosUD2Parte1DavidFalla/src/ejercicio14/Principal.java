package ejercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0;
		double num1=0, num2=0, num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0, suma=0, prod=0;
		
		//14. Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos.
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee una secuencia de 10 números y muestra solo la suma y el producto de todos ellos!");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		do {
			
			System.out.println("\n----------------------------------");
			System.out.println("Pulse 1 para INICIAR el programa.");
			System.out.println("Pulse 0 para SALIR del programa.");
			System.out.println("----------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					
					System.out.println("Por favor, introduzca el primer número.");
					aux=sc.nextLine();
					num1=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el segundo número.");
					aux=sc.nextLine();
					num2=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el tercer número.");
					aux=sc.nextLine();
					num3=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el cuarto número.");
					aux=sc.nextLine();
					num4=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el quinto número.");
					aux=sc.nextLine();
					num5=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el sexto número.");
					aux=sc.nextLine();
					num6=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el séptimo número.");
					aux=sc.nextLine();
					num7=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el octavo número.");
					aux=sc.nextLine();
					num8=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el noveno número.");
					aux=sc.nextLine();
					num9=Double.parseDouble(aux);
					
					System.out.println("Por favor, introduzca el décimo número.");
					aux=sc.nextLine();
					num10=Double.parseDouble(aux);
					
					suma= num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
					System.out.printf("\nLa suma de los 10 dígitos es %.2f.", suma);
					
					prod= num1*num2*num3*num4*num5*num6*num7*num8*num9*num10;
					System.out.printf("\nEl producto de los 10 dígitos es %.2f.\n", prod);
				break;
					
				case 0:
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de sus sumas y productos de 10 números >:)");
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
				break;
				
				default:
					System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.");
				break;
				
			}	
			
		}while(opcion!=0);
		
	}

}