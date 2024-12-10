package ejercicio02;

public class Producto implements IImpuesto {

	private double precio;
	private int iva;
	
	
	public Producto(double precio, int iva) {
		super();
		this.precio = precio;
		this.iva = iva;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", iva=" + iva + "]";
	}


	//MÉTODOS--------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public double calcularIva(double precio, int iva) {
		// TODO Auto-generated method stub
		int cien=100;
		
		return precio*iva/cien;
	}


	@Override
	public double calcularIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
}
