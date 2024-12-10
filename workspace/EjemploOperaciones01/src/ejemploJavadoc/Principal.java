package ejemploJavadoc;

import java.util.Scanner;
/**
 * @author ikern
 * 
 */

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion=0;
		double num1=0, num2=0;
		
		/**Hace referencia a la clase Operaciones.
		 * @see Operaciones.java
		 */
		Operaciones o = new Operaciones();
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL PROGRAMA QUE IMITA A UNA CALCULADORA!");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		do {
			
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. SUMAR.");
			System.out.println("2. RESTAR.");
			System.out.println("3. MULTIPLICAR.");
			System.out.println("4. DIVIDIR.");
			System.out.println("----------------------------------------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("\nPor favor, introduzca el primer número que va a sumar.");
				aux=sc.nextLine();
				num1=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el segundo número que va a sumar.");
				aux=sc.nextLine();
				num2=Integer.parseInt(aux);
				
				System.out.println("\nEl resultado de la suma es: "+o.sumar(num1, num2)+"\n"); 
				break;
				
			case 2:
				
				System.out.println("\nPor favor, introduzca el primer número que va a restar.");
				aux=sc.nextLine();
				num1=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el segundo número que va a restar.");
				aux=sc.nextLine();
				num2=Integer.parseInt(aux);
				
				System.out.println("\nEl resultado de la resta es: "+o.restar(num1, num2)+"\n");
				break;
				
			case 3:
				
				System.out.println("\nPor favor, introduzca el primer número que va a multiplicar.");
				aux=sc.nextLine();
				num1=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el segundo número que va a multiplicar.");
				aux=sc.nextLine();
				num2=Integer.parseInt(aux);
				
				System.out.println("\nEl resultado de la multiplicación es: "+o.multiplicar(num1, num2)+"\n"); 
				break;
				
			case 4:
				
				System.out.println("\nPor favor, introduzca el primer número que va a dividir.");
				aux=sc.nextLine();
				num1=Integer.parseInt(aux);
				
				do {
					
					System.out.println("Por favor, introduzca el segundo número que va a dividir.");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					o.comprobarDivision(num2);
					
				}while(num2==0);
				
				System.out.println("\nEl resultado de la división es: "+o.dividir(num1, num2)+"\n"); 	
				break;
				
			default:
				System.out.println("\nLo sentimos, no existe ninguna tecla asignada a esa opción. Por favor, elija otra.\n");
			
			case 0:
				break;
			
			}
			
		}while(opcion!=0);
		
		System.out.println("\n----------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA :P!");
		System.out.println("----------------------------------------------------------------------------------------------");
		
	}

}