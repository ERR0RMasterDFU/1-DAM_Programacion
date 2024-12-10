package ejercicio04;

public class Alimentacion extends Producto {

	private double descuento;
	private int dias;
	
	
	public Alimentacion(double precioUni, String nombre, int codigoID, double descuento, int dias) {
		super(precioUni, nombre, codigoID);
		this.descuento = descuento;
		this.dias = dias;
	}


	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getDias() {
		return dias;
	}
	
	public void setDias(int dias) {
		this.dias = dias;
	}


	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + ", dias=" + dias + "]";
	}
	
	
	public void calcularDescuento (precioUni) {
		double viente=20, precioUni=100;
		return precioUni-(20*precioUni/100);
	}
	
	
	public void avisarCaducidad () {
		
		if(dias < 2) {
			System.out.println("¡ATENCIÓN, ESTE PRODUCTO CADUCARÁ EN MENOS DE DOS DÍAS!");
		}
		
	}
	

}
