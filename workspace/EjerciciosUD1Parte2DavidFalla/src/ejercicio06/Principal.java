package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*6. Realizar un programa para calcular y mostrar por pantalla el sueldo de un trabajador. Se deben pedir 
		todos los datos necesarios por teclado. El sueldo se calcula multiplicando las horas trabajadas por el 
		precio de la hora "normal" más las horas extras por el precio al que se paga una hora extra (mayor que 
		una normal).*/
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula y muestra por pantalla el sueldo de un trabajador!");
		System.out.println("---------------------------------------------------------------------------------------\n");
		
		Scanner sc= new Scanner(System.in);
		
		String aux;
		double sueldo=0.0, horaTrab=0.0, precHora=0.0, horaExTrab=0.0, precHoraEx=0.0;
		
		System.out.println("Ingrese su número de horas trabajadas.");
		aux=sc.nextLine();
		horaTrab=Double.parseDouble(aux);
		System.out.printf("Su número de horas trabajadas es de %.0f horas.\n", horaTrab);
		
		System.out.println("\nIndique cuántos euros cobra por cada hora trabajada.");
		aux=sc.nextLine();
		precHora=Double.parseDouble(aux);
		System.out.printf("Usted cobra %.2f € por cada hora.\n", precHora);
		
		System.out.println("\nIngrese su número de horas extras trabajadas");
		aux=sc.nextLine();
		horaExTrab=Double.parseDouble(aux);
		System.out.printf("Su número de horas extras trabajadas es de %.0f horas.\n", horaExTrab);
		
		System.out.println("\nIndique cuántos euros cobra por cada hora extra trabajada.");
		aux=sc.nextLine();
		precHoraEx=Double.parseDouble(aux);
		System.out.printf("Usted cobra %.2f € por cada hora extra.\n", precHoraEx);
		
		sueldo= (horaTrab*precHora)+(horaExTrab*precHoraEx);
		
		System.out.printf("\nSu sueldo será de %.2f €.\n", sueldo);
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Gracias por usar nuestro programa (^ v ^)");
		System.out.println("------------------------------------------------------------");

	}

}
