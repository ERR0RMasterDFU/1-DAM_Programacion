package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Crear una pequeña lista con los datos personales de algunas Personas, y mostrarla por pantalla 
		de forma NO ordenada y de forma ordenada (elegid la forma de ordenar vosotros, podéis empezar con 
		orden natural, es decir, alfabéticamente y después crear otra “no natural”).*/
		
		Scanner sc = new Scanner (System.in);
		
		int opcion, codPersona, edad, indice, nuevoCodPersona, nuevaEdad;
		String aux, nombre, apellidos, nuevoNombre, nuevosApellidos;
		double altura, nuevaAltura;
		
		DatosPersonales dp;
		
		List <DatosPersonales> lista = new ArrayList <DatosPersonales>();
		ListaAlfabetica la = new ListaAlfabetica ();
		
		CRUDDatosPersonales cdp = new CRUDDatosPersonales(lista);

		lista.add(new DatosPersonales(3, "Kazuya", "Mishima", 52, 1.80));
		lista.add(new DatosPersonales(2, "Heihachi", "Mishima", 78, 1.78));
		lista.add(new DatosPersonales(1, "Jinpachi", "Mishima", 100, 2.20));
		lista.add(new DatosPersonales(5, "Jin", "Kazama", 24, 1.83));
		lista.add(new DatosPersonales(4, "Lars", "Alexanderson", 35, 1.85));		
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 5 DE COLECCIONES!");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		
		do {
	
			System.out.println("------------------------------------------------");
			System.out.println("1. AÑADIR DATOS NUEVOS.");
			System.out.println("2. MODIFICAR DATOS.");
			System.out.println("3. BORRAR DATOS.");
			System.out.println("4. MOSTRAR LISTA SIN ORDENAR.");
			System.out.println("5. MOSTRAR LISTA ORDENADA POR EL CÓDIGO DE PERSONA.");
			System.out.println("6. MOSTRAR LISTA ORDENADA ALFABÉTICAMENTE.");
			System.out.println("0. SALIR");
			System.out.println("------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca el número de la persona.");
				aux=sc.nextLine();
				codPersona=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el nombre de la persona.");
				nombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca los apellidos de la persona.");
				apellidos=sc.nextLine();
				
				System.out.println("Por favor, introduzca la edad de la persona.");
				aux=sc.nextLine();
				edad=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca la altura de la persona.");
				aux=sc.nextLine();
				altura=Double.parseDouble(aux);
				
				dp = new DatosPersonales(codPersona, nombre, apellidos, edad, altura);
				
				cdp.agregarDatos(dp);
				System.out.println("");
				break;
				
				
			case 2:
				System.out.println("");
				cdp.mostrarListaDatos();
				
				System.out.println("\nPor favor, introduzca el número de la persona que quiere modificar los datos.");
				aux=sc.nextLine();
				indice=Integer.parseInt(aux);
				
				System.out.println("\nPor favor, introduzca el nuevo número de la persona.");
				aux=sc.nextLine();
				nuevoCodPersona=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el nuevo nombre de la persona.");
				nuevoNombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca los nuevos apellidos de la persona.");
				nuevosApellidos=sc.nextLine();
				
				System.out.println("Por favor, introduzca la nueva edad de la persona.");
				aux=sc.nextLine();
				nuevaEdad=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca la nueva altura de la persona.");
				aux=sc.nextLine();
				nuevaAltura=Double.parseDouble(aux);
				
				cdp.modificarDatos(cdp.buscarDatos(indice), nuevoCodPersona, nuevoNombre, nuevosApellidos, nuevaEdad, nuevaAltura);
				System.out.println();
				break;
				
				
			case 3:
				System.out.println("");
				cdp.mostrarListaDatos();
				
				System.out.println("\nPor favor, introduzca el número de la persona que quiere borrar los datos.");
				aux=sc.nextLine();
				indice=Integer.parseInt(aux);
				
				cdp.borrarDatos(cdp.buscarDatos(indice));
				System.out.println();
				break;
				
				
			case 4:
				System.out.println();
				cdp.mostrarListaDatos();
				System.out.println();
				break;
				
				
			case 5:
				System.out.println();
				Collections.sort(lista);
				cdp.mostrarListaDatos();
				System.out.println();
				break;
				
				
			case 6:
				System.out.println();
				Collections.sort(lista, la);;
				cdp.mostrarListaDatos();
				System.out.println();
				break;
				
				
			case 0:
				System.out.println("\nSaliendo...\n");
				break;
				
			
			default:
				System.out.println("\nERROR. Lo sentimos, esta tecla no está asignada a ninguna opción. Por favor, escoja otra que esté disponible.\n");
				break;
			
			}
			
		}while(opcion!=0);
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA! // >:V <(ORDENA TU HABITACIÓN TAMBIÉN.)");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
	}

}
