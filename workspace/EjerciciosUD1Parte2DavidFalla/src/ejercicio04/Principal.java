package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String aux;
		int edad=0, dias=0, equiv=365;
		
		/*4. Calcular la edad de una persona en días. Se usará una variable edad cuyo valor leeremos por 
		teclado y mostraremos por pantalla el número de días suponiendo que todos los años tienen 365 días.*/
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula la edad de una persona en días!");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Introduzca su edad.");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		dias=edad*equiv;
		System.out.println(edad+" años son "+dias+" días.");
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! y... Disfrute de su conversor :V.");
		System.out.println("------------------------------------------------------------------------");
		
	}

}
