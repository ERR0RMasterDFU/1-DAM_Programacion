package ejercicioUD5TipoExamen2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Gestionaremos una empresa de alquileres de trasteros. Tendremos la clase Trastero cuyas características son la capacidad
		en metros cuadrados, dirección (String con la calle), número de trastero, precio y si está ocupado o no.
		
		Crear también una clase Oficina donde tendremos como atributo una lista de trasteros de tipo List y donde se tendrá
		métodos para hacer realizar las siguientes funcionalidades (no todas tienen que coincidir con un método):
		
		• Añadir un nuevo trastero al final de la lista con los datos leídos por teclado.
		• Buscar un trastero por precio.
		• Buscar un trastero por número devolviendo el trastero en cuestión.
		• Buscar al trastero más caro, es decir, el de precio mayor.
		• Eliminar un trastero.
		• Modificar un trastero elegido por el usuario, modificando únicamente su precio.
		• Ordenar la lista de trasteros por número (orden natural) y por precio (orden no natural) de mayor a menor.
		• Mostrar usando for each solo los trasteros no ocupados.
		
		Crear una clase principal con un menú donde se puedan comprobar las funcionalidades del programa, pudiéndose repetir
		el mismo hasta que el usuario decida.
		
		Se pueden agregar al comienzo algunos objetos a la colección para tener elementos de prueba o un método que cargue la
		lista con varios elementos.
		
		Se puede hacer uso SOLO Y EXCLUSIVAMENTE del API de Java.*/
		
		Scanner sc = new Scanner (System.in);
		
		int opcion, capacidad, numTrastero, numTrasteroBuscar;
		String aux, direccion;
		double precio, precioBuscar, nuevoPrecio;
		boolean ocupado;
		
		Trastero t;
		
		List <Trastero> lista = new ArrayList <Trastero> ();
		
		Oficina o = new Oficina (lista);
		OrdenarPorPrecio opp = new OrdenarPorPrecio ();
		
		lista.add(new Trastero (10, "Carretera de Carmona", 1, 4000.00, true));
		lista.add(new Trastero (7, "Condes de Bustillo", 2, 3550.50, false));
		lista.add(new Trastero (5, "Barrio Sésamo", 3, 2017.60, true));
		lista.add(new Trastero (15, "Yggdrasil", 6, 6020.90, true));
		lista.add(new Trastero (6, "LLanuras de Gaur", 4, 4000.00, false));
		lista.add(new Trastero (8, "Dogenzaka", 5, 3854.70, false));
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO TIPO EXAMEN DE LA UNIDAD 5 PARTE 2!");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		do {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("1. AÑADIR TRASTERO A LA LISTA..");
			System.out.println("2. VER TRASTEROS (POR PRECIO).");
			System.out.println("3. VER TRASTERO (POR NÚMERO).");
			System.out.println("4. VER TRASETRO MÁS CARO.");
			System.out.println("5. BORRAR TRASTERO DE LA LISTA.");
			System.out.println("6. MODIFICAR PRECIO DE UN TRASTERO DE LA LISTA.");
			System.out.println("7. ORDENAR LISTA DE TRASTEROS POR NÚMERO (- a +).");
			System.out.println("8. ORDENAR LISTA DE TRASTEROS POR PRECIO (+ a -).");
			System.out.println("9. VER TRASTEROS NO OCUPADOS.");
			System.out.println("-------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca la capacidad (m2) del trastero.");
				aux=sc.nextLine();
				capacidad=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca la dirección del trasetro.");
				direccion=aux;
				
				System.out.println("Por favor, introduzca el número del Trastero.");
				aux=sc.nextLine();
				numTrastero=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el precio del trastero");
				aux=sc.nextLine();
				precio=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca si el trastero está ocupado o no.");
				aux=sc.nextLine();
				ocupado=Boolean.parseBoolean(aux);
				
				t = new Trastero (capacidad, direccion, numTrastero, precio, ocupado);
				
				o.agregar(t);
				System.out.println();
				break;
				
				
			case 2:
				System.out.println("\nPor favor, introduzca el precio de los trasteros que quiere ver.");
				aux=sc.nextLine();
				precioBuscar=Double.parseDouble(aux);
				
				System.out.println();
				o.mostrarListaPrecio(o.buscarPorPrecio(precioBuscar));
				System.out.println();
				break;
				
				
			case 3:
				System.out.println("\nPor favor, introduzca el número del trastero que quiere ver.");
				aux=sc.nextLine();
				numTrasteroBuscar=Integer.parseInt(aux);
				
				System.out.println();
				System.out.println(o.buscarPorNumero(numTrasteroBuscar)); 
				System.out.println();
				break;
				
			case 4:
				System.out.println("\n"+o.buscarTrasteroMasCaro()+"\n");
				break;
				
			case 5:
				System.out.println("\nPor favor, introduzca el número del trastero que quiere borrar.");
				aux=sc.nextLine();
				numTrasteroBuscar=Integer.parseInt(aux);
				
				o.borrarTrastero(o.buscarPorNumero(numTrasteroBuscar));
				System.out.println();
				break;
				
			case 6:
				System.out.println("\nPor favor, introduzca el número del trastero que quiere modificar.");
				aux=sc.nextLine();
				numTrasteroBuscar=Integer.parseInt(aux);
				
				System.out.println("\nPor favor, introduzca el nuevo precio del trastero.");
				aux=sc.nextLine();
				nuevoPrecio=Double.parseDouble(aux);
				
				o.modificarTrastero(o.buscarPorNumero(numTrasteroBuscar), nuevoPrecio);
				System.out.println();
				break;
				
			case 7:
				System.out.println();
				Collections.sort(lista);
				o.mostrarLista();
				System.out.println();
				break;
				
			case 8:
				System.out.println();
				Collections.sort(lista, opp);
				o.mostrarLista();
				System.out.println();
				break;
				
			case 9:
				System.out.println();
				o.mostrarTrasterosDisponibles();
				System.out.println();
				break;
				
			}
			
		}while(opcion!=0);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA! // :P <(Espero que alquile su trastero.)");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
	}

}
