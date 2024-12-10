package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*13. Imprime por pantalla un ticket de metro de Sevilla, donde se hayan pagado un viaje para dos personas 
		y que tenga un salto, es decir, debe aparecer el precio por persona, el precio base más lo que se paga 
		por el "salto de zona" y el precio total a pagar. No hace falta imprimir ni gestionar el cambio.*/
		
		double pers=2, salto1=1.17, Pbase=0.82, SaltZon=0, precTot=0;
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que imprime el ticket del metro de Sevilla!");
		System.out.println("-------------------------------------------------------------------\n");
				
		SaltZon=salto1-Pbase;
		precTot=pers*salto1;
		
		System.out.println("METRO DE SEVILLA");
		System.out.println("Fecha: 01/10/2023  18:55");
		System.out.println("-------------------------------------------------");
		System.out.println("Tipo de Título: Complejo 1 Salto");
		System.out.println("Cantidad: 02         Importe título: "+salto1+" EUR");
		System.out.println("                     Importe Soprte: 0.00 EUR");
		System.out.println("Importe Base:                        "+Pbase+" EUR");
		System.out.println("Salto de zona:                       "+SaltZon+" EUR");
		System.out.println("-------------------------------------------------");
		System.out.println("PRECIO TOTAL: "+precTot+" EUR");
		
		
		System.out.println("\nGracias por usar el metro de Sevilla. (.^ v ^.)" );
		
		
		
		
	}

}
