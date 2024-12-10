package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aux;
		int prog=0, can=0, desde=100, hasta=10000, sumaB=0,          limEsp=0, cantProg=0;
		double suma=0, mediaPers=0;
		
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
		
		// CASO 3 (Índice de audiencia).
		
		for (int i = 0; i < persCanProg.length; i++) {
			
			if (i==1){
				
				for (int j = 0; j < persCanProg[i].length; j++) {
					
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
		
		
		//CASO 4 (Media de personas que ven la televisión)
		
		
		for (int i = 0; i < persCanProg.length; i++) {
				
			for (int j = 0; j < persCanProg[i].length; j++) {
				
				suma+= persCanProg[i][j];
				mediaPers= suma/(persCanProg.length*persCanProg[j].length);
					
			}	
		}
		
		System.out.printf("La media de personas que ven la televisión es de: %.2f.\n", mediaPers);
		
		
		//CASO 5 (número total de personas que ven la televisión)
		
		for (int i = 0; i < persCanProg.length; i++) {
			
			for (int j = 0; j < persCanProg[i].length; j++) {
			
				sumaB+= persCanProg[i][j];
					
			}
		}
		
		System.out.println("El número total de personas que están viendo la televisión es de "+sumaB+".");
		
		
		// CASO 6 (Canal mínimo).
		
		System.out.println("Introduzca el número límite de espectadores a analizar.");
		aux=sc.nextLine();
		limEsp=Integer.parseInt(aux);
		
		for (int i = 0; i < persCanProg.length; i++) {
						
			for (int j = 0; j < persCanProg[i].length; j++) {
								
				suma+= persCanProg[i][j];
							
				if(persCanProg[i][j]<limEsp) {
										
					cantProg= cantProg+1;
				}
	
			}
							
		}

		System.out.println("La cantidad de programas que tienen menos de "+limEsp+" espectadores es de: "+cantProg);
		
		//CASO ¿¿¿??? (programa más visto)
		
		for (int i = 0; i < persCanProg.length; i++) {
			
			if (i==persCanProg.length){
				
				for (int j = 0; j < persCanProg[i].length; j++) {
					
					if(persCanProg[i][j]<persCanProg[i+1][j+1]) {
						
						persCanProg[i][j]=persCanProg[i][j];
					}
					
					else {
						
						persCanProg[i][j]=persCanProg[i+1][j+1];
					}
					break;
					
					System.out.println(persCanProg[i][j]);
						
					}
					
				}
				break;
		}
				
			
			}
			
		}


			
	
		
		
		
		


