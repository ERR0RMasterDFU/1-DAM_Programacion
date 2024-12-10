package ejercicio05;

public class Gerente {

	private double sueldo;

	
	public Gerente(double sueldo) {
		super();
		this.sueldo = sueldo;
	}


	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		return "Gerente [sueldo=" + sueldo + "]";
	}
	
	
	
	
	
	
}
