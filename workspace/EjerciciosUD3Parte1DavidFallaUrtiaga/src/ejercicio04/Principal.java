package ejercicio04;

import java.util.Scanner;

import ejercicio03.Operaciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Cilindro c;
		
		String aux;
		int opcion=0;
		double radio=0, altura=0;
		
		/*4. Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis 
		decidir qué método usar y qué valores pasarle. Se debe tener la clase Cilindro.*/
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el volumen de un cilindro!");
		System.out.println("---------------------------------------------------------------");
	
		do {
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. INICIAR PROGRAMA");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("----------------------------------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					System.out.println("\nPor favor, introduzca el valor del radio del cilindro.");
					aux=sc.nextLine();
					radio=Integer.parseInt(aux);
					
					System.out.println("\nPor favor, introduzca el valor de la altura del cilindro.");
					aux=sc.nextLine();
					altura=Integer.parseInt(aux);
					
					c=new Cilindro();
					
					c.calcularVolumenCilindro(radio, altura);
					c.MostrarVol(c.calcularVolumenCilindro(radio, altura));
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
