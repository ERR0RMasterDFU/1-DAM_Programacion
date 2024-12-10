package ejercicio01;

public class Sobremesa extends Ordenador {

	//ATRIBUTOS
	
	private double precioMontaje;
	
	//CONSTRUCTOR
	
	public Sobremesa(double capDiscoDuro, double frecProcesador, double precioBase, String marca, double precioMontaje) {
		super(capDiscoDuro, frecProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	
	//GETTERS & SETTERS
	
	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}


	@Override
	public String toString() {
		return super.toString()+" ---> Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	
	//MÉTODOS
	
	public double calcularPrecioVentaPublico (double ganancia) {
		return super.calcularPrecioVentaPublico(ganancia)+precioMontaje;
	}
	
	
	
}
