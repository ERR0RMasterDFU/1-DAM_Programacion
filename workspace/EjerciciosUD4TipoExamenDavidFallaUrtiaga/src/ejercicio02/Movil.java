package ejercicio02;

public class Movil extends Producto {

	private String marca;
	private int modelo;
	

	public Movil(double precioBase, int cantidad, String nombre, boolean estado, String marca, int modelo) {
		super(precioBase, cantidad, nombre, estado);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"---> Móvil [Marca = " + marca + " - Modelo = " + modelo + "]";
	}


	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public double calcularPVP(double ganancia, double cantFija) {
		// TODO Auto-generated method stub
		double cien=100.00;
		
		return super.getPrecioBase()+ganancia/cien;
	}
	
	
}
