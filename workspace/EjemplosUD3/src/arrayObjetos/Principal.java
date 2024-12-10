package arrayObjetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			int nVs=0, seguir, tam=100;//Contador de objetos Vehículo, variable para salir del bucle y tamaño
			String aux, modelo;
			double potencia;
			//Creamos un array de objetos Vehiculo para almacenar 100 Vehículos
			Vehiculo lista[] = new Vehiculo[tam];
			String aux;
			do {
			System.out.print("Introduce el modelo del vehículo: ");
			aux=sc.nextLine();
			modelo=
			
			System.out.print("Introduce la potencia: ");
			potencia=Leer.datoDouble();
			lista[nVs]=new Vehiculo (modelo, potencia);
			nVs++;//Aumentamos en uno el número de vehículos
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
			} while(seguir !=0 && nVs<lista.length);
			//Imprimimos los vehículos introducidos, ojo no hasta el tamaño del array, sino hasta donde hay 
			vehículos con datos
			for (int i=0; i<nVs; i++){
			System.out.println (lista[i]);
			}
			System.out.println("Fin del programa");
	}
}

