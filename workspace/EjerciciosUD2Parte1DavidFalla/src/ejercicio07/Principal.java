package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double precPro=0, desPro=0, total=0, desTot=0, totalFin=0;
		int cantPro=0, cien=100;
		
		/*7. Calcular el precio final de una compra de un solo producto, pidiendo por teclado el precio 
		del producto, la cantidad que se lleva y el porcentaje de descuento que se le aplica, pero solo 
		si el total es mayor de 100 €. Si no es superior, se mostrará el mensaje "No hay descuento".*/
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el precio final de una compra de un solo producto!");
		System.out.println("---------------------------------------------------------------------------------------");
		
		System.out.println("Por favor, introduzca el precio del producto.");
		aux=sc.nextLine();
		precPro=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca la cantidad que va a llevarse.");
		aux=sc.nextLine();
		cantPro=Integer.parseInt(aux);
		
		System.out.println("Por favor, introduzca el porcentaje de descuento.");
		aux=sc.nextLine();
		desPro=Integer.parseInt(aux);
		
		total= precPro*cantPro;
		
		if(total>100) {
			System.out.printf("\n¡ENHORABUENA! Su compra tiene un descuento del %.2f%%.", desPro);
			
			desTot= total*desPro/cien;
			totalFin= total-desTot;
			
			System.out.printf("\nEl total que tiene que pagar es de %.2f €.\n", totalFin);
		}
		else {
			System.out.printf("\nLo sentimos, su precio no tiene descuento. Deberá pagar %.2f €.\n", total);	
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su descuento... Creo. >:)");
		System.out.println("--------------------------------------------------------------------------------------");
	
	}

}
