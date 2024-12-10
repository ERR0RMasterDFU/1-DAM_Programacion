package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Operaciones o;
		
		String aux;
		int opcion=0, num=0;
		
		
		/*3. Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al que se le 
		pase un número entero y diga si este es positivo o negativo y otro que diga si un número es par o impar. 
		La clase no debe tener ningún atributo. Se deben probar los métodos en el main.*/
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que contiene un método al que se le pase un número entero y diga si "
				+ "este es positivo o negativo y otro que diga si un número es par o impar!");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
		do {
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. INICIAR PROGRAMA");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("----------------------------------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					System.out.println("Por favor, introduzca un número.");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					o=new Operaciones();
					
					o.ComprobarPosNeg(num);
					o.MostrarPosNeg(o.ComprobarPosNeg(num));
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Lo sentimos, no existe ninguna tecla asignada a esa opción. Por favor, elija otra.");
					break;
					
			}
		
		}while(opcion!=0);

	
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su área circular >:).");
		System.out.println("-----------------------------------------------------------------------------------");
		
	}

}
