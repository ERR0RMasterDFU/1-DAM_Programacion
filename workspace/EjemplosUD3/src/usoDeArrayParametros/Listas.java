package usoDeArrayParametros;

import java.util.Random;

public class Listas {

	//MÉTODO QUE RELLENA EL ARRAY
	public void rellenarArray (int desde, int hasta, int [] lista) {
		Random rnd=new Random(System.nanoTime());
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]= rnd.nextInt (hasta-desde+1)+desde;
		}
		
	}
	
	public void mostrarlista(int [] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]+" ");
		}
	}
	
	/*Podría haber dos versiones : 1- Pasando la lista como parámetro.
								   2- Instanciando la lista dentro del método.*/
	
	public int[] trucarLista (int [] lista) {
		int diez=10;
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=diez;
		}
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
