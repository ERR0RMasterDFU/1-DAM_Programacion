package ejercicio06;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] lista;

	
	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	
	public Cuenta[] getLista() {
		return lista;
	}
	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	public double contarRegalo (double regalo) {
		
		return regalo++;
	}
	
	
	public void mostrarLista() {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	
	public double sumarSaldoCuentas(Cuenta cc, Cuenta cj, Cuenta ce) {
	
		return ((CuentaCorriente)cc).getSaldoCorriente()+((CuentaJoven)cj).getSaldoJoven()+((CuentaEmpresa)ce).getSaldoEmpresa();
	}
	
	
	
}
