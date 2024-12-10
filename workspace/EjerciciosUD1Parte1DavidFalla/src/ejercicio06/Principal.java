package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*Realizar un programa que escriba el precio de un producto en una compra, una vez descontado el tanto 
		 por ciento de descuento, dando nosotros en la declaración de las variables el precio inicial de un 
		 producto y el tanto por ciento que se va a descontar. Ojo, el cálculo del tanto por ciento lo debe hacer 
		 el programa no el usuario, por ejemplo, se debe usar 20 y no 0.2.
		 descuento= 20 %; y no descuento=0.2*/
		
		double precI=45, descuento=20, precD=0, precF=0;
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que escribe el precio descontado de un producto!");
		System.out.println("------------------------------------------------------------------------");
		
		precD=(descuento/100)*precI;
		precF=precI-precD;
		
		System.out.printf("\nVamos a comprar un producto que cuesta %.0f € y que tiene un descuento del %.0f %%.\n", precI, descuento);
		
		System.out.printf("\nEl precio del producto final sería de: %.0f €.\n",precF);
		
		System.out.println("\nGracias por ver, tenga su producto. :P");
		
	}

}
