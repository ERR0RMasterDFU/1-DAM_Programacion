package ejemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double precNuevo=0;
		
		Vehiculo v = new Vehiculo ("Amoto", 1200.00, 2);
		
	//MOSTRAR----------------------------------------------------------------------------------------
		
		System.out.println(v);
		
		//System.out.println(nombre);
		
		//System.out.println(v.nombre);
		
		System.out.println(v.getNombre());
		
	//-------------------------------------------------------------------------------------------------
		
	//MODIFICAR----------------------------------------------------------------------------------------
		
		System.out.println("Por favor, introduzca el precio nuevo.");	
		aux=sc.nextLine();
		precNuevo=Double.parseDouble(aux);
		v.setPrecio(precNuevo);
		
		System.out.printf("\n¡PERFECTO! Ahora el nuevo precio será de %.2f €.", precNuevo);

		
		
	}

}
