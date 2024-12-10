package ejercicio01;

import java.util.Arrays;

public class Tienda {

	//ATRIBUTOS--------------------------------------------------------
	
	private Producto[]lista;

	//CONSTRUCTORES----------------------------------------------------
	
	public Tienda(Producto[] lista, Producto p) {
		this.lista = lista;
	}
	
	
	//GETTERS & SETTERS------------------------------------------------
	
	public Producto[] getLista() {
		return lista;
	}
	
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	
	//TO STRING--------------------------------------------------------
	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
