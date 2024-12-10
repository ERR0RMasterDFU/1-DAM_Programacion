package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion;
		double radio=0, areaCm, areaM;
		
		Círculo a1;
		
		/*2. Hacer un programa que calcule el área de un círculo en cm2. 
		Debemos tener la clase Círculo, con un solo atributo llamado radio. En el main, debemos crear un objeto 
		tipo Círculo y llamar a dicho método. Mejorar el programa añadiendo a la clase Círculo otro método que 
		calcule el área del círculo en m2.*/
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa calcula el área de un círculo en cm2!");
		System.out.println("--------------------------------------------------------------");
	
		do {
			
			System.out.println("--------------------------------------");
			System.out.println("1. INICIAR EL PROGRAMA");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("--------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					System.out.println("Por favor, introduzca el valor del radio del círculo (en cm).");
					aux=sc.nextLine();
					radio=Double.parseDouble(aux);
					
					a1=new Círculo(radio);
					
					areaCm=a1.calcularAreaCm2();
					areaM=a1.calcularAreaM2();
					a1.mostrarDatos(areaCm, areaM);
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
