package ejercicio06;

import java.util.List;

public class CRUDTrabajador {

	private List <Trabajador> lista;

	
	public CRUDTrabajador(List<Trabajador> lista) {
		super();
		this.lista = lista;
	}
	
	
	public List<Trabajador> getLista() {
		return lista;
	}
	public void setLista(List<Trabajador> lista) {
		this.lista = lista;
	}
	
	
	@Override
	public String toString() {
		return "CRUDTrabajador [lista=" + lista + "]";
	}
	
	

	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------


	public void agregarTrabajador (Trabajador t) {
		lista.add(t);
	}
	

	public Trabajador buscarTrabajador (String dni2) {
		
		if(lista.size()!=0) {
			for (Trabajador t : lista) {
				if(t.getDni().equalsIgnoreCase(dni2)) {
					return t;
				}
			}
		}
		return null;
	}
	
	
	public void modificarTrabajador (Trabajador t, String nuevoNombre, String nuevoDni, int nuevasHorasTrab, double nuevoSueldoFinal) {
		t.setNombre(nuevoNombre);
		t.setDni(nuevoDni);
		t.setHorasTrab(nuevasHorasTrab);
		t.setSueldoFinal(nuevoSueldoFinal);
	}
	
	
	public void borrarTrabajador (Trabajador t) {
		lista.remove(t);
	}
	
	
	public void mostrarListaTrabajador () {
		for (Trabajador t : lista) {
			System.out.println(t);
		}
	}
	
}