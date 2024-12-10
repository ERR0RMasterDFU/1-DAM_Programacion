package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int cobro;
	private double saldoEmpresa;
	
	
	public CuentaEmpresa(int cobro, double saldoEmpresa) {
		super();
		this.cobro = cobro;
		this.saldoEmpresa = saldoEmpresa;
	}


	public int getCobro() {
		return cobro;
	}
	public void setCobro(int cobro) {
		this.cobro = cobro;
	}

	public double getSaldoEmpresa() {
		return saldoEmpresa;
	}
	public void setSaldoEmpresa(double saldoEmpresa) {
		this.saldoEmpresa = saldoEmpresa;
	}


	@Override
	public String toString() {
		return "CuentaEmpresa [cobro=" + cobro + ", saldoEmpresa=" + saldoEmpresa + "]";
	}


	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	

	@Override
	public double ingresarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		saldoEmpresa = saldoEmpresa + dinero;
		
		return saldoEmpresa;
	}


	@Override
	public double sacarDinero(double dinero) {
		// TODO Auto-generated method stub
		
		saldoEmpresa = saldoEmpresa - dinero;
		
		return saldoEmpresa;
	}
	
	
	public double cobrarDinero() {
		cobro=0;
		
		return saldoEmpresa = saldoEmpresa - cobro;
	}
	
}
