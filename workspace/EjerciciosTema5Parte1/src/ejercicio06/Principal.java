package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*6. Crear una clase Trabajador con los siguientes atributos: nombre, DNI, Horas trabajadas y sueldo final
	(este se puede calcular de cualquier manera sencilla de las que hemos visto anteriormente en otros ejercicios).
	
	Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según el número de horas 
	trabajadas (de menor a mayor y viceversa) y según el sueldo (del que más al que menos cobra).
	Se deben usar las interfaces comparable y/o comparator.*/
	
		Scanner sc = new Scanner (System.in);
		
		int opcion, horasTrab, nuevasHorasTrab;
		String aux, nombre, dni, nuevoNombre, nuevoDni, dni2;
		double sueldoFinal, nuevoSueldoFinal;
		
		Trabajador t;
		
		List <Trabajador> lista = new ArrayList <Trabajador>();
		ListaPorHoras lph = new ListaPorHoras ();
		ListaPorHorasInversa lphi = new ListaPorHorasInversa ();
		OrdenarPorNombre opn = new OrdenarPorNombre ();
		
		CRUDTrabajador ct = new CRUDTrabajador(lista);

		lista.add(new Trabajador("Matías", "73425167A", 33, 750.00));
		lista.add(new Trabajador("Luis", "53482134P", 50, 820.50));
		lista.add(new Trabajador("Claudia", "31214356H", 54, 827.00));
		lista.add(new Trabajador("Blanca", "12948520Y", 60, 900.00));
		lista.add(new Trabajador("Antonio", "41895129G", 27, 710.60));
		lista.add(new Trabajador("Aaron", "54635278R", 30, 750.50));

		
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 6 DE COLECCIONES!");
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		
		do {
	
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("1. AÑADIR TRABAJADOR NUEVO.");
			System.out.println("2. MODIFICAR TRABAJADOR.");
			System.out.println("3. BORRAR TRABAJADOR.");
			System.out.println("4. MOSTRAR LISTA ORDENADA POR NÚMERO DE HORAS (de + a -).");
			System.out.println("5. MOSTRAR LISTA ORDENADA POR NÚMERO DE HORAS (de - a +).");
			System.out.println("6. MOSTRAR LISTA ORDENADA POR SUELDO FINAL (de + a -).");
			System.out.println("7. MOSTRAR LISTA ORDENADA POR NOMBRE (a-z) Y LUEGO POR SUELDO FINAL. (de + a -)");
			System.out.println("0. SALIR");
			System.out.println("-----------------------------------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca el nombre del trabajador.");
				nombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca el DNI del trabajador.");
				dni=sc.nextLine();
				
				System.out.println("Por favor, introduzca el número de horas que ha trabajado.");
				aux=sc.nextLine();
				horasTrab=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el sueldo final del trabajador.");
				aux=sc.nextLine();
				sueldoFinal=Double.parseDouble(aux);
				
				t = new Trabajador(nombre, dni, horasTrab, sueldoFinal);
				
				ct.agregarTrabajador(t);
				System.out.println("");
				break;
				
				
			case 2:
				System.out.println("");
				ct.mostrarListaTrabajador();
				
				System.out.println("\nPor favor, introduzca el DNI del trabajador al que quiere modificar los datos.");
				dni2=sc.nextLine();
				
				System.out.println("\nPor favor, introduzca el nuevo nombre del trabajador.");
				nuevoNombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca el nuevo DNI del trabajador.");
				nuevoDni=sc.nextLine();
				
				System.out.println("Por favor, introduzca el nuevo número de horas que ha trabajado.");
				aux=sc.nextLine();
				nuevasHorasTrab=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el nuevo sueldo final del trabajador.");
				aux=sc.nextLine();
				nuevoSueldoFinal=Double.parseDouble(aux);
				
				ct.modificarTrabajador(ct.buscarTrabajador(dni2), nuevoNombre, nuevoDni, nuevasHorasTrab, nuevoSueldoFinal);
				System.out.println();
				break;
				
				
			case 3:
				System.out.println("");
				ct.mostrarListaTrabajador();
				
				System.out.println("\nPor favor, introduzca el DNI del trabajador que quiere borrar.");
				dni2=sc.nextLine();
				
				ct.borrarTrabajador(ct.buscarTrabajador(dni2));
				System.out.println();
				break;
				
				
			case 4:
				System.out.println();
				Collections.sort(lista, lphi);
				ct.mostrarListaTrabajador();
				System.out.println();
				break;
				
				
			case 5:
				System.out.println();
				Collections.sort(lista, lph);
				ct.mostrarListaTrabajador();
				System.out.println();
				break;
				
				
			case 6:
				System.out.println();
				Collections.sort(lista);
				ct.mostrarListaTrabajador();
				System.out.println();
				break;
				
			
			case 7:
				System.out.println();
				Collections.sort(lista, opn);
				ct.mostrarListaTrabajador();
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

