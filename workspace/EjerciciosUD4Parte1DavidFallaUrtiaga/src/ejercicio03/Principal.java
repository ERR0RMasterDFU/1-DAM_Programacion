package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
		de la cilindrada, potencia en caballos y categoría de emisiones contaminantes (cero emisiones, ECO,
		tipo B y tipo C). Crear un programa para calcular la cantidad que debe pagar un vehículo dependiendo
		de sus características. (Los vehículos a motor pueden ser motocicletas, coches y furgonetas).
		
		El impuesto se calcula con una cantidad fija cuyo valor depende del tipo de emisiones por el simple
		hecho de ser un vehículo con motor más:
		
		- El 60 % de la cilindrada en el caso de las motocicletas.
		- Otra cantidad fija a las furgonetas por ser transporte de mercancías.
		- El 25 % de la potencia en el caso de los coches.
		
		La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
		Probar todo en un main sencillo.*/
		
		String aux, emision, emision2, emision3;
		int opcion, opcion2, opcion3, plaza;
		double cilindrada, cilindrada2, cilindrada3, potencia, potencia2, potencia3, cantidadFija, tamanioAsiento, capacidad;
		
		Motocicleta m;
		Coche c;
		Furgoneta f;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL PROGRAMA QUE CALCULA EL IMPUESTO DE UN VEHÍCULO A MOTOR!");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("\nVAMOS A CALCULAR EL IMPUESTO DE CIRCULACIÓN DE UNA MOTOCICLETA:");
		
		System.out.println("\nPrimero, introduzca la capacidad de la clilindrada del vehículo (cc):");
		aux=sc.nextLine();
		cilindrada=Double.parseDouble(aux);
		
		System.out.println("\nAhora, introduzca la potencia en caballos del vehículo (CV):");
		aux=sc.nextLine();
		potencia=Double.parseDouble(aux);
		
		System.out.println("\nBien, introduzca el tamaño del asiento de la motocicleta (cm):");
		aux=sc.nextLine();
		tamanioAsiento=Double.parseDouble(aux);
		
		System.out.println("\nIntroduzca la categoría de emisiones contaminantes del vehículo:");
		System.out.println("1- Cero emisiones.");
		System.out.println("2- ECO.");
		System.out.println("3- Tipo B.");
		System.out.println("Cualquier número restante- Tipo C.");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
			
			case 1:
				emision="Cero";
				
				cantidadFija=20;
				
				m = new Motocicleta (cilindrada, potencia, emision, tamanioAsiento);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", m.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 2:
				emision="ECO";
				
				cantidadFija=39.99;
				
				m = new Motocicleta (cilindrada, potencia, emision, tamanioAsiento);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", m.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 3:
				emision="Tipo B";
				
				cantidadFija=77.66;
				
				m = new Motocicleta (cilindrada, potencia, emision, tamanioAsiento);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", m.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			default:
				emision="Tipo C";
				
				cantidadFija=99.99;
				
				m = new Motocicleta (cilindrada, potencia, emision, tamanioAsiento);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", m.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
		}
		
		System.out.println("\nAHORA VAMOS A CALCULAR EL IMPUESTO DE CIRCULACIÓN DE UN COCHE:");
		
		System.out.println("\nPrimero, introduzca la capacidad de la clilindrada del vehículo (cc):");
		aux=sc.nextLine();
		cilindrada2=Double.parseDouble(aux);
		
		System.out.println("\nAhora, introduzca la potencia en caballos del vehículo (CV):");
		aux=sc.nextLine();
		potencia2=Double.parseDouble(aux);
		
		System.out.println("\nBien, introduzca el número de plazas del coche:");
		aux=sc.nextLine();
		plaza=Integer.parseInt(aux);
		
		System.out.println("\nIntroduzca la categoría de emisiones contaminantes del vehículo:");
		System.out.println("1- Cero emisiones.");
		System.out.println("2- ECO.");
		System.out.println("3- Tipo B.");
		System.out.println("Cualquier número restante- Tipo C.");
		aux=sc.nextLine();
		opcion2=Integer.parseInt(aux);
		
		switch(opcion2) {
			
			case 1:
				emision2="Cero";
				
				cantidadFija=20;
				
				c = new Coche (cilindrada2, potencia2, emision2, plaza);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", c.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 2:
				emision2="ECO";
				
				cantidadFija=39.99;
				
				c = new Coche (cilindrada2, potencia2, emision2, plaza);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", c.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 3:
				emision2="Tipo B";
				
				cantidadFija=77.66;
				
				c = new Coche (cilindrada2, potencia2, emision2, plaza);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", c.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			default:
				emision2="Tipo C";
				
				cantidadFija=99.99;
				
				c = new Coche (cilindrada2, potencia2, emision2, plaza);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", c.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
		}
		
		System.out.println("\nAHORA VAMOS A CALCULAR EL IMPUESTO DE CIRCULACIÓN DE UNA FURGONETA:");
		
		System.out.println("\nPrimero, introduzca la capacidad de la clilindrada del vehículo (cc):");
		aux=sc.nextLine();
		cilindrada3=Double.parseDouble(aux);
		
		System.out.println("\nAhora, introduzca la potencia en caballos del vehículo (CV):");
		aux=sc.nextLine();
		potencia3=Double.parseDouble(aux);
		
		System.out.println("\nBien, introduzca la capacidad de la furgoneta:");
		aux=sc.nextLine();
		capacidad=Double.parseDouble(aux);
		
		System.out.println("\nIntroduzca la categoría de emisiones contaminantes del vehículo:");
		System.out.println("1- Cero emisiones.");
		System.out.println("2- ECO.");
		System.out.println("3- Tipo B.");
		System.out.println("Cualquier número restante- Tipo C.");
		aux=sc.nextLine();
		opcion3=Integer.parseInt(aux);
		
		switch(opcion3) {
			
			case 1:
				emision3="Cero";
				
				cantidadFija=20;
				
				f = new Furgoneta (cilindrada3, potencia3, emision3, capacidad);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", f.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 2:
				emision3="ECO";
				
				cantidadFija=39.99;
				
				f = new Furgoneta (cilindrada3, potencia3, emision3, capacidad);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", f.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			case 3:
				emision3="Tipo B";
				
				cantidadFija=77.66;
				
				f = new Furgoneta (cilindrada3, potencia3, emision3, capacidad);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", f.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
			
			default:
				emision3="Tipo C";
				
				cantidadFija=99.99;
				
				f = new Furgoneta (cilindrada3, potencia3, emision3, capacidad);
				
				System.out.println("\n***********************************************************************");
				System.out.printf("El impuesto a pagar es de: %.2f €.", f.calcularImpuesto(cantidadFija));
				System.out.println("\n***********************************************************************");
				break;
		}
		
		System.out.println("\n--------------------------------------------------------");
		System.out.println("GRACIAS POR USAR EL PROGRAMA, DIFRUTA DE TU VEHÍCULO :P");
		System.out.println("--------------------------------------------------------");
		
	}

}
