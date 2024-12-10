package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*A mi padre le gusta medir la capacidad de las personas que admite un lugar o evento en “el número de 
		Navas (mi pueblo)”, en este caso, Navas sería una unidad de medida de número de personas que habría 
		en un lugar, por ejemplo, si mi pueblo tiene 1500 habitantes, en un campo de futbol de 15000 
		espectadores, cabrían “10 Navas”.
		
		Calcular el número de Navas que entrarían en el Camp Nou, en el concierto de U2 del estadio olímpico 
		donde asistieron 65000 personas y en el teatro del colegio, que tiene 600 localidades.*/
		
		//1500 habitantes = 1 Nava.
		
		double CampNou=99354, EO=65000, teatro=600, hab=1500, NavasCN=0, NavasEO=0, NavasT=0;
		
		System.out.println("-------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que calcula el número de Navas!");
		System.out.println("-------------------------------------------------------");
		
		NavasCN=CampNou/hab;
		NavasEO=EO/hab;
		NavasT=teatro/hab;
		
		System.out.printf("\nLas Navas existentes en el Camp Nou son %.2f.\n", NavasCN);
		System.out.printf("\nLas Navas existentes en el Estadio Olímpico son %.2f.\n", NavasEO);
		System.out.printf("\nLas Navas existentes en el teatro son %.2f.\n", NavasT);
		
		System.out.println("\nGracias por ver, que gran unidad de medida. (^ v ^)");
	}

}
