package ejercicio05;

public class Vendedor {

	private int CantVentas;
	private double incentivo;
	
	
	public Vendedor(int cantVentas, double incentivo) {
		super();
		CantVentas = cantVentas;
		this.incentivo = incentivo;
	}


	public int getCantVentas() {
		return CantVentas;
	}

	public void setCantVentas(int cantVentas) {
		CantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	
	
	public double calcularIncentivo (double porecentaje) {
		
	}
	
	
	
	
	
	
}
