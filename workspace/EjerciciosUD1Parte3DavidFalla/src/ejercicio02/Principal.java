package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2. Realizar un programa que calcule el espacio recorrido por un objeto que se mueve a velocidad constante. El 
		objeto, por ejemplo, zapatilla de una madre hacia el hijo, ha recorrido un espacio inicial de 5.5 m y se mueve 
		a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor al tiempo que el objeto está en movimiento. 
		La ecuación usada es: espacio= espacioInicial + velocidad*tiempo*/
		
		String aux;
		double eI=5.5, vel=3.2, t=0, esp=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el espacio recorrido por un objeto que se mueve a velocidad constante!");
		System.out.println("----------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Indique el tiempo (en segundos) que está la zapatilla volando hacia el hijo.");
		aux=sc.nextLine();
		t=Double.parseDouble(aux);
		
		esp= eI+vel*t;
		
		System.out.println("El espacio recorrido por la zapatilla para darle al hijo es de "+esp+ "m.");
		
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Gracias por usar nuestro programa, a ver si el hijo ha aprendido la lección >:( ");
		System.out.println("------------------------------------------------------------\n");
		
		
		

	}

}
