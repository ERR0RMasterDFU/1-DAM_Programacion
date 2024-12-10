package ejercicio07_04;

import java.util.Arrays;
import java.util.List;

public class Venta {

	private List <LineaDeVenta> listado;

	
	public Venta(List<LineaDeVenta> listado) {
		super();
		this.listado = listado;
	}


	public List<LineaDeVenta> getListado() {
		return listado;
	}
	public void setListado(List<LineaDeVenta> listado) {
		this.listado = listado;
	}


	@Override
	public String toString() {
		return "Venta [listado=" + listado + "]";
	}



	//MÉTODOS--------------------------------------------------------------------------------------------------------------------------
	

	public double calcularPrecioTotal() {
		double total=0.0;
		
		for (int i = 0; i < listado.size(); i++) {
			total = total+listado[i].calcularPrecioTotalLinea();
		}
		
		return total;	
	}
	
	
	
	
	
}
