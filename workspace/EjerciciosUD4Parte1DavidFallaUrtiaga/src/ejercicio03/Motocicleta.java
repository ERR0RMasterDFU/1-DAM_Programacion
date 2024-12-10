package ejercicio03;

public class Motocicleta extends Vehiculo{

	//ATRIBUTOS
	
	private double tamanioAsiento;
	
	//CONSTRUCTOR

	public Motocicleta(double cilindrada, double potencia, String emision, double tamanioAsiento) {
		super(cilindrada, potencia, emision);
		this.tamanioAsiento = tamanioAsiento;
	}

	//GETTERS & SETTERS
	
	public double getTamanioAsiento() {
		return tamanioAsiento;
	}

	public void setTamanioAsiento(double tamanioAsiento) {
		this.tamanioAsiento = tamanioAsiento;
	}

	//TO STRING
	
	@Override
	public String toString() {
		return "Motocicleta [tamanioAsiento=" + tamanioAsiento + "]";
	}

	//MÉTODOS

	public double calcularImpuesto (double cantidadFija) {
		int sesenta=60, cien=100;
		
		return super.calcularImpuesto(cantidadFija)+((sesenta*super.getCilindrada())/cien);
		
	}
	
}
