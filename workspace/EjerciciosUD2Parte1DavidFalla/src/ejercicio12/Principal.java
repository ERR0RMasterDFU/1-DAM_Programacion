package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double altura=0, peso=0, imc=0;
		int dos=2, opcion;
		
		/*12. Implementar un programa que calcule el índice de masa corporal (IMC) de una persona y diga 
		en qué estado se encuentra dependiendo del resultado, según la tabla. El IMC se calcula 
		dividiendo el peso de una persona en kg entre la altura en metros al cuadrado, es decir:
		
		IMC= peso/altura2
		
		------------------------------------------------------------------
		VALOR IMC     |                  Diagnóstico
		------------------------------------------------------------------
		< 16          |        Criterio de ingreso en hospital
		de 16 a 17    |                   infrapeso
		de 17 a 18    |                   bajo peso
		de 18 a 25    |           peso normal (saludable)
		de 25 a 30    |         sobrepeso (obesidad de grado I)
		de 30 a 35    |     sobrepeso crónico (obesidad de grado II)
		de 35 a 40    |   obesidad premórbida (obesidad de grado III)
		>40           |    obesidad mórbida (obesidad de grado IV)
		-------------------------------------------------------------------*/
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el índice de masa corporal (IMC) de una persona y dice en qué estado se encuentra dependiendo del resultado!");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Por favor, introduzca su altura (m).");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca su peso (Kg).");
		aux=sc.nextLine();
		peso=Double.parseDouble(aux);
		
		imc=peso/Math.pow(altura, dos);
		
		System.out.printf("\nSu IMC es de %.2f.\n", imc);
		
		System.out.println("\nSi su IMC es menor de 16 pulse 1.");
		System.out.println("Si su IMC está entre 16 y 17 pulse 2.");
		System.out.println("Si su IMC está entre 17 y 18 pulse 3.");
		System.out.println("Si su IMC está entre 18 y 25 pulse 4.");
		System.out.println("Si su IMC está entre 25 y 30 pulse 5.");
		System.out.println("Si su IMC está entre 30 y 35 pulse 6.");
		System.out.println("Si su IMC está entre 35 y 40 pulse 7.");
		System.out.println("Si su IMC es mayor de 40 pulse 8.");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		
		case 1:
			System.out.println("Su diagnóstico es: Criterio de ingreso en hospital.");
			break;
			
		case 2:
			System.out.println("Su diagnóstico es: Infrapeso.");
			break;
			
		case 3:
			System.out.println("Su diagnóstico es: Bajo peso.");
			break;
			
		case 4:
			System.out.println("Su diagnóstico es: Peso normal (saludable).");
			break;
			
		case 5:
			System.out.println("Su diagnóstico es: Sobrepeso (obesidad de grado I).");
			break;
			
		case 6:
			System.out.println("Su diagnóstico es: Sobrepeso crónico (obesidad de grado II).");
			break;
			
		case 7:
			System.out.println("Su diagnóstico es: Obesidad premórbida (obesidad de grado III).");
			break;
			
		case 8:
			System.out.println("Su diagnóstico es: Obesidad mórbida (obesidad de grado IV).");
			break;

			default:
				System.out.println("Me parece a mí que más que gord@ está usted cieg@");
				break;
		} 
		
		System.out.println("\n----------------------------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su IMC, sea bueno o no tan bueno... >:)");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	
	}

}
