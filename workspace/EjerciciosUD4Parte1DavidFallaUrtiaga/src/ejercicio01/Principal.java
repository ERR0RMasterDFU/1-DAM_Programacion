package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String aux, marca;
		double capDiscoDuro= 0.0, frecProcesador= 0.0, precioBase= 0.0, precioMontaje= 0.0, precioSeguro= 0.0, ganancia=0.0; 
		boolean seguros;
		
		Ordenador o;
		Portatil p;
		Sobremesa s;
		
		/*Crear un programa con una clase Ordenador que permita modelar uno con características como
		capacidad de disco duro, frecuencia del procesador, precio base y marca. Crear dos clases hijas,
		llamadas Sobremesa y Portátil. Añadir a Sobremesa el atributo precioMontaje y al portátil otro atributo
		que será un booleno por si se quiere o no seguro para la pantalla y otro con la cantidad a pagar por
		dicho seguro.
		La clase madre debe tener un método para calcular el precio de venta al público aplicando un % de
		ganancia del vendedor al precio base. Este método se debe reescribir en las clases hijas sumando la
		cantidad adecuada en el caso del montaje o la cantidad del seguro solo si el cliente lo quiere contratar.
		Crear un main sencillo (no es necesario crear menú) para comprobar todo, basta llamar a los métodos
		en orden adecuado y mostrar el resultado de los cálculos que hace cada uno, es decir, el precio de venta
		al público de un objeto de cada subtipo (uno de sobremesa y un portátil).*/
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("¡BIEVENIDO AL PROGRAMA DE SUPERCLASES Y SUBCLASES!");
		System.out.println("-------------------------------------------------------------------------\n");
		
		System.out.println("Por favor, introduzca el porcentaje de ganancia que quiere llevarse del producto.");
		aux=sc.nextLine();
		ganancia= Double.parseDouble(aux);
		
		System.out.println("\nPor favor, introduzca el precio del seguro.");
		aux=sc.nextLine();
		precioSeguro= Double.parseDouble(aux);
		
		System.out.println("\nPor favor, introduzca el precio por el montaje.");
		aux=sc.nextLine();
		precioMontaje= Double.parseDouble(aux);
		
		o= new Ordenador (300, 2.5, 400, "Lenovo");
		p= new Portatil (400, 2.0, 250, "Rareware", true, precioSeguro);
		s= new Sobremesa (600, 4.4, 500, "AKrgo", precioMontaje);
		
		System.out.println("\n"+o);
		System.out.println(p);
		System.out.println(s);
		
		System.out.printf("\nEl precio de venta al público de un ordenador es de %.2f euros.", o.calcularPrecioVentaPublico(ganancia));
		System.out.printf("\nEl precio de venta al público de un portátil es de %.2f euros.", p.calcularPrecioVentaPublico(ganancia));
		System.out.printf("\nEl precio de venta al público de un sobremesa es de %.2f euros.\n", s.calcularPrecioVentaPublico(ganancia));
		
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA! - >:P SOY TODO UN PADRE.");
		System.out.println("-------------------------------------------------------------------------");
	}

}
