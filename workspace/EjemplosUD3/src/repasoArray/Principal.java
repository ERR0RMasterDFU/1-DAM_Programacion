package repasoArray;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		String aux;
		int tam=0, hasta=0, desde=0, elemento=0, nuevoValor=0, total=0, dos=2, contCero=0;
		
		//1- DECLARACIÓN DE ARRYS (MÚLTIPLES FORMAS):
		
			/*a) Dando valores inicialmente, inicializando.
				Como no damos el tamaño es directamente el número de elementos que ponemos.*/
			
				int lista[]= {2,3,6}; //Tamaño = 3
			
			/*b) Declarando e instanciando en diferentes líneas. (EL MEJOR MÉTODO)
			
				Se declara siempre primero.*/
			
				int lista2[];
			
				//Pido el tamaño (con variable al inicio)
			
				System.out.println("Por favor, introduzca el tamaño del array.");
				aux=sc.nextLine();
				tam=Integer.parseInt(aux);
			
				//Instancio con ese tamaño.
			
				lista2= new int [tam];
		
			
		//2- CARGAR Y RELLENAR EL ARRAY:
				
			//a) Leyendo por teclado.
				
				for (int i = 0; i < lista2.length; i++) {
					aux=sc.nextLine();
					lista2[i]= Integer.parseInt(aux);
				}
				
			//b) Aleatoriamente.
				
				System.out.println("Por favor, introduzca el desde.");
				aux=sc.nextLine();
				desde=Integer.parseInt(aux);
				
				System.out.println("Por favor, introduzca el hasta.");
				aux=sc.nextLine();
				hasta=Integer.parseInt(aux);
				
				for (int i = 0; i < lista2.length; i++) {
					aux=sc.nextLine();
					lista2[i]= rnd.nextInt(hasta-desde+1)+desde;
				}
				
			//c) Cascaporra style.
		
				for (int i = 0; i < lista.length; i++) {
					aux=sc.nextLine();
					lista[i]= Integer.parseInt(aux);
				}
		
				
		//3- MOSTRAR EL ARRAY.
				
				for (int i = 0; i < lista2.length; i++) {
					System.out.println(lista2[i]);
				}
				
				
		//4- ACCESO A UN ELEMENTO.
		
				System.out.println("Por favor, indique el emento que desea cambiar.");
				aux=sc.nextLine();
				elemento=Integer.parseInt(aux);
					
				System.out.println("Por favor, indique su nuevo valor.");
				aux=sc.nextLine();
				nuevoValor=Integer.parseInt(aux);
					
				lista2[elemento] = nuevoValor;
				
				
		//5- SUMAMOS ELEMENTOS.
				
				for (int i = 0; i < lista2.length; i++) {
					
					total+= lista2[i];
				}
				
				
		//OPERACIONES VARIADAS.
				
				for (int i = 0; i < lista2.length; i++) {
					if(lista2[i]%2==0) {
						lista2[i]= lista2[i]*dos;
					}
				}
				
				
			//Contar cuántos ceros existen dentro del array.
				
				for (int i = 0; i < lista2.length; i++) {
					if(lista2[i]==0) {
						contCero++;
					}
				}
			
	}

}
