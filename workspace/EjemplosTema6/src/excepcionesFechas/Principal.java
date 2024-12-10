package excepcionesFechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int tempC, opcion;
		String aux, fechaReserva;
		boolean sinError=false;
		
		Reserva r = new Reserva(LocalDate.now());
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("¡BIENVENIDO AL EJEMPLO DE EXCEPCIONES CON FECHAS!");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		do {
		
			try {
			
				System.out.println("Por favor, introduzca la fecha de la reserva.");
				fechaReserva=sc.nextLine();
				
				r.comprobarFecha(fechaReserva);
	
				System.out.println("--------------------------------------");
				System.out.println("1. SÍ.");
				System.out.println("2. NO.");
				System.out.println("--------------------------------------");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
		
			}catch(BeforeTodayDateException btde) {
				btde.getMessage();
			}catch(NumberFormatException nfe) {
				System.out.println("¡HAY QUE PULSARLE A UN NÚMERO!");
			}catch(Exception e) {
				System.out.println("UN ERROR HA OCURRIDO.");
			}
		
		
		}while (opcion!=2);
		
		
	}

}
