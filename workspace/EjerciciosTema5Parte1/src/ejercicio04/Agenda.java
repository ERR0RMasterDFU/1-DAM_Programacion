package ejercicio04;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Agenda {

	private Map <Contacto, String> lista;

	
	public Agenda(Map<Contacto, String> lista) {
		super();
		this.lista = lista;
	}

	
	public Map<Contacto, String> getLista() {
		return lista;
	}
	public void setLista(Map<Contacto, String> lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	
	public void agregarNuevoContacto (Contacto c, String numTelefono) {
		lista.put(c, numTelefono);
	}
	
	
	public void mostrarLista () {
		Set <Entry<Contacto, String>> MapaContactos = lista.entrySet();
		for (Entry<Contacto, String> entry : MapaContactos) {
			System.out.println(entry);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}