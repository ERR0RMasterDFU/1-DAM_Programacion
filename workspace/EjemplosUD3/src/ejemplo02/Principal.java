package ejemplo02;

import java.util.Scanner;

import ejemplo01.Alumno01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, nombre;
		double notaPro, notaBD, media;
		
		System.out.println("Por favor, intrtoduzca el nombre del alumno.");
		aux=sc.nextLine();
		nombre=aux;
		
		System.out.println("Por favor, introduzca la nota de programación del alumno.");
		aux=sc.nextLine();
		notaPro=Double.parseDouble(aux);
		
		System.out.println("Por favor, introduzca la nota de base de datos del alumno.");
		aux=sc.nextLine();
		notaBD=Double.parseDouble(aux);
		
		System.out.println("nombre: "+nombre);
		System.out.println("Nota de programación: "+notaPro);
		System.out.println("Nota de base de datos: "+notaBD);
	
		Alumno a1=new Alumno (nombre, notaPro, notaBD);
		
		media=a1.calcularMedia();
		
		a1.mostrarMedia(media);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
