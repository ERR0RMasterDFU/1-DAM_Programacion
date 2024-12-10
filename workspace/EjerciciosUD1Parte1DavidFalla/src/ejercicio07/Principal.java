package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Mi coche nuevo consume un montón. Dicen las indicaciones técnicas que 7,5 litros a los 100 km pero 
		no me fío. Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje. 
		Para ello, podemos inicializar una variable con los kilómetros recorridos y otra con el precio por litro 
		de gasolina*/
		
		double Km=300, precGas=1.8, ltrGas=0.0, litros=7.5, costViaje=0.0, cien=100;
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("¡Bienvenido al programa que nos ayuda a calcular el dinero gastado en gasolina en un viaje!");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		ltrGas=Km*litros/cien;
		costViaje=ltrGas*precGas;
		
		System.out.printf("\nEl coche ha consumido %.2f L en el viaje de "+Km+" Km/h\n", ltrGas);
		
		System.out.printf("\nFinalmente el viaje ha costado %.2f €.\n", costViaje);
		
		System.out.println("\nGracias por ver, tenga su producto. (^ v ^)");
		
	}

}
