package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		
		/*1. Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones de clase). 
		Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides los atributos que debe tener una 
		nota). Se podrán mostrar de manera individual (sin necesidad de buscar, solo diciendo cuál de la lista mostrada), dar 
		información del número de notas guardadas, agregar una nueva nota, un método que borre una de las notas guardadas 
		comprobando antes que la lista no está vacía. Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle 
		al usuario la lista con todas las notas (en un método) y su número correspondiente, el usuario introducirá el número de 
		la que quiera borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles de ellas?).*/
		
		
		List <Nota> lista = new ArrayList <Nota>();
		
		lista.add(new Nota (1, "Tales of Phantasia", "JRPG sobre viajes temporales :V"));
		lista.add(new Nota (2, "Tales of Destiny", "JRPG sobre espadas mágicas parlantes :O"));
		lista.add(new Nota (3, "Inazuma Eleven 2", "JRPG épico sobre fútbol y alienígenas :P"));
		lista.add(new Nota (4, "Tales of Symphonia", "JRPG sobre elgidos y crisis planetarias ;D"));
		lista.add(new Nota (5, "Tales of Vesperia", "JRPG sobre artilugios mágicos llamados blastias >:P"));
		
		CrudNota cn = new CrudNota(lista);
		
		String aux, titulo, cuerpo;
		int opcion, indice, id=5;
		
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO A LAS COLECCIONES DE NOTAS!");
		System.out.println("------------------------------------------------------------------------------------------------------------------\n");
		
		cn.imprimirLista();
		
		do {
			
			System.out.println("\n-------------------------------------------------------------");
			System.out.println("1. MOSTRAR LISTA DE NOTAS.");
			System.out.println("2. MOSTRAR NOTA INDIVIDUALMENTE.");
			System.out.println("3. MOSTRAR NÚMERO DE NOTAS GUARDADAS.");
			System.out.println("4. CREAR NUEVA NOTA.");
			System.out.println("5. BORRAR NOTA.");
			System.out.println("6. CAMBIAR TITULO DE NOTA.");
			System.out.println("0. SALIR.");
			System.out.println("-------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					cn.imprimirLista();
					break;
					
				case 2:
					System.out.println("Por favor, introduzca el número de la nota que quiere ver.");
					aux=sc.nextLine();
					indice=Integer.parseInt(aux);
					
					System.out.println(cn.mostrarNota(indice));
					break;
				
				case 3:
					System.out.println("El número de notas almacenadas es de "+cn.mostrarNumeroNotas()+"."); 
					break;
					
				case 4:
					id++;
					
					System.out.println("Por favor, introduzca el título de la nota.");
					aux=sc.nextLine();
					titulo=aux;
					
					System.out.println("Por favor, escriba el cuerpo de la nota.");
					aux=sc.nextLine();
					cuerpo=aux;
					
					Nota n = new Nota (id, titulo, cuerpo);
					
					cn.aniadirNota(n);
					break;
					
				case 5:
					System.out.println("Por favor, introduzca el número de la nota que quieres borrar.");
					aux=sc.nextLine();
					indice=Integer.parseInt(aux);
					
					cn.borrarNota(indice);
					break;
					
				/*case 6:
					System.out.println("Por favor, introduzca el nuevo titulo.");
					aux=sc.nextLine();
					titulo=aux;
					
					cn.modificar(n, titulo);
					break;*/
					
				case 0:
					System.out.println();
					break;
					
				default:
					System.out.println("ERROR. Lo sentimos, dicha tecla no está asignada a ninguna opción. Por favor, escoja otra que esté disponible.");
			}
			
		}while(opcion!=0);
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR USAR EL PROGRAMA. ¿A QUE MOLAN LAS NOTAS? >:P!");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

}
