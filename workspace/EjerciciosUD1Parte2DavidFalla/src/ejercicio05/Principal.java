package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*5. ¿Qué saldo tendré al final del año en el banco si he abierto una cuenta, pago de mantenimiento un 1 %
		del saldo con la que la abrí inicialmente al año y tengo unos intereses del 3 % del saldo inicial? Hacer 
		un programa que calcule esto y lo muestre por pantalla leyendo por teclado el saldo inicial con el que se 
		quiere abrir la cuenta.*/
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el saldo final y muestra por pantalla leyendo por"
				+ "teclado el saldo inicial con el que se quiere abrir la cuenta!");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double saldoIn=0.0, manten=0.0, inter=0.0, saldoFi=0.0;
		
		System.out.println("Ingrese su saldo inicial");
		aux=sc.nextLine();
		saldoIn=Double.parseDouble(aux);
		System.out.println("Su saldo inicial es de "+saldoIn+" €.");
		
		manten=(1.0/100.0)*saldoIn;
		
		System.out.printf("El pago de mantenimiento es de: %.2f €.\n", manten);
		
		inter=(3.0/100.0)*saldoIn;
		
		System.out.printf("Sus intereses son de %.2f €.\n", inter);
		
		saldoFi=saldoIn-manten+inter;
		
		System.out.printf("\nSu saldo al final de año sería de %.2f €.\n", saldoFi);
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Gracias por usar nuestro programa (^ v ^)");
		System.out.println("------------------------------------------------------------\n");

	}

}
