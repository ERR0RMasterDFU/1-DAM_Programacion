package ejercicio04;

public class Electronica extends Producto {

	private double impuestoEs;

	
	public Electronica(double precioUni, String nombre, int codigoID, double impuestoEs) {
		super(precioUni, nombre, codigoID);
		this.impuestoEs = impuestoEs;
	}

	
	public double getImpuestoEs() {
		return impuestoEs;
	}

	public void setImpuestoEs(double impuestoEs) {
		this.impuestoEs = impuestoEs;
	}

	
	@Override
	public String toString() {
		return "Electronica [impuestoEs=" + impuestoEs + "]";
	}

	
	public double calcularImpuestoEspecial () {
		double veinte= 20, cien=100;
		return impuestoEs= getPrecioUni()+(20*getPrecioUni()/100); //Al precio unitario se le sumará otro 20% extra de su precio.
	}
	
}
