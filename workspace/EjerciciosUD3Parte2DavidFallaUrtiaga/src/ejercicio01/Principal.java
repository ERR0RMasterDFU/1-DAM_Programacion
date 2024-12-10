package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Producto p;
		Tienda t;
		
		String aux, nombre;
		int opcion, tam=0;
		double costeTransporte=0, precioFabrica=0, precioVentaPublico=0, codigo=0;
		boolean fragilidad;
		
		Producto lista[] = new Producto[tam];
		
		
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta 
		clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje 
		pasado como parámetro que será el coste en el transporte.
		En una clase Tienda, con un array de productos como atributo se podrá: 
		
		- Listar datos de todos los productos.
		
		- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
		
		- Añadir un producto a la lista pasando como parámetro un producto. 
		
		- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los 
		precios de fábrica.
		
		- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio 
		de fábrica.
		
		- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los 
		precios de venta al público menos la suma de todos los precios de fábrica.
		
		Crear un main de prueba con un menú donde se pueda hacer todo esto.*/
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que simula una máquina vendedora de tickets de metro!");
		System.out.println("------------------------------------------------------------------------------\n");
		
		System.out.println("Por favor, introduzca el valor de coste en el transporte (%).");
		aux=sc.nextLine();
		costeTransporte=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca el tamaño máximo de la lista.");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		p=new Producto(precioFabrica, nombre, precioVentaPublico, fragilidad, codigo);
		t=new Tienda(p);
		
		do {
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("1. LISTAR DATOS.");
			System.out.println("2. AÑADIR PRODUCTO.");
			System.out.println("3. CALCULAR CANTIDAD INVERTIDA POR LA TIENDA EN COMPRAR TODOS LOS PRODUCTOS.");
			System.out.println("4. CALCULAR PVP");
			System.out.println("5. CALCULAR POSIBLES GANANCIAS CON EL FIN DE EXISTENCIAS.");
			System.out.println("0. SALIR DEL PROGRAMA");
			System.out.println("------------------------------------------------------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					
					break;
				
				case 2:
					
					if(cantPago>m.CalcularPrecioTotal(numTickets)) {
						System.out.printf("\nSu devolución es de %.2f €\n\n", m.CalcularDevolucion(cantPago, numTickets));
					}else {
						System.out.println("ERROR. COMPRE SU TICKET DE NUEVO.\n");
					}
					break;
					
				case 3:
					
					if(numTickets<=0) {
						System.out.println("\nERROR. TIENE QUE COMPRAR UN TICKET SI QUIERE VISUALIZARLO :0\n");
					}else {
						if(numTickets>uno) {
							System.out.println("\n********************************************************************");
							System.out.println("METRO DE SEVILLA");
							System.out.println("Fecha: 01/10/2023  18:55");
							System.out.println("-------------------------------------------------");
							System.out.println("\nCantidad: "+numTickets);
							System.out.printf("Importe ticket: %.2f €\n", precioTicket);
							System.out.println("\n-------------------------------------------------");
							System.out.println("PRECIO TOTAL: "+m.CalcularPrecioTotal(numTickets)+" €\n");
							System.out.printf("Su importe: %.2f €\t\t  Devolución: %.2f €\n", cantPago, m.CalcularDevolucion(cantPago, numTickets));
							System.out.println("\nTICKET VÁLIDO PARA "+numTickets+" PERSONAS");
							System.out.println("********************************************************************");
							
						}else {
							System.out.println("\n********************************************************************");
							System.out.println("METRO DE SEVILLA");
							System.out.println("Fecha: 01/10/2023  18:55");
							System.out.println("-------------------------------------------------");
							System.out.println("\nCantidad: "+numTickets);
							System.out.printf("Importe ticket: %.2f €\n", precioTicket);
							System.out.println("\n-------------------------------------------------");
							System.out.println("PRECIO TOTAL: "+m.CalcularPrecioTotal(numTickets)+" €\n");
							System.out.printf("Su importe: %.2f €\t\t  Devolución: %.2f €", cantPago, m.CalcularDevolucion(cantPago, numTickets));
							System.out.println("********************************************************************");
							}
					}
					break;
					
					
				case 0:
					break;
					
				default:
					System.out.println("Lo sentimos, no existe ninguna tecla asignada a esa opción. Por favor, elija otra.");
					break;
					
			}
		
		}while(opcion!=0);

	
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("¡Muchas gracias por usar nuestro programa! y... Disfrute de su viajeeee >:).");
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
		
	}

}

		
		