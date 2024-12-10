package ejercicio03;

public class Vehiculo {

	//ATRIBUTOS
	
	private double cilindrada;
	private double potencia;
	private String emision;
	
	//CONSTRUCTOR
	
	public Vehiculo(double cilindrada, double potencia, String emision) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.emision = emision;
	}

	//GETTERS Y SETTERS
	
	public double getCilindrada() {
		return cilindrada;
	}

	public void setClilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getEmision() {
		return emision;
	}

	public void setEmision(String emision) {
		this.emision = emision;
	}
	
	//TO STRING
	
	@Override
	public String toString() {
		return "Vehiculo [cilindrada=" + cilindrada + ", potencia=" + potencia + ", emision=" + emision + "]";
	}

	//MÉTODOS
	
	public double calcularImpuesto (double cantidadFija) {
		
		return cantidadFija;
	}
	
}
