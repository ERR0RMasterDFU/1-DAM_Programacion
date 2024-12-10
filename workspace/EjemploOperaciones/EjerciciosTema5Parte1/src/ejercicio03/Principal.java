package ejercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar y borrar 
		los que se quiera de forma individual, es decir, el usuario debe decir quién quiere mostrar, modificar 
		o borrar. Se puede crear otra clase con funcionalidades como sacar nota media del curso, dar el número 
		de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada por HashSet.*/
		
		Scanner sc = new Scanner (System.in);
		
		Alumno a;
		
		Set <Alumno> lista = new HashSet <Alumno> ();
		
		CRUDAlumno ca = new CRUDAlumno (lista);
		
		String aux, nombre, apellidos;
		int opcion=0, opcion2=0, idAlumno;
		double nota1, nota2, nota3;

		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 3 DEL TEMA 5!");
		System.out.println("---------------------------------------------------------------------------------------");
		
		
		do {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("1. AÑADIR ALUMNO NUEVO.");
			System.out.println("2. MODIFICAR INFORMACIÓN DE UN ALUMNO.");
			System.out.println("3. BORRAR ALUMNO.");
			System.out.println("4. MOSTRAR ALUMNO.");
			System.out.println("5. VER NÚMERO DE SUSPENSOS.");
			System.out.println("6. VER NOTA MEDIA DE UN ALUMNO.");
			System.out.println("0. SALIR.");
			System.out.println("-------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			
			switch (opcion) {
			
			case 1:
				System.out.println("\nPor favor, introduzca un ID que identifique al alumno");
				aux=sc.nextLine();
				idAlumno=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el nombre del alumno.");
				nombre=sc.nextLine();
				
				System.out.println("Por favor, introduzca los apellidos del alumno.");
				apellidos=sc.nextLine();
				
				System.out.println("Por favor, introduzca la primera nota del alumno.");
				aux=sc.nextLine();
				nota1=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la segunda nota del alumno.");
				aux=sc.nextLine();
				nota2=Double.parseDouble(aux);
				
				System.out.println("Por favor, introduzca la tercera nota del alumno.");
				aux=sc.nextLine();
				nota3=Double.parseDouble(aux);
				
				ca.agregarAlumno(new Alumno (idAlumno, nombre, apellidos, nota1, nota2, nota3));
				
				System.out.println("\nEl alumno se ha añadido correctamente.\n");
				break;
			
				
			case 2:
				System.out.println("\nPor favor, introduzca el ID que identifica al alumno");
				aux=sc.nextLine();
				idAlumno=Integer.parseInt(aux);
				
				ca.findByidAlumno(idAlumno);
				
				do {
					System.out.println("--------------------------------------------");
					System.out.println("¿Qué dato del alumno desea modificar?");
					System.out.println("\n1. ID.");
					System.out.println("2. NOMBRE.");
					System.out.println("3. APELLIDOS.");
					System.out.println("4. PRIMERA NOTA.");
					System.out.println("5. SEGUNDA NOTA.");
					System.out.println("6. TERCERA NOTA.");
					System.out.println("0. SALIR.");
					System.out.println("--------------------------------------------");
					aux=sc.nextLine();
					opcion2=Integer.parseInt(aux);
					
					switch(opcion2) {
						
						//ESTABAS HACIENDO ESTO >:V
					}
					
					
				}while(opcion2!=0);
			}
			
		}while (opcion!=0);
		
		
		
		
		
		
		
		
		
		
	
	}

}
