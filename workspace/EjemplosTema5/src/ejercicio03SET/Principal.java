package ejercicio03SET;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3) Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar y borrar los 
		que se quiera de forma individual, es decir, el usuario debe decir quién quiere mostrar, modificar o borrar. 
		Se puede crear otra clase con funcionalidades como sacar nota media del curso, dar el número de suspensos en 
		total, media de suspensos, etc. Usa la interfaz Set implementada por HashSet.*/
		
		Scanner sc = new Scanner (System.in);
		
		int opcion, edad, edadNueva;
		double nota1, nota2, nota3, nota1Nueva, nota2Nueva, nota3Nueva;
		String aux, nombre, apellidos, nombreNuevo, apellidosNuevos;
		
		Set <Alumno> lista = new HashSet <Alumno> ();
		
		lista.add(new Alumno ("a", "as", 15, 1.6, 2.5, 3.8));
		lista.add(new Alumno ("b", "bs", 10, 6.7, 5.3, 8.0));
		lista.add(new Alumno ("c", "cs", 11, 6.3, 5.4, 4.5));
		lista.add(new Alumno ("d", "ds", 12, 3.2, 2.4, 6.9));
		lista.add(new Alumno ("e", "es", 13, 10.0, 9.1, 7.8));
		
		CRUDAlumno ca = new CRUDAlumno (lista);
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 3 DE COLECCIONES SET!");
		System.out.println("----------------------------------------------------------------------------------------------");

		do {
			
			System.out.println("\n------------------------------------------------------");
			System.out.println("1. AÑADIR ALUMNO.");
			System.out.println("2. MODIFICAR ALUMNO.");
			System.out.println("3. BORRAR ALUMNO.");
			System.out.println("4. VER LISTA DE ALUMNOS.");
			System.out.println("0. SALIR.");
			System.out.println("------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca el nombre del nuevo alumno.");
				nombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca los apellidos del nuevo alumno.");
				apellidos=sc.nextLine();
				
				System.out.println("Por favor, introduzca la edad del nuevo alumno.");
				aux=sc.nextLine();
				edad=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca la primera nota del nuevo alumno.");
				aux=sc.nextLine();
				nota1=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la segunda nota del nuevo alumno.");
				aux=sc.nextLine();
				nota2=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la tercera nota del nuevo alumno.");
				aux=sc.nextLine();
				nota3=Double.parseDouble(aux);

				ca.agregarNuevoAlumno(new Alumno (nombre, apellidos, edad, nota1, nota2, nota3));
				break;
				
			case 2:
				System.out.println("\nPor favor, introduzca los apellidos del alumno que quiere modificar.");
				apellidos=sc.nextLine();
				
				System.out.println("\nPor favor, introduzca el nombre del nuevo alumno.");
				nombreNuevo=sc.nextLine();
				
				System.out.println("Por favor, introduzca los apellidos del nuevo alumno.");
				apellidosNuevos=sc.nextLine();
				
				System.out.println("Por favor, introduzca la edad del nuevo alumno.");
				aux=sc.nextLine();
				edadNueva=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca la primera nota del nuevo alumno.");
				aux=sc.nextLine();
				nota1Nueva=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la segunda nota del nuevo alumno.");
				aux=sc.nextLine();
				nota2Nueva=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la tercera nota del nuevo alumno.");
				aux=sc.nextLine();
				nota3Nueva=Double.parseDouble(aux);
				
				ca.modificarAlumno(nombreNuevo, apellidosNuevos, edadNueva, nota1Nueva, nota2Nueva, nota3Nueva, ca.buscarAlumno(apellidos));
				break;
				
			case 3:
				System.out.println("\nPor favor, introduzca los apellidos del alumno que quiere modificar.");
				apellidos=sc.nextLine();
				
				ca.borrarAlumno(ca.buscarAlumno(apellidos));
				break;
				
			case 4:
				System.out.println();
				ca.mostrarListaAlumnos();
				break;
				
			default:
				System.out.println("\nERROR. Lo sentimos, esta tecla no está asignada a ninguna opción. Por favor, escoja otra.\n");
				break;
				
			case 0:
				System.out.println("\nSALIENDO...\n");
				break;
			}
			
		}while(opcion!=0);
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UUSAR EL PROGRAMA! // :P <(Espero que hayas aprendido TODO sobre el SET.)");
		System.out.println("----------------------------------------------------------------------------------------------");
		
	}

}
