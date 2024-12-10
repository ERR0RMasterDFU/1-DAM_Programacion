package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Hacer un programa que “imite” un cutre ticket de un McDonals que solo vende un tipo de hamburguesas, 
		un tipo de patatas y un tipo de refrescos. Se debe pedir por teclado las cantidades de cada uno y el precio de 
		una unidad y calcular el total de la venta, leer la cantidad entregada para pagar y el cambio.
		 	* Quién lo atendió: Vuestro nombre
		 	* Fecha: (usando un String, no el tipo fecha de java)
		 	* Patatas medianas: Precio 
		 	* Bebida mediana: precio
		 	* Hamburguesa Mc Royal: Precio
		 	* Total a pagar: Suma de los 3 precios.
		 	* Entregado: Cantidad entregada
		 	* Cambio: Cambio a devolver
		Se deben usar las variables y operaciones adecuadas y guardar todos los datos intermedios en variable*/
		
		String aux, fecha= "4 de Octubre de 2023", nombre= "David Falla Urtiga";
		double precPatM=0, precBebM=0, precHamRoy=0, tot=0, entr=0, camb=0;
		int cantPat=0, cantBeb=0, cantHam=0;
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que “imita” un cutre ticket de un McDonals que solo vende un "
				+ "tipo de hamburguesas, un tipo de patatas y un tipo de refresco!");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Por favor, indique su nombre (empleado).");
		aux=sc.nextLine();
		nombre= aux;
		System.out.println("El empleado que trabaja hoy es "+nombre+".");
		
		System.out.println("\nPor favor, indique la fecha de hoy.");
		aux=sc.nextLine();
		fecha= aux;
		System.out.println("Hoy es "+fecha+".");
		
		System.out.println("\n------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, indique el precio de las McPatatas medianas.");
		aux=sc.nextLine();
		precPatM= Double.parseDouble(aux);
		System.out.printf("El precio de las McPatatas medianas será de %.2f €.\n", precPatM);
		
		System.out.println("\nPor favor, indique el precio de las McBebidas medianas.");
		aux=sc.nextLine();
		precBebM= Double.parseDouble(aux);
		System.out.printf("El precio de las McBebidas medianas será de %.2f €.\n", precBebM);
		
		System.out.println("\nPor favor, indique el precio de las Hamburguesas McRoyal.");
		aux=sc.nextLine();
		precHamRoy= Double.parseDouble(aux);
		System.out.printf("El precio de las Hamburguesas McRoyal será de %.2f €.\n", precHamRoy);
		
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		System.out.println("Por favor, indique la cantidad pedida de McPatatas medianas.");
		aux=sc.nextLine();
		cantPat= Integer.parseInt(aux);
		
		System.out.println("\nPor favor, indique la cantidad pedida McBebidas medianas.");
		aux=sc.nextLine();
		cantBeb= Integer.parseInt(aux);
		
		System.out.println("\nPor favor, indique la cantidad pedida Hamburguesas McRoyal.");
		aux=sc.nextLine();
		cantHam= Integer.parseInt(aux);
		
		tot= (precPatM*cantPat)+(precBebM*cantBeb)+(precHamRoy*cantHam);
		
		System.out.println("\n---------------------------------------------------------------------------\n");
		
		System.out.println("\nTOTAL A PAGAR: "+tot+" €.");
		
		System.out.println("\nIndique el precio entregado por el cliente.");
		aux=sc.nextLine();
		entr= Double.parseDouble(aux);
		System.out.printf("\nEl precio entregado por el cliente es de %.2f €.\n", entr);
		
		camb= entr-tot;
		
		System.out.printf("\nEl cambio que hay que devolver al cliente es de %.2f €.\n", camb);
		
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("Gracias por usar nuestro programa, ahora... !A disfrutar de su hamburguesa! :D ");
		System.out.println("--------------------------------------------------------------------------------\n");
		
		
	}

}
