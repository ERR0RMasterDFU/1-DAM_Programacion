package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int CEur=50;
		double ConvEurLib=0.87;
		double resultConv=0;
		
		//1€ son 0.87 Libras esterlinas y 1 Libra esterlina son 1,15€.
		
		System.out.println("¡Bienvenido al ejercicio 5 de la Unidad 1!");
		
		System.out.println();
		
		resultConv=CEur*ConvEurLib;
		
		System.out.println("El valor en libras esterlinas de "+CEur+"€ es de "+resultConv+".");
	}

}
