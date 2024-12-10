package stringBuilder;

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
	
	
	public void agregarPersona (String nombre, String apellidos, String dni, double altura, double peso, int edad) {
		lista.add(new Persona (nombre, apellidos, dni, altura, peso, edad));
	}

	
	public void modificarPersona (String nuevoNombre, String nuevosApellidos, String nuevoDni, double nuevaAltura, double nuevoPeso, int nuevaEdad, Persona p) {
		p.setNombre(nuevoNombre);
		p.setApellidos(nuevosApellidos);
		p.setDni(nuevoDni);
		p.setAltura(nuevaAltura);
		p.setPeso(nuevoPeso);
		p.setEdad(nuevaEdad);
	}
		
	
	public void borrarDatos (Persona p) {
		lista.remove(p);
	}
		
}