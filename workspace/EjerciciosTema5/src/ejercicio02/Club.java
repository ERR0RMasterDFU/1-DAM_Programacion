package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Club {

	private String nombre;
	private int numPistas;
	private List <Socio> lista= new ArrayList <>();
	
	
	public Club(String nombre, int numPistas, List<Socio> lista) {
		super();
		this.nombre = nombre;
		this.numPistas = numPistas;
		this.lista = lista;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumPistas() {
		return numPistas;
	}
	public void setNumPistas(int numPistas) {
		this.numPistas = numPistas;
	}
	public List<Socio> getLista() {
		return lista;
	}
	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}
	
	
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", numPistas=" + numPistas + ", lista=" + lista + "]";
	}
	
	
}
