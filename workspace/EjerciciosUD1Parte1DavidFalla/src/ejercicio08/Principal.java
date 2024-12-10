package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo 
		de radio 5.2 metros. Puedes hacer infinidad de ejercicios como este con fórmulas matemáticas como 
		áreas, volúmenes, teoremas (Pitágoras, por ejemplo), etc.*/
		
		double r1=3, r2=5.2, longitud=0, area=0, exp=2;  
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula la longitud de una circunferencia de radio 3 metros y el área de un círculo de radio 5.2 metros!");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		longitud= 2*Math.PI*r1;
		area= Math.PI*(Math.pow(r2, exp));
		
		System.out.printf("\nLa longitud de la circunferencia es de %.2f metros.\n", longitud);
		System.out.printf("\nEl área del círculo es de %.2f metros.\n", area);
		
		System.out.println("\nGracias por ver, este es el poder de las matemáticas. :P");
		
	}

}
