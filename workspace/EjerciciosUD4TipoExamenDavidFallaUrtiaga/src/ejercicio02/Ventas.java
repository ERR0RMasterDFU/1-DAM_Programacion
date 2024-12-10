package ejercicio02;

import java.util.Arrays;

public class Ventas {

	private Producto [] lista;

	
	public Ventas(Producto[] lista) {
		super();
		this.lista = lista;
	}

	
	public Producto[] getLista() {
		return lista;
	}
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "Ventas [lista=" + Arrays.toString(lista) + "]";
	}
	
	/* Devolver la cantidad de productos que quedan por vender (en total), sin especificar de qué tipo.
	* Calcular la cantidad total de dinero recaudado entre todas las ventas. 
	* Devolver cambio, pasando lo que se debe pagar y el dinero entregado y retornando la cantidad a devolver.
	* Mostrar listado de productos completo mostrando los avisos cuando sea necesario.*/
	
	
	public int contarCantidad() {
		int contador=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			
			if(lista[i].isEstado()) {
				
				contador = lista[i].getCantidad()+contador;
	
			}
		}
		
		return contador;
	}
	
	
	
	public double calcularDineroTotal(double ganancia, double cantFija) {
		double calculoMovil=0, calculoEspada=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			
			if(lista[i] instanceof Movil) {
				
				calculoMovil = lista[i].calcularPVP(ganancia, cantFija)+calculoMovil;
				
			}else {
				calculoEspada = ((EspadaLaser)lista[i]).calcularPVP(ganancia, cantFija)+calculoEspada;
			}
		}
		
		return calculoMovil+calculoEspada;	
	}
	
	
}
