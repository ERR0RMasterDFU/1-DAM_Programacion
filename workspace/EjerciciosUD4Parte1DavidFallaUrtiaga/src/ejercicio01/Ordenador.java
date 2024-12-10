package ejercicio01;

public class Ordenador {

	//ATRIBUTOS 
	
	private double capDiscoDuro;
	private double FrecProcesador; 
	private double precioBase;
	private String marca;
	
	
	//CONSTRUCTOR
	
	public Ordenador(double capDiscoDuro, double frecProcesador, double precioBase, String marca) {
		super();
		this.capDiscoDuro = capDiscoDuro;
		FrecProcesador = frecProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	
	
	//GETTERS & SETTERS
	
	public double getCapDiscoDuro() {
		return capDiscoDuro;
	}

	public void setCapDiscoDuro(double capDiscoDuro) {
		this.capDiscoDuro = capDiscoDuro;
	}

	public double getFrecProcesador() {
		return FrecProcesador;
	}

	public void setFrecProcesador(double frecProcesador) {
		FrecProcesador = frecProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	//TO STRING
	
	@Override
	public String toString() {
		return "Ordenador [capDiscoDuro=" + capDiscoDuro + ", FrecProcesador=" + FrecProcesador + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}
	
	
	//MÉTODOS
	
	public double calcularPrecioVentaPublico (double ganancia) {
		int uno=1, cien=100;

		return precioBase/(uno-ganancia/cien);
	}
	
	
}
