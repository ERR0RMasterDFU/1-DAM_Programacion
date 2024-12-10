package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double millas=0, metros=0, equiv=1852;
				
		/*3. Realizar un programa que lea por teclado un valor correspondiente a una distancia en millas 
		marinas (con decimales) y las escriba expresadas en metros. Sabiendo que 1 milla marina equivale
		a 1852 metros.*/
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que lee por teclado un valor correspondiente a una "
				+ "distancia en millas marinas (con decimales) y las escribe expresadas en metros!");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Introduzca el número de millas marinas.");
		aux=sc.nextLine();
		millas=Double.parseDouble(aux);
		
		metros=millas*equiv;
		System.out.printf("%.2f millas marinas son %.2f metros.\n", millas, metros);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar el programa! y... Disfrute de su conversor :V.");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
				
	}

}
