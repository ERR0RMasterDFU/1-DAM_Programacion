package ejercicio4Prueba;

public class Alimentacion extends Producto {

	private double pcntDescuento;
	private boolean caducaEn2Dias;
	
	
	public Alimentacion(String nombre, int codIdentificacion, double precioUnitario, double pcntDescuento,
			boolean caducaEn2Dias) {
		super(nombre, codIdentificacion, precioUnitario);
		this.pcntDescuento = pcntDescuento;
		this.caducaEn2Dias = caducaEn2Dias;
	}
	
	
	public double getPcntDescuento() {
		return pcntDescuento;
	}
	public void setPcntDescuento(double pcntDescuento) {
		this.pcntDescuento = pcntDescuento;
	}
	
	public boolean isCaducaEn2Dias() {
		return caducaEn2Dias;
	}
	public void setCaducaEn2Dias(boolean caducaEn2Dias) {
		this.caducaEn2Dias = caducaEn2Dias;
	}
	
	
	@Override
	public String toString() {
		return "Alimentacion [pcntDescuento=" + pcntDescuento + ", caducaEn2Dias=" + caducaEn2Dias + "]";
	}
	
	
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public double calcularPrecioUnitario() {
		// TODO Auto-generated method stub
		double cien=100;
		
		if(caducaEn2Dias) {
			
			return super.getPrecioUnitario()-(super.getCodIdentificacion()*pcntDescuento);
			
		}else {
			return super.getPrecioUnitario();
		}
	}
	
	public void mostrarSiCaducaEn2Dias () {
		if(caducaEn2Dias) {
			System.out.println("Al producto le quedan menos de 2 días para caducar.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
