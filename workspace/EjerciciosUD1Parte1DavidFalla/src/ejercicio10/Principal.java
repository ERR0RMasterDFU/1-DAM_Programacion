package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escribir un programa que sirva para calcular el precio final de un producto. El cliente se lleva 4 
		unidades de un producto que cuesta 12,99 € y se le aplica un descuento del 3 % al precio total.*/
		
		double precio=12.99, preciox4=0, descuento=0, precioTotal=0;
		
		preciox4=precio*4;
		descuento=(preciox4*3)/100;
		precioTotal=preciox4-descuento;
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el precio final de un producto!");
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("\nEl precio final es de: %.2f €.\n", precioTotal);
		System.out.printf("\nGracias por ver, un descuento hay que aprovecharlo. :P");
		
	}

}
