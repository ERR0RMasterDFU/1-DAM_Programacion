package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1- Escribe una aplicación en la que se implementen los dos métodos siguientes que deben estar en una interfaz:
		 
			a) cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están prestados.
			
			b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve cuántas 
			publicaciones tienen fecha anterior al año recibido por parámetro.
			
			c) En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar uno de los 
			libros, mostrar por pantalla los datos almacenados en el array y mostrar por pantalla cuántas hay prestadas 
			y cuantas hay anteriores a un año dado por teclado por el usuario.*/
		

		Scanner sc= new Scanner(System.in);
			
		String aux;
		int tam=8, anio, numRevista;
		
		Publicacion l1 = new Libro (30000, 100, true, 1455, "La Biblia");
		Publicacion l2 = new Libro (2300, 2024, false, 400, "El patatal de la sierra.");
		Publicacion r1 = new Revista (4658, 2017, true, 1, "Gibbs Burgers.");
		Publicacion r2 = new Revista (3971, 2005, false, 51, "Rajadaca");
			
		Publicacion [] lista = new Publicacion [tam];
		
		lista[0] = l1;
		lista[1] = r2;
		lista[2] = r1;
		lista[3] = l2;
		
		Biblioteca b = new Biblioteca(lista);
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 1 DE INTERFACES!");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("\nPor favor, introduzca un año cualquiera.");
		aux=sc.nextLine();
		anio=Integer.parseInt(aux);
		
		System.out.println("\nPor favor, introduzca cuántas revistas deben publicarse para que salga un aviso de ENHORABUENA.");
		aux=sc.nextLine();
		numRevista=Integer.parseInt(aux);
		
		System.out.println();
		
		b.mostrarLista();
		
		System.out.println("\nEl número de publicaciones prestadas es: "+b.cuentaPrestados(lista)+".");
		System.out.println("\nLas publicaciones que se lanzaron antes del año "+anio+" son "+b.publicacionesAnterioresA(lista, anio)+".\n");
		
		b.avisoRevista(lista, numRevista);
		
		System.out.println("\n-------------------------------------------------------------------------------------------------");
		System.out.println("¡GRACIAS POR UTILIZAR EL PROGRAMA! LA PRIMERA PUBLICACIÓN DEL EJERCICIO ES LA BIBLIA >:P.");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
	}

}
