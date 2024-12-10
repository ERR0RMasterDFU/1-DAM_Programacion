package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, dia;
		int numEntr=0, cien=100;
		double precEntr=0, total=0, desEntr=30, desTot=0, totalFin=0;
		
		/*9. Calcular el precio por entrar en el cine, pidiendo el número de entradas y el precio. Pedir el 
		día de la semana y si es miércoles (día del espectador) se aplicará un descuento del 30 % al 
		total.*/
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el precio por entrar en el cine!");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Por favor, introduzca el número de entradas deseadas.");
		aux=sc.nextLine();
		numEntr=Integer.parseInt(aux);
		
		System.out.println("Por favor, introduzca el precio de la entrada.");
		aux=sc.nextLine();
		precEntr=Integer.parseInt(aux);
		
		System.out.println("Por favor, introduzca el día de la semana.");
		aux=sc.nextLine();
		dia=aux;
		
		total= precEntr*numEntr;
		
		if(dia.equals("Miércoles")) {
			System.out.printf("\n¡ENHORABUENA! Sus entradas tienen un descuento del %.2f%%.", desEntr);
			
			desTot= total*desEntr/cien;
			totalFin= total-desTot;
			
			System.out.printf("\nEl total que tiene que pagar es de %.2f €.\n", totalFin);
		}
		else {
			System.out.printf("\nLo sentimos, su precio no tiene descuento. Deberá pagar %.2f €.\n", total);	
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su película... Creo. >:)");
		System.out.println("--------------------------------------------------------------------------------------");

	}

}
