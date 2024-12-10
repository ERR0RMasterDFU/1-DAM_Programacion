package ejercicio03;

public class Coche extends Vehiculo{

	//ATRIBUTO
	
	private int plaza;

	//CONSTRUCTOR
	
	public Coche(double cilindrada, double potencia, String emision, int plaza) {
		super(cilindrada, potencia, emision);
		this.plaza = plaza;
	}
	
	//GETTERS & SETTERS

	public int getPlaza() {
		return plaza;
	}

	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}
	
	//TO STRING

	@Override
	public String toString() {
		return "Coche [plaza=" + plaza + "]";
	}
	
	//MÉTODOS
	
	public double calcularImpuesto (double cantidadFija) {
		int veinticinco=25, cien=100;
		
		return super.calcularImpuesto(cantidadFija)+((veinticinco*super.getPotencia())/100);
	}
	
}
