package ejercicio02;

public abstract class Producto {

	private double precioBase;
	private int cantidad;
	private String nombre;
	private boolean estado;
	
	
	public Producto(double precioBase, int cantidad, String nombre, boolean estado) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.estado = estado;
	}


	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Producto [Precio base = " + precioBase + " - Cantidad = " + cantidad + " - Nombre = " + nombre + " - Estado=" + estado + "]";
	}
	
	
	//MÉTODOS------------------------------------------------------------------------------------------------------------------------------------
	
	
	public abstract double calcularPVP (double ganancia, double cantFija);
	
	

}
