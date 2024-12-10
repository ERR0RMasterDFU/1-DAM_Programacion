package usoDeArrayParametros;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int desde, hasta, tam;
		String aux;
		
		Listas listado = new Listas();
		
		int[]lista;
		
		
		System.out.println("Por favor Introduzca el tamaño del array.");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		lista = new int [tam];
		
		System.out.println("Por favor Introduzca el desde.");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Por favor Introduzca el hasta.");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		listado.rellenarArray(desde, hasta, lista);
		
		listado.mostrarlista(lista);
		
		listado.mostrarlista(listado.trucarLista(lista));;
		
		
		
		
		
	}

}
