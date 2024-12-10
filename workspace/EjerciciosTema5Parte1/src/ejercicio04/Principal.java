package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4) Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de 
		teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como agregar, 
		borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato, etc. 
		Y un main para probar todo.*/
		
		Scanner sc = new Scanner (System.in);
		
		int opcion, edad;
		String aux, nombre, email, numTelefono;
		
		Contacto c;
		
		Map <Contacto, String> lista = new HashMap <Contacto, String> ();
		
		Agenda a = new Agenda (lista);
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 4 DE COLECCIONES!");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		do {
		
			System.out.println("\n-------------------------------------------------");
			System.out.println("1. CREAR NUEVO CONTACTO.");
			System.out.println("2. BORRAR CONTACTO.");
			System.out.println("3. VER LISTA DE CONTACTOS.");
			System.out.println("4. MODIFICAR CONTACTO EXISTENTE.");
			System.out.println("-------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca el nombre del nuevo contacto.");
				nombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca el correo electrónico del nuevo contacto.");
				email=sc.nextLine();
				
				System.out.println("Por favor, introduzca la edad del nuevo contacto.");
				aux=sc.nextLine();
				edad=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el número de teléfono del nuevo contacto.");
				numTelefono=sc.nextLine();
				
				a.agregarNuevoContacto(new Contacto (nombre, email, edad), numTelefono);
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				a.mostrarLista();
				break;
				
			default:
				System.out.println("\nERROR. Lo sentimos, esta tecla no está asignada a ninguna opción. Por favor, escoja otra.\n");
				break;
				
			case 0:
				System.out.println("\nSALIENDO...\n");
				break;
			}
			
			
		}while(opcion!=0);
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UUSAR EL PROGRAMA! // :P <(Espero que hayas aprendido TODO sobre el Map.)");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
	}

}
