package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double nota=0;
		int opcion=0;
		
		/*15. Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se 
		necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final, 
		la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es 
		necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.*/
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que gestiona las notas de un alumno de un centro!");
		System.out.println("--------------------------------------------------------------------------");

		do {
			
			System.out.println("-------------------------------------");
			System.out.println("Pulse 1 para INICIAR el programa.");
			System.out.println("Pulse 0 para SALIR del programa.");
			System.out.println("-------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
				
			
			}
		
		
		
		
		System.out.println("Por favor, introduzca su número de asignaturas");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		
	}
}