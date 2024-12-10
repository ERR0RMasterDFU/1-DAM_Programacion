package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1. El precio final de venta de un automóvil nuevo para un comprador es la suma total de: el coste de fabricación 
		del vehículo, el porcentaje de la ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de 
		fabricación). Pedir por teclado la ganancia del vendedor que se quiere en porcentaje en cada coche, el % de 
		impuesto y el coste de fabricación y diseñar un programa para calcular el precio final de un automóvil e 
		imprimirlo por pantalla.*/
		
		String aux;
		double cosFab=0, porGan=0, gan=0, porImp=0, imp=0, cien=100, precFin=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el precio final de un automóvil!");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Por favor, Introduzca el porcentaje de ganancia del vendedor.");
		aux=sc.nextLine();
		porGan =Double.parseDouble(aux);
	
		System.out.println("Por favor, Introduzca el porcentaje de impuestos estatales aplicables.");
		aux=sc.nextLine();
		porImp=Double.parseDouble(aux);
		
		System.out.println("Por favor, Introduzca el coste de fabricación.");
		aux=sc.nextLine();
		cosFab=Double.parseDouble(aux);
		
		gan= cosFab*(porGan/100);
		imp= cosFab*(porImp/cien);
		precFin= cosFab+gan+imp;
		
		System.out.printf("\nEl precio final del automóvil es de %.2f €.\n", precFin);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! y... Disfrute de él :V.");
		System.out.println("---------------------------------------------------------------------");
		
	}

}
