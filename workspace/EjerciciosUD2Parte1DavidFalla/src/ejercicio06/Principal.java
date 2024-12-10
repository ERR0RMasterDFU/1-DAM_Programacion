package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double nota1=0, nota2=2, nota3=3, tres=3, media=0;
		
		/*6. Crear un programa que reciba por teclado 3 notas, calcule la media y diga si la media sale 
		aprobada o no.*/
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula la media de 3 notas y dice si sale aprobada o no!");
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("Por favor, introduzca la primera nota.");
		aux=sc.nextLine();
		nota1=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca la segunda nota.");
		aux=sc.nextLine();
		nota2=Double.parseDouble(aux);
		
		
		System.out.println("Por favor, introduzca la tercera nota.");
		aux=sc.nextLine();
		nota3=Double.parseDouble(aux);
		
		media= (nota1+nota2+nota3)/tres;
		
		if(media>=5){
			System.out.printf("\nSu media está aprobada con un %.2f, ¡ENHORABUENA!\n", media);
		}
		else {
			System.out.printf("\nSu media está suspensa con un %.2f, ¡HAY QUE ESFORZARSE! :V\n", media);
		}
		
		System.out.println("\n---------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de sus alegrías, o tristezas... >:)");
		System.out.println("---------------------------------------------------------------------------------------------");
		
	}

}
