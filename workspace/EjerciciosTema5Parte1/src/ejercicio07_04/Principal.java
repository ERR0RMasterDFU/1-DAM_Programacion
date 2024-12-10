package ejercicio07_04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Alimentacion ("Melocotón", 1, 2.30, 45, false);
		Producto p2 = new Electronica ("Cable", 2, 5.50, 30);
		
		LineaDeVenta lv1 = new LineaDeVenta(p1,4);
		LineaDeVenta lv2 = new LineaDeVenta(p2,3);
		
		/*4. Hacer un programa que imprima un ticket de compra, basándonos en un supermercado. Debemos crear la clase Producto 
		genérica y dos hijas con un atributo más cada una (Alimentación y Electrónica). 
		
		Cada Producto genérico deberá estar caracterizado por el precio unitario, nombre, código de identificación, etc. 
		El precio de los productos de electrónica lleva un impuesto especial por ser de lujo y la alimentación un descuento 
		cuando le quedan menos de 2 días para caducar.
		La clase Línea de venta, con un producto y una cantidad como atributos y la clase Venta con un array de líneas de venta.
		El ticket debe mostrar una venta completa con varios productos y varias cantidades. 
		
		Se pueden crear los productos directamente en el main antes de empezar.
		Agregar un método solo en la clase alimentación, que avise si al producto le quedan menos de 2 días para caducar.
		Crear un main, donde crearemos directamente los objetos necesarios. Solo habrá la opción imprimir 
		ticket y listar todos los productos guardados, avisando cuando a un producto de alimentación le falten menos de 
		dos días para caducar*/
		
		Scanner sc = new Scanner (System.in);
		
		int opcion;
		
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 7 DEL TEMA 5 QUE REHACE EL EJERCICIO 4 DEL TEMA 4!");
		System.out.println("-----------------------------------------------------------------------------------------------------");

		do {
			
		}while(opcion!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
