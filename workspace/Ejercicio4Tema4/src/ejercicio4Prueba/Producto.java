package ejercicio4Prueba;

public abstract class Producto {

	private String nombre;
	private int codIdentificacion;
	private double PrecioUnitario;
	
	
	public Producto(String nombre, int codIdentificacion, double precioUnitario) {
		super();
		this.nombre = nombre;
		this.codIdentificacion = codIdentificacion;
		PrecioUnitario = precioUnitario;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodIdentificacion() {
		return codIdentificacion;
	}
	public void setCodIdentificacion(int codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}
	
	public double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codIdentificacion=" + codIdentificacion + ", PrecioUnitario="
				+ PrecioUnitario + "]";
	}
	
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------------------
	
	public abstract double calcularPrecioUnitario();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
