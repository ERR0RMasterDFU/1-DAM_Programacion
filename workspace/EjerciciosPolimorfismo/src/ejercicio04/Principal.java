package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String aux, nombre ; 
		int opcion=0, codigoID=0, dias;
		double precioUni=0, descuento, impuestoEs;
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 4 (POLIMORFISMO)!");
		System.out.println("------------------------------------------------------------------------------------------------");
	
		Producto p;
		Alimentacion a;
		
		Producto [] lista  = new Producto[100];
		
		Producto p1= new Alimentacion (3.00, "manzana", 1, 0, 4);
		Producto p2= new Alimentacion (6.00, "Galletas", 2, 0, 7);
		Producto p3= new Electronica (6.00, "cable", 3, );
		
		do {
			
			System.out.println("------------------------------------------------");
			System.out.println("1. IMPRIMIR TICKET");
			System.out.println("2. LISTAR PRODUCTOS.");
			System.out.println("0. SALIR.");
			System.out.println("------------------------------------------------");
			aux= sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
			
			
			case 2:
			
				
			default:
				System.out.println("ERROR. NO EXISTE UNA OPCIÓN ASIGNADA A DICHA TECLA, POR FAVOR PULSE OTRA. ");
			}
			
		}while(opcion!=0);
		
		System.out.println("¡MUCHAS GRACIAS POR USAR EL PRGRAMA! :P.");		
		
	}

}
