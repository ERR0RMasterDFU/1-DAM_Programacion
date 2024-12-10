package ejercicio4Prueba;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] lista;

	
	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	
	public LineaDeVenta[] getLista() {
		return lista;
	}
	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------------------
	
	
	public double calcularPrecioTotal() {
		double total=0.0;
		
		for (int i = 0; i < lista.length; i++) {
			total = total+lista[i].calcularPrecioTotalLinea();
		}
		
		return total;	
	}
	
	
	
	
	
}
