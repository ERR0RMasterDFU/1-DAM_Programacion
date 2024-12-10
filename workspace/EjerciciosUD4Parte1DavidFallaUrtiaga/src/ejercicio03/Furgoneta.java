package ejercicio03;

public class Furgoneta extends Vehiculo{

	//ATRIBUTOS
	
	private double capacidad;
	
	//CONSTRUCTOR

	public Furgoneta(double cilindrada, double potencia, String emision, double capacidad) {
		super(cilindrada, potencia, emision);
		this.capacidad = capacidad;
	}
	
	//GETTERS & SETTERS

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	//TO STRING

	@Override
	public String toString() {
		return "Furgoneta [capacidad=" + capacidad + "]";
	}
	
	//MÉTODOS
	
	public double calcularImpuesto (double cantidadFija) {
		double cantidadFija2=126.40;
		
		return super.calcularImpuesto(cantidadFija)+cantidadFija2;
	}

}
