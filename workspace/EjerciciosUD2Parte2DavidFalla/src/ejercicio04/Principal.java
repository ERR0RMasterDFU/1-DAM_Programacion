package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux;
		int prog=0, can=0, desde=100, hasta=10000;
		
		int [][] persCanProg;
		
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random(System.nanoTime());
		
		// CASO 1: Generar número de espectadores de cada programa de cada canal.
		
		System.out.println("Introduzca el número de canales que se van a analizar:");
		aux=sc.nextLine();
		can=Integer.parseInt(aux);
		
		System.out.println("Introduzca el número de programas presentes en cada canal:");
		aux=sc.nextLine();
		prog=Integer.parseInt(aux);
		
		persCanProg = new int [prog][can];
		
		for (int i = 0; i < persCanProg.length; i++) {

			for (int j = 0; j < persCanProg[i].length; j++) {
				
				persCanProg[i][j] = rnd.nextInt(hasta-desde+1)+desde;
				System.out.print(persCanProg[i][j]+"\t");
				
			}
			System.out.println();
			
		}	
		
		// CASO 2 (Índice de audiencia).
		
		for (int i = 0; i < persCanProg.length; i++) {
			
			if (i==1){
				
				for (int j = 0; j < persCanProg.length; j++) {
					
					if(j==1) {
						
						System.out.println("Introduzca el canal del programa del que quiera saber IDA:");
						aux=sc.nextLine();
						j=Integer.parseInt(aux)-1;
						
						System.out.println("Introduzca el programa del que quiera saber IDA:");
						aux=sc.nextLine();
						i=Integer.parseInt(aux)-1;
						
						System.out.println(persCanProg[i][j]);
					
						break;
					}
					
				}
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}