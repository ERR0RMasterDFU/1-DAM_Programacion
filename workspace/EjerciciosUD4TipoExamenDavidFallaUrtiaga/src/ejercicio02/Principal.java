package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2- Vamos a intentar modelar a un vendedor ambulante de “productos tecnológicos”. Tendremos una clase abstracta 
		Producto cuyos atributos serán, como mínimo (quizá hagan falta más), precio base, cantidad de unidades de un producto 
		y nombre. Tendremos dos tipos específicos de productos, móviles y espadas láser.
		
		La clase móvil no tienen ningún atributo especial (podéis poner algunos que queráis como marca, modelo, etc.). 
		La clase Espada tiene como atributo un String que informe sobre el tipo de espada que es (simple, double...). 
		Ponemos String aunque no tenga mucho sentido, para trabajar con equals (). 
		
		Vamos a reescribir un método llamado calcularPVP (double porcentaje) que será el método que calcula el precio de 
		Venta al Público. En una clase ventas, además de tener un array de productos, se deben crear métodos que hagan las 
		siguientes operaciones: 
		
		* Devolver la cantidad de productos que quedan por vender (en total), sin especificar de qué tipo.
		* Calcular la cantidad total de dinero recaudado entre todas las ventas. 
		* Devolver cambio, pasando lo que se debe pagar y el dinero entregado y retornando la cantidad a devolver.
		* Mostrar listado de productos completo mostrando los avisos cuando sea necesario.
		
		Escribir también una clase principal para hacer todas las operaciones. Se pueden crear los objetos directamente sin 
		pedir los datos por teclado.
		
		El precio de venta al público de un móvil se calcula como el precio base más el porcentaje de ganancia del vendedor 
		(pasado desde fuera como parámetro) y el precio de venta de una espada láser es el precio base más el porcentaje de 
		ganancia más una cantidad fija solo si la espada láser es “doble”, como la de Darth Maul. Debemos tener en cuenta 
		también que, si se compra una espada láser debe aparecer un mensaje diciendo “¡Cuidadín al sacarla de la bolsa, que 
		hace pupa!”.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String aux;
		int opcion=0, tam=10;
		double ganancia=0.0, cantFija=0.0;
		
		Producto e1 = new EspadaLaser (312.54, 3, "Dymlos", true, "simple", 1);
		Producto e2 = new EspadaLaser (500.14, 5, "Chaltier", false, "doble", 2);
		Producto e3 = new EspadaLaser (900.00, 2, "Postgre.Sword", true, "doble", 2);
		Producto m1 = new Movil (237.78, 6, "Javaphone", false, "Eclipse", 3);
		Producto m2 = new Movil (150.99, 8, "Okkotsu", true, "Especial", 0);
		Producto m3 = new Movil (432.50, 4, "Zapatófono", false, "TÍA", 5);
		
		Producto [] lista = new Producto [tam];
			
		lista[0] = e1;
		lista[1] = m3;
		lista[2] = e3;
		lista[3] = m2;
		lista[4] = m1;
		lista[5] = e2;
		
		Ventas v = new Ventas(lista);
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("EJERCICIO 2 DEL TIPO EXAMEN :P.");
		System.out.println("------------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Por favor, introduzca el procentaje de ganancia.");
		aux=sc.nextLine();
		ganancia=Double.parseDouble(aux);
		
		System.out.println("\nPor favor, introduzca la cantidad extra que llevarán las espadas láser.");
		aux=sc.nextLine();
		cantFija=Double.parseDouble(aux);
		
		System.out.println();
		
		do {
			
			System.out.println("---------------------------------------------------------");
			System.out.println("1. VER PRODUCTOS DISPONIBLES.");
			System.out.println("2. CALCULAR EL DINERO CONSEGUIDO EN TOTAL.");
			System.out.println("3. DEVOLVER CAMBIO.");
			System.out.println("4. VER TIENDA COMPLETA.");
			System.out.println("0. IRSE DE LA TIENDA.");
			System.out.println("---------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		
			switch(opcion) {
			
				case 1:
					System.out.println("\nLa cantidad de productos disponibles es de "+v.contarCantidad()+".");
					System.out.println();
					break;
			
				case 2:
					System.out.printf("\nEl dinero recaudado con los productos vendidos es de: %.2f €\n\n", v.calcularDineroTotal(ganancia, cantFija));
					break;
			
				case 3:
					break;
			
				case 4:
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("\nERROR. Lo sentimos, esta tecla no está vinculada a ninguna de las opciones disponibles. Por favor, elija otra.\n");
					
			}
			
		}while(opcion!=0);
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("¡MUCHAS GRACIAS POR USAR EL PROGRAMA! - VUELVA PRONTO :V.");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
	}

}
