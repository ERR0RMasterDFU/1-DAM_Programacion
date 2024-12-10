package ejercicio03SET;

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
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	public void agregarNuevoAlumno (Alumno a) {
		lista.add(a);
	}
	
	
	public Alumno buscarAlumno (String apellidos) {
		Iterator <Alumno> it = lista.iterator();
		
		while(it.hasNext()) {
			
			if(it.next().getApellidos().equalsIgnoreCase(apellidos)){
				return it.next();
			}
		}
		return null;
	}
	
	
	public void modificarAlumno (String nombreNuevo, String apellidosNuevos, int edadNueva, double nota1Nueva, double nota2Nueva, double nota3Nueva, Alumno a) {
		a.setNombre(nombreNuevo);
		a.setApellidos(apellidosNuevos);
		a.setEdad(edadNueva);
		a.setNota1(nota1Nueva);
		a.setNota2(nota2Nueva);
		a.setNota3(nota3Nueva);
	}
	
	
	public void borrarAlumno (Alumno a) {
		lista.remove(a);
	}

	
	public void mostrarListaAlumnos () {
		Iterator <Alumno> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
