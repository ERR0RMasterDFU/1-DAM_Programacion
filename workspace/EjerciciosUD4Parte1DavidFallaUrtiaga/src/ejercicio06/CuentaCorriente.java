package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double mantenimientoFijo;
	private int puntos;
	private double saldoCorriente;
	
	
	public CuentaCorriente(double mantenimientoFijo, int puntos, double saldoCorriente) {
		super();
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntos = puntos;
		this.saldoCorriente = saldoCorriente;
	}
	
	
	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}
	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public double getSaldoCorriente() {
		return saldoCorriente;
	}
	public void setSaldoCorriente(double saldoCorriente) {
		this.saldoCorriente = saldoCorriente;
	}


	@Override
	public String toString() {
		return "Cuenta Corriente ---> [Precio del mantenimiento fijo=" + mantenimientoFijo + ", Puntos por cada uso=" + puntos + ", Saldo="
				+ saldoCorriente + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public double ingresarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		return saldoCorriente = saldoCorriente + dinero;
	}


	@Override
	public double sacarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		return saldoCorriente = saldoCorriente - dinero;
	}
	
	
	public int sumarPuntos() {

		return puntos++;
	}
	
	
	public double pagarMantenimientoFijo() {

		return saldoCorriente = saldoCorriente - mantenimientoFijo;
	}
	
	
}
