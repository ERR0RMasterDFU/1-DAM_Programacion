package stringJoiner;

import java.util.List;

public class CRUDPersona {

	private List <Persona> lista;

	public CRUDPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CRUDString [lista=" + lista + "]";
	}
	
	
	//MÉTODOS-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public Persona buscarPorDni (String dni2) {
		Persona p=null;
		boolean salir=false;
		
		for (int i = 0; i < lista.size() && !salir; i++) {
			
			if(lista.get(i).getDni().equalsIgnoreCase(dni2)) {
				p = lista.get(i);
				salir=true;
			}
		}
		return p;
	}
	
	
	public void mostrarDatosLista () {
		for (Persona persona : lista) {
			System.out.println(persona);
		}
	}
	
	
	public void agregarPersona (String nombre, String apellido1, String apellido2, String dni, String fechaNacimiento) {
		lista.add(new Persona (nombre, apellido1, apellido2, dni, fechaNacimiento));
	}

	
	public void modificarPersona (String nuevoNombre, String nuevoApellido1, String nuevoApellido2, String nuevoDni, String nuevaFechaNacimiento, Persona p) {
		p.setNombre(nuevoNombre);
		p.setApellido1(nuevoApellido1);
		p.setApellido2(nuevoApellido2);
		p.setDni(nuevoDni);
		p.setFechaNacimiento(nuevaFechaNacimiento);
		
	}
	
	public void borrarDatos (Persona p) {
		lista.remove(p);
	}
	
}