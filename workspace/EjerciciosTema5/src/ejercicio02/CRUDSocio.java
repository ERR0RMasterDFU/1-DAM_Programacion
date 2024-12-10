package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class CRUDSocio {

	private List <Socio> lista;

	
	public CRUDSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "CRUDSocio [lista=" + lista + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------
	
	
	public void aniadirSocio (int id, String nombre, Double cuota) {
		lista.add(new Socio (id, nombre, cuota));
	}
	
	
	public Socio buscarPorId (int id) {
		Socio s=null;
		boolean salir=false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			
			if(lista.get(i).getId()==id) {
				s = lista.get(i);
				salir=true;
			}
		}
		return s;
	}
	
	public void modificarIDSocio (int id, Socio s) {
		
		s.setId(id);
	}
	
	public void modificarNombreSocio (String nombre, Socio s) {
		
		s.setNombre(nombre);
	}
	
	public void modificarCuotaDSocio (double cuota, Socio s) {
		
		s.setCuota(cuota);
	}
	
	public void eliminarSocio (Socio s) {
		lista.remove(s);
	}
	
	public void mostrarLista () {
		System.out.println(lista);
	}
}
