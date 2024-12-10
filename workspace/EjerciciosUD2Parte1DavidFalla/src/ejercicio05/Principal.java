package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double numBase=0, exp=0, uno=1, result=0, result2=0;
				
		/*5. Realiza un programa que calcule la potencia de un número, dado este y su exponente. 
		Pueden ocurrir tres casos:
		* El exponente sea positivo, imprime resultado en pantalla.
		* El exponente sea 0, el resultado es 1.
		* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.*/
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula la potencia de un número, dado este y su exponente!");
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("Por favor, introduzca el número base.");
		aux=sc.nextLine();
		numBase=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca el exponente.");
		aux=sc.nextLine();
		exp=Double.parseDouble(aux);
		
		result=Math.pow(numBase, exp);
		result2=uno/(Math.pow(numBase, exp*-1));
		
		if(exp==0) {
			System.out.printf("\nEl resultado es %.2f.", result);

		}else {
			
			if(exp>0) {
				System.out.printf("\nEl resultado es %.2f.", result);
				
			} else {
				System.out.printf("\nEl resultado es %.2f.", result2);
			}
		}
			
		System.out.println("\n\n----------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de sus bases y exponentes >:)");
		System.out.println("----------------------------------------------------------------------------------------");
		
	}

}
