package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0, opcion2=0, numInt=0, resto=0, dos=2, tope=0;
		double num=0, num2=0, resultado=0;
		
		/*19. Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta, 
		multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá 
		en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las 
		comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).*/
		
		System.out.println("---------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que simula una mini-calculadora!");
		System.out.println("---------------------------------------------------------");
		
		do {
			
			System.out.println("----------------------------------");
			System.out.println("Pulse 1 para INICIAR el programa.");
			System.out.println("Pulse 0 para SALIR del programa.");
			System.out.println("----------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				
				case 1: 
					System.out.println("Pulse 1 si quiere hacer una SUMA.");
					System.out.println("Pulse 2 si quiere hacer una RESTA.");
					System.out.println("Pulse 3 si quiere hacer una MULTIPLICACIÓN.");
					System.out.println("Pulse 4 si quiere hacer una DIVISIÓN.");
					System.out.println("Pulse 5 si quiere saber si un número es PAR o IMPAR.");
					
					aux=sc.nextLine();
					opcion2=Integer.parseInt(aux);
					
					switch(opcion2) {
					
						case 1:
							System.out.println("Por favor, introduzca el primer número que desea sumar.");
							aux=sc.nextLine();
							num=Double.parseDouble(aux);
							
							System.out.println("Por favor, introduzca al segundo número que desea sumar.");
							aux=sc.nextLine();
							num2=Double.parseDouble(aux);
							
							resultado=num+num2;
							
							System.out.printf("\nLa suma de "+num+" y "+num2+" es %.2f.\n", resultado);
						break;
						
						case 2:
							System.out.println("Por favor, introduzca el primer número que desea restar.");
							aux=sc.nextLine();
							num=Double.parseDouble(aux);
							
							System.out.println("Por favor, introduzca al segundo número que desea restar.");
							aux=sc.nextLine();
							num2=Double.parseDouble(aux);
							
							resultado=num-num2;
							
							System.out.printf("\nLa resta de "+num+" y "+num2+" es %.2f.\n", resultado);
						break;
						
						case 3:
							System.out.println("Por favor, introduzca el primer número que desea multiplicar.");
							aux=sc.nextLine();
							num=Double.parseDouble(aux);
							
							System.out.println("Por favor, introduzca al segundo número que desea multiplicar.");
							aux=sc.nextLine();
							num2=Double.parseDouble(aux);
							
							resultado=num*num2;
							
							System.out.printf("\nLa multiplicación de "+num+" y "+num2+" es %.2f.\n", resultado);
						break;
							
						case 4:
							System.out.println("Por favor, introduzca el primer número (dividendo) que desea dividir.");
							aux=sc.nextLine();
							num=Double.parseDouble(aux);
								
							do {
							System.out.println("Por favor, introduzca al segundo número (divisor) que desea sumar.");
							aux=sc.nextLine();
							num2=Double.parseDouble(aux);
							
							if(num2==0) {
								System.out.println("ERROR. Ningún numero puede dividirse entre 0 ¡INSENSATO! >:(. Por favor introduzca otro.\n");
							}
							}while(num2==0);
							
							resultado=num/num2;
							
							System.out.printf("\nLa división entre "+num+" y "+num2+" es %.2f.\n", resultado);
						break;
								
						case 5:
							System.out.println("Por favor, introduzca un número.");
							aux=sc.nextLine();
							numInt=Integer.parseInt(aux);
							
							resto=numInt%dos;
							
							if(resto==0) {
								System.out.println("El número que ha introducido es PAR.\n");
							}
							else {
								System.out.println("El número que ha introducido es IMPAR.\n");
							}
						break;
						
						default:
							System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.\n");
						break;
					}
					
				case 0:
				break;
				
				default:
					System.out.println("ERROR. No hay una opción establecida para dicha tecla. Por favor, escoja otra.");
				break;
			}

		}while(opcion!=0);
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su mini-calculadora. >:)");
			System.out.println("-------------------------------------------------------------------------------------");
		
	}

}
