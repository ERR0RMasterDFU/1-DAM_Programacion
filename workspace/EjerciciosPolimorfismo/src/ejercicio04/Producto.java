package ejercicio04;

public abstract class  Producto {
	
	private double precioUni;
	private String nombre;
	private int codigoID;
	
	
	public Producto(double precioUni, String nombre, int codigoID) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.codigoID = codigoID;
	}


	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoID() {
		return codigoID;
	}

	public void setCodigoID(int codigoID) {
		this.codigoID = codigoID;
	}


	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", codigoID=" + codigoID + "]";
	}
	
}
