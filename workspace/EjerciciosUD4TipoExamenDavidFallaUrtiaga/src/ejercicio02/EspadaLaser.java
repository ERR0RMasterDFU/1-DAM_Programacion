package ejercicio02;

public class EspadaLaser extends Producto {

	private String tipo;
	private int numHojas;
	
	
	public EspadaLaser(double precioBase, int cantidad, String nombre, boolean estado, String tipo, int numHojas) {
		super(precioBase, cantidad, nombre, estado);
		this.tipo = tipo;
		this.numHojas = numHojas;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumHojas() {
		return numHojas;
	}
	public void setNumHojas(int numHojas) {
		this.numHojas = numHojas;
	}
	
	
	@Override
	public String toString() {
		return "Espada láser [Tipo = " + tipo + " - Número de hojas = " + numHojas + "]";
	}
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------------------

	
	@Override
	public double calcularPVP(double ganancia, double cantFija) {
		// TODO Auto-generated method stub
		double cien= 100.00;
		
		if(tipo.equalsIgnoreCase("doble")) {
				
			return super.getPrecioBase()+cantFija+ganancia/cien;
				
		}else {
				
			return super.getPrecioBase()+ganancia/cien;
		}
			
	}
	
	

	public void mostrarAvisoTipoDoble() {

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
