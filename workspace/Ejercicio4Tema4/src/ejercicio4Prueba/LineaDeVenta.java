package ejercicio4Prueba;

public class LineaDeVenta {

	private Producto p;
	private int cantProductos;
	
	
	public LineaDeVenta(Producto p, int cantProductos) {
		super();
		this.p = p;
		this.cantProductos = cantProductos;
	}
	
	
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	
	public int getCantProductos() {
		return cantProductos;
	}
	public void setCantProductos(int cantProductos) {
		this.cantProductos = cantProductos;
	}
	
	
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantProductos=" + cantProductos + "]";
	}
	
	
	//MÉTODOS--------------------------------------------------------------------------------------------------------------------------------------
	
	
	public double calcularPrecioTotalLinea() {
		return p.calcularPrecioUnitario()*cantProductos;
	}
	
	public double calcularPrecioDeUno () {
		return p.calcularPrecioUnitario();
	}
	
}
