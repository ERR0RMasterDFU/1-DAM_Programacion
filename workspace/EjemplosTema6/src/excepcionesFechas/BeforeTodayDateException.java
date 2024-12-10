package excepcionesFechas;

public class BeforeTodayDateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public BeforeTodayDateException(String mensaje) {
		super(mensaje);
	}
	
	public BeforeTodayDateException() {
		super();
	}
}
