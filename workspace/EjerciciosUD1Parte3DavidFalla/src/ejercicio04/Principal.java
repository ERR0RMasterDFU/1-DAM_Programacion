package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4. Cualquier cálculo de áreas, volúmenes, uso de fórmulas de física o matemáticas, etc.*/
		
		String aux;
		double bM=0, bm=0, h=0, a=0, dos=2;
		
		System.out.println("------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el área de un trapecio!");
		System.out.println("------------------------------------------------------------\n");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor, introduzca la longitud de la base mayor del trapecio.");
		aux=sc.nextLine();
		bM=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca la longitud de la base menor del trapecio.");
		aux=sc.nextLine();
		bm=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca la longitud de la altura del trapecio.");
		aux=sc.nextLine();
		h=Double.parseDouble(aux);
		
		a=(bM+bm)*h/dos;
		
		System.out.printf("\nEl área del trapecio que usted ha pedido es de %.2f metros cuadrados.", a);
		
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("Gracias por usar nuestro programa. Difrute de su trapecio nuevo :)");
		System.out.println("-------------------------------------------------------------------\n");
		
	}

}
