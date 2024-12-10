package ejercicio07_04;

public class Electronica extends Producto{

	private double pcntImpuesto;

	public Electronica(String nombre, int codIdentificacion, double precioUnitario, double pcntImpuesto) {
		super(nombre, codIdentificacion, precioUnitario);
		this.pcntImpuesto = pcntImpuesto;
	}

	public double getPcntImpuesto() {
		return pcntImpuesto;
	}

	public void setPcntImpuesto(double pcntImpuesto) {
		this.pcntImpuesto = pcntImpuesto;
	}

	@Override
	public String toString() {
		return super.toString()+"Electronica [pcntImpuesto=" + pcntImpuesto + "]";
	}

	
	//MÉTODOS-----------------------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public double calcularPrecioUnitario() {	//Le hemos dado a la clase el impuesto como atributo, sino lo hcemos debemos pasarlo por parámetro.
		// TODO Auto-generated method stub
		double cien = 100;
		
		return super.getPrecioUnitario()+(super.getPrecioUnitario()*pcntImpuesto/cien);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
