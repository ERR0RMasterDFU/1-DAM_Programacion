package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, nombre, nombreIS="Alphonse Hohenheim Elric", contraseñaIS="30ctubrE1911", contraseña;
		
		/*8. Realizar un programa que simule un inicio de sesión leyendo por teclado el nombre del 
		usuario y la contraseña y comprobando si esos coinciden con unos guardados en unas 
		variables inicializadas por vosotros al comienzo del programa.*/
		
		System.out.println("--------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que simula un inicio de sesión!");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Por favor, introduzca su nombre de usuario.");
		aux=sc.nextLine();
		nombre=aux;
		
		if(nombre.equals(nombreIS)) {
			System.out.println("Por favor, introduzca la contraseña.");
			aux=sc.nextLine();
			contraseña=aux;
			
			if(contraseña.equals(contraseñaIS)) {
				System.out.println("\n¡ENHORABUENA! Ha conseguido iniciar sesión.");
			}
			else {
				System.out.println("\nSu contraseña es incorrecta. Por favor, inténtelo de nuevo.");
			}
		}
		else {
			System.out.println("\nSu nombre de usuario es incorrecto. Por favor, inténtelo de nuevo.");
		}
		
		System.out.println("\n----------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su cuenta, jeje. >:)");
		System.out.println("----------------------------------------------------------------------------------");
		
		
	}

}
