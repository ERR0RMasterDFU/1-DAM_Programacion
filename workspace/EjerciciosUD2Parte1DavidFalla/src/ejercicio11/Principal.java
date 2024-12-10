package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, planeta1="Mercurio", planeta2="Venus", planeta3="Tierra", planeta4="Marte", planeta5="Júpiter", 
				planeta6="Saturno", planeta7="Urano", planeta8="Neptuno";
		int planetas=0;
		double peso=0,MercMart=0.38, Venus=0.91, Tierra=1.00, Jupiter=2.53, Saturno=1.06, Urano=0.92, Neptuno=1.2, pesoMercMart=0,
				pesoVen=0, pesoTie=0, pesoJup=0, pesoSat=0, pesoUra=0, pesoNep=0;
		
		/*11. Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por 
		pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes 
		(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
		
		PLANETA 		Mercurio 	Venus 		Tierra		Marte 		Júpiter 	Saturno 	Urano 		Neptuno
		EQUIVALENCIA 	0.38 		0.91 		1.00 		0.38 		2.53		 1.06 		0.92 		1.2*/
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el peso de una persona, y escriba por"
				+ " pantalla su peso en cualquier planeta del Sistema Solar a través de un menú!");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\nSi quiere descubir su peso en otro planeta simplemente indique su peso en este planeta (Tierra, creo).");
		aux=sc.nextLine();
		peso=Double.parseDouble(aux);
		
		System.out.printf("\nSi quiere saber su peso en %s, pulse 1.", planeta1);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 2.", planeta2);
		System.out.printf("\nSi quiere saber su peso en la %s, pulse 3, (Aunque no sé para que...).", planeta3);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 4.", planeta4);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 5.", planeta5);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 6.", planeta6);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 7.", planeta7);
		System.out.printf("\nSi quiere saber su peso en %s, pulse 8.\n", planeta8);
		aux=sc.nextLine();
		planetas=Integer.parseInt(aux);
		
		switch(planetas) {
		
		case 1: 
			pesoMercMart=peso*MercMart;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta1, pesoMercMart);
			break;
		
		case 2: 
			pesoVen=peso*Venus;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta2, pesoVen);
			break;
		
		case 3: 
			pesoTie=peso*Tierra;
			System.out.printf("\nSu peso en la %s es de %.2f Kg. ¡GUAU, QUE SORPRESA! es tu peso normal.", planeta3, pesoTie);
			break;
			
		case 4: 
			pesoMercMart=peso*MercMart;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta4, pesoMercMart);
			break;
			
		case 5: 
			pesoJup=peso*Jupiter;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta5, pesoJup);
			break;
			
		case 6: 
			pesoSat=peso*Saturno;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta6, pesoSat);
			break;
			
		case 7: 
			pesoUra=peso*Urano;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta7, pesoUra);
			break;
		
		case 8:
			pesoNep=peso*Neptuno;
			System.out.printf("\nSu peso en %s es de %.2f Kg.", planeta8, pesoNep);
			break;
			
		default:
			System.out.println("\nEse no es un número determinado para un planeta. Por favor, ¡ELIJA UN PLANETA! >:(");
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su peso extraterrestre  >:)");
		System.out.println("----------------------------------------------------------------------------------------");
		
	}

}
