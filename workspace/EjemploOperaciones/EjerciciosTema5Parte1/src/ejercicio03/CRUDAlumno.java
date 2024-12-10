package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CRUDAlumno {

	private Set <Alumno> lista;

	public CRUDAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CRUDAlumno [lista=" + lista + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------
	
	public Alumno findByidAlumno(int idAlumno) {
		Alumno a=null;
		Iterator <Alumno> it =lista.iterator();
		boolean encontrado=false;
		
		while(it.hasNext() && !encontrado) {
			a=it.next();
			
			if(a.getidAlumno()==idAlumno) {
				encontrado=true;
			}
		}
		
		if(encontrado){
			return a;
		}else
		return null;
	}
	
	
	//MÉTDOS
	
	public void agregarAlumno (Alumno a) {
		lista.add(a);
	}
	
}
