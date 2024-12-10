package ArrayEjemplo01;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres={"Luismi", "Miguel", "Rafa", "Ángel"};
		int tam=4, hasta=99, desde=1;
		
		Random rnd=new Random (System.nanoTime());
		
		//Declarar un array.
		int [] numeros; 
		
		//Instanciar un array.
		numeros= new int [tam];
		
		//Rellenamos aleatoriamente.
		
		
		/*1. Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y 
		mostrarlo por la pantalla mediante un bucle for.*/
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que crea un array de tipo String con el nombre de 5 personas!");
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(int i=0; i>nombres.length; i++) {
			numeros[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
		
		for(int i=0; i<nombres.length; i++) {
			System.out.print(nombres[i]+ "\t\t");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		for(int i=0; i<nombres.length; i++) {
		System.out.print(numeros[i]+"\t\t");
		
		}

	}

}
