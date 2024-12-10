package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2. Crear un programa para gestionar los socios de un Club de campo. Se debe poder guardar Socios con sus
		datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos (operaciones CRUD). Usar la clase 
		ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se podrían agregar 
		funcionalidades como alquilar pistas, pagar cuotas, etc.
		
		Debemos usar la clase Socio, la clase Club y la principal como mínimo. Puedes probar a separar "las operaciones 
		CRUD" en una clase CRUDSocio de la clase Club*/
		
		Scanner sc = new Scanner (System.in);
		
		List <Socio> lista = new ArrayList <> ();
		
		CRUDSocio c = new CRUDSocio (lista);
		
		String aux, nombre;
		int opcion=0, id;
		double cuota;
		
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 2 DEL TEMA 5!");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. AÑADIR NUEVO SOCIO A LA LISTA.");
			System.out.println("2. MODIFICAR LA INFORMACIÓN DE UN SOCIO.");
			System.out.println("3. BORRAR SOCIO DE LA LISTA.");
			System.out.println("4. MOSTRAR LISTA DE SOCIOS.");
			System.out.println("0. SALIR.");
			System.out.println("----------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					
					System.out.println("Por favor. Introduzca un ID para el nuevo socio.");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Por favor. Introduzca un ID para el nuevo socio.");
					aux=sc.nextLine();
					nombre=aux;
					
					System.out.println("Por favor. Introduzca un ID para el nuevo socio.");
					aux=sc.nextLine();
					cuota=Double.parseDouble(aux);
					
					c.aniadirSocio(id, nombre, cuota);
					
					System.out.println("Socio añadido exitosamente :D.");
					break;
					
					
				case 2:
					
					c.mostrarLista();
					System.out.println("Introduzca el ID del socio al que quiere cambiarle la información.");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					c.buscarPorId(id);
					
					System.out.println("Por favor. Introduzca un nuevo ID.");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Por favor. Introduzca un nuevo nombre.");
					aux=sc.nextLine();
					nombre=aux;
					
					System.out.println("Por favor. Introduzca una nueva cuota.");
					aux=sc.nextLine();
					cuota=Double.parseDouble(aux);
					
					c.modificarIDSocio(id, c.buscarPorId(id));
					c.modificarNombreSocio(nombre, c.buscarPorId(id));
					c.modificarCuotaDSocio(cuota, c.buscarPorId(id));
					
					System.out.println("La información del socio se ha modificado correctamente");
					break;
					
					
				case 3:
					
					c.mostrarLista();
					System.out.println("Introduzca el ID del socio que desea eliminar.");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					c.eliminarSocio(c.buscarPorId(id));
					break;
					
				case 4:
					c.mostrarLista();
					break;
			}
			
			
		}while(opcion!=0);
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UTILIZAR EL PROGRAMA! |>:V| <(Este tema es muy duro.)");
		System.out.println("----------------------------------------------------------------------------------------------");
		
	}

}
