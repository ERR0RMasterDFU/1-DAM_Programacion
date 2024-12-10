package excepcionesFechas;

import java.time.LocalDate;

public class Reserva {

	private LocalDate hoy;

	
	public Reserva(LocalDate hoy) {
		super();
		this.hoy = hoy;
	}

	
	public LocalDate getHoy() {
		return hoy;
	}

	public void setHoy(LocalDate hoy) {
		this.hoy = hoy;
	}

	
	@Override
	public String toString() {
		return "Reserva [hoy=" + hoy + "]";
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------------------
	
	
	public void comprobarFecha(String fechaReserva) throws BeforeTodayDateException{
		
		LocalDate fr = LocalDate.parse(fechaReserva);
		
		if(fr.isBefore(hoy)) {
			throw new BeforeTodayDateException("¡NO PUEDES HACER UNA RESERVA AL PASADO!");
		}
		
	}
	
}
