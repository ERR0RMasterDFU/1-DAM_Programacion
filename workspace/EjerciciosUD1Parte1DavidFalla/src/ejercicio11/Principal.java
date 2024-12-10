package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*11. ¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido que abrir 
		pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo y la capacidad del 
		depósito para guardar el agua en metros cúbicos. Serías capaz de crear un programa que calcule 
		cuántos metros cúbicos se sacan de uno de los pozos que tiene un caudal de 8 litros por segundo si está 
		conectado 24 horas.*/
		
		double h=24, s=3600, Tcaudal=0, caudal=8, CapA=0, metC=0, l=1000;   
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula cuántos metros cúbicos se sacan de uno de los pozos que tiene un caudal!");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		Tcaudal=(h*s);
		CapA=Tcaudal*caudal;
		metC=CapA/l;
		
		System.out.printf("\nEl tiempo que el agua corre es de %.2f segundos.\n",Tcaudal);
		System.out.printf("\nLa capacidad de sacar agua de los pozos es de %.2f l/s.\n", CapA);
		System.out.printf("\nLos metros cúbicos que se sacan del pozo son %.2f.\n",metC);
		
		System.out.printf("\nGracias por ver.");
		
		

	}

}
