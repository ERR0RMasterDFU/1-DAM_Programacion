package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2. Realizar un programa que use la siguiente interface con dos clases que la implementen, la clase Producto 
		que implemente el primer método y la clase Trabajador que implemente el segundo método (¿Qué habrá que hacer 
		con el que no se implementa?), y una clase de prueba para ver los resultados:
			
			Public interface IImpuesto {
			
				double calculoIva (double precio, int iva);
				double calculoIrpf (double sueldo);
				
			}*/
		Scanner sc = new Scanner(System.in);
		
		String aux, nombre;
		int iva=0;
		double precio=0.0, sueldo=0.0;
		
		Producto p;
		Trabajador t;
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 2 DE INTERFACES!");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, introduzca el precio del producto");
		aux=sc.nextLine();
		precio=Double.parseDouble(aux);
		
		System.out.println("\nPor favor, introduzca el precio del IVA.");
		aux=sc.nextLine();
		iva=Integer.parseInt(aux);
		
		p = new Producto (precio, iva);
		
		System.out.println("\nPor favor, introduzca el nombre del trabajador.");
		aux=sc.nextLine();
		nombre=aux;
		
		System.out.println("\nPor favor, introduzca el sueldo del trabajador.");
		aux=sc.nextLine();
		sueldo=Double.parseDouble(aux);
		
		t = new Trabajador (nombre);

		System.out.printf("\nEl IVA del producto es del %.2f %%.\n",p.calcularIva(precio, iva));
		
		System.out.printf("\nEl IRPF del trabajador "+t.getNombre()+" es del %.2f %%.\n",t.calcularIrpf(sueldo));
		
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UTILIZAR EL PROGRAMA! ESTE EJERCICIO ES MUY RARO >:P.");
		System.out.println("---------------------------------------------------------------------------------");
		
		
		
		
		
	}

}
