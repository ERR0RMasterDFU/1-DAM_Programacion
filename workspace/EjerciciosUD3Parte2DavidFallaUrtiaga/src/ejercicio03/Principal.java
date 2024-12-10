package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux, marca, modelo, decision1, decision2;
		int opcion=0, numMoviles=100, tam=0;
		double precioUnitario=0, totalVendido=0;
		boolean disponible, estado;
		
		/*3. Vamos a intentar modelar a un vendedor "callejero" móviles. Los atributos de la clase Móvil serán, como 
		mínimo, marca, modelo, vendido o no, nuevo o de segunda mano y precio unitario. En la clase Vendedor 
		tendremos como características un array de Móviles y total vendido (se pueden añadir más atributos si se 
		quiere o precisa). Se deben crear métodos que hagan las siguientes operaciones:
		
		- Comprobar cuántos móviles le quedan sin vender.
		
		- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano. 
		
		- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. 
		
		- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
		
		Escribir también una clase de prueba para hacer todas las operaciones.*/
		
		Movil m;
		Vendedor v;
		
		Movil lista[] = new Movil [numMoviles];
		
		lista[0] = new Movil ("Y5", "UAUEI", true, false, 30.00);
		lista[1] = new Movil ("Y0YA", "SAMSÚ", false, false, 17.00);
		lista[2] = new Movil ("ZX8", "APPLAI", true, true, 25.00);
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJERCICIO 3! >:( ------------->> :P");
		System.out.println("---------------------------------------------------------------------------------------");
		
		v=new Vendedor(lista, precioUnitario, numMoviles);
		//m=new Movil(modelo, marca, disponible, estado, precioUnitario);
		
		do {
		
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. COMPROBAR MÓVILES SIN VENDER.");
			System.out.println("2. MOSTRAR PRECIO FINAL (+ DESCUENTO).");
			System.out.println("3. AÑADIR MÓVIL A LA SÁBANA.");
			System.out.println("4. MOSTRAR SÁBANA.");
			System.out.println("5. CALCULAR SUMA RATILLA.");
			System.out.println("0. SALIR.");
			System.out.println("---------------------------------------------------------------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					
					System.out.println("Por favor, introduzca el modelo.");
					aux=sc.nextLine();
					modelo=aux;
					
					System.out.println("Por favor, introduzca la marca.");
					aux=sc.nextLine();
					marca=aux;
					
					System.out.println("Por favor, introduzca si el móvil está disponible (SI o NO).");
					aux=sc.nextLine();
					decision1=aux;
					
					disponible=v.comprobarDecison1(decision1);
					
					System.out.println("Por favor, introduzca si el móvil es nuevo (SI o NO).");
					aux=sc.nextLine();
					decision2=aux;
					
					estado=v.comprobarDecison2(decision2);
					
					System.out.println("Por favir, introduzca el precio unitario");
					aux=sc.nextLine();
					precioUnitario=Double.parseDouble(aux);
					
					lista[tam]=new Movil(modelo, marca, disponible, estado, precioUnitario);
					v.aniadirMovil(marca, modelo, disponible, estado, precioUnitario, tam);
					
					break;
					
				case 4:
					v.mostrarSabana();
					break;
					
				case 5:
					break;
					
				default:
					System.out.println("ERROR. No existe una opción asociada a dicha tecla. Por favor, escoja otra. :V ");
					break;
					
				case 0:
					break;
			}
		
		}while(opcion!=0);
			
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("¡GRASAS ------------>> :P");
			System.out.println("---------------------------------------------------------------------------------------");
			
		
	}

}
