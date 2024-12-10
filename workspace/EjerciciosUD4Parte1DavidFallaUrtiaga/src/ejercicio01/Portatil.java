package ejercicio01;

public class Portatil extends Ordenador {

	//ATRIBUTOS
	
	private boolean seguros;
	private double precioSeguro;
	
	
	//CONSTRUCTOR
	
	public Portatil(double capDiscoDuro, double frecProcesador, double precioBase, String marca, boolean seguros, double precioSeguro) {
		super(capDiscoDuro, frecProcesador, precioBase, marca);
		this.seguros = seguros;
		this.precioSeguro = precioSeguro;
		
		
	//GETTERS & SETTERS
		
	}
	public boolean isSeguros() {
		return seguros;
	}
	public void setSeguros(boolean seguros) {
		this.seguros = seguros;
	}
	public double getPrecioSeguro() {
		return precioSeguro;
	}
	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}
	
	
	//TO STRING
	
	@Override
	public String toString() {
		return super.toString()+ " ---> Portátil [seguros=" + seguros + ", precioSeguro=" + precioSeguro + "]";
	}
	
	
	//MÉTODOS
	
		public double calcularPrecioVentaPublico (double ganancia) {
			
			if(seguros==true) {
				return super.calcularPrecioVentaPublico(ganancia)+precioSeguro;
			}else {
				return super.calcularPrecioVentaPublico(ganancia);
			}
		}
		
}
