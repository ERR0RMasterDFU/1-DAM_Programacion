package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		
		String aux;
		double numRet=0, numSal=0, nuevoSal=0;
		/*4. Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta 
		bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar 
		es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.*/
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee el dinero que se quiere retirar de una cuenta y determina si es posible o no!");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\nLo sentimos, debido a un error debe introducir la cantidad de su saldo. Por favor, introduzca la cantidad de dinero que posee en el saldo de su cuenta bancaria.");
		aux=sc.nextLine();
		numSal=Double.parseDouble(aux);
		
		System.out.println("\nPor favor, introduzca la cantidad de dinero que desea retirar de su cuenta bancaria.");
		aux=sc.nextLine();
		numRet=Double.parseDouble(aux);
		
		numSal= numSal-numRet;
		
		if (numRet>numSal) {
			System.out.println("\nLo siento, no es posible retirar dicha cantidad porque su saldo actual ("+numSal+" €) es inferior al precio introducido.\n");
		}else {
			System.out.printf("\nProceso realizado, extracción de dinero con éxito (ahora su saldo es de %.2f €). Disfrute de su dinero.\n\n", numSal);
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su dinero (si su saldo es mayor claro). >:)");
		System.out.println("--------------------------------------------------------------------------------------------------------");	
	}

}
