package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String aux;
		
		int opcion=0;
		
		double [] precioObjetos= {50, 60, 120, 200, 500};
		String [] objetos= {"Flechas", "Bombas", "Escudo", "Hada"};
		
		/*6. Muestra los valores de un array con números double, por ejemplo, precios o pagos de algo, 
		imprimiendo también la cabecera de dichos valores. Las cabeceras deben estar en otro array 
		de String, por ejemplo:
		Enero febrero marzo
		1200.55 2500.45 800.50*/

		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que muestra los valores de un array con números double y cabeceras con String!");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		do {
		
			System.out.println("--------------------------------------");
			System.out.println("1. INICIAR EL PROGRAMA");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("--------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					System.out.print("OBJETOS\t\t");
					for (int i = 0; i < objetos.length; i++) {
						System.out.print(objetos[i]+"\t\t");
					}
					
					System.out.println();
					System.out.print("PRECIO\t\t");
					for (int i = 0; i < objetos.length; i++) {
						System.out.print(precioObjetos[i]+"\t\t");
					}
					System.out.println();
					System.out.println();
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Lo sentimos, no existe ninguna tecla asignada a esa opción. Por favor, elija otra.");
					break;
			
			}
		
		}while(opcion!=0);

		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su cuarto array >:).");
		System.out.println("------------------------------------------------------------------------------------------------------------------");		
		
	}

}
