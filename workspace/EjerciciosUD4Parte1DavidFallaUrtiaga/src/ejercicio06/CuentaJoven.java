package ejercicio06;

public class CuentaJoven extends Cuenta {
	
	private double regalo;
	private double saldoJoven;
	
	
	public CuentaJoven(double regalo, double saldoJoven) {
		super();
		this.regalo = regalo;
		this.saldoJoven = saldoJoven;
	}
	
	
	public double getRegalo() {
		return regalo;
	}
	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}
	
	public double getSaldoJoven() {
		return saldoJoven;
	}
	public void setSaldoJoven(double saldoJoven) {
		this.saldoJoven = saldoJoven;
	}
	
	
	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + ", saldoJoven=" + saldoJoven + "]";
	}


	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public double ingresarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		return saldoJoven = saldoJoven + dinero;
	}


	@Override
	public double sacarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		return saldoJoven = saldoJoven - dinero;
	}
	
	
	public double RegalarDinero () {
		
		return saldoJoven = saldoJoven + regalo;
	}
	
}
