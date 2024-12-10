package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int num=0, num2=0, result=0, uno=1, cero=0, opcion;
		
		//13. Leer un número entero y mostrar su tabla de multiplicar.
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee un número entero y muestra su tabla de multiplica!");
		System.out.println("-----------------------------------------------------------------------------------");
		
		do {
			System.out.println("\nPulse 1 para inciar el programa.");
			System.out.println("Pulse 0 para salir del programa.");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					num2=0;
					System.out.println("Por favor, introduzca su número ENTERO");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					while(num2<11) {
						
						result=num*num2;
						
						System.out.println("El resultado de "+num+"*"+num2+" = "+result+".");
						
						num2=num2+uno;
					}
				break;
				
			case 0:
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de sus tablas de multiplicar. A mí aprendérmelas me costó lo suyo (6 años)... >:)");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
				break;
			
			default:
				System.out.println("ERROR.");
			}
		
		}while(opcion==uno);
		
	}

}
