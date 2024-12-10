package stringJoiner;

import java.util.List;
import java.util.StringJoiner;

public class CRUDContrasenia {

	private List <StringJoiner> listaContrasenia;

	
	public CRUDContrasenia(List<StringJoiner> listaContrasenia) {
		super();
		this.listaContrasenia = listaContrasenia;
	}

	
	public List<StringJoiner> getListaContrasenia() {
		return listaContrasenia;
	}
	public void setListaContrasenia(List<StringJoiner> listaContrasenia) {
		this.listaContrasenia = listaContrasenia;
	}


	@Override
	public String toString() {
		return "CRUDContrasenia [listaContrasenia=" + listaContrasenia + "]";
	}
	
	
	//MÉTODOS-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public StringJoiner buscarPorIndice (int posicion) {
		StringJoiner sj=null;
		boolean salir=false;
		int uno=1;
		
		for (int i = 0; i < listaContrasenia.size() && !salir; i++) {
			if(i==posicion-uno) {
				sj = listaContrasenia.get(i);
				salir=true; 
			}
		}
		
		if(salir) {
			return sj;
		}else {
			return null;
		}
	}
	
	
	public void agregarElementoAContrasenia (StringJoiner sj, Persona p, String personalizado) {
		sj.add(p.getNombre());
		sj.add(p.getApellido1());
		sj.add(p.getApellido2());
		sj.add(p.getDni());
		sj.add(p.getFechaNacimiento());
		sj.add(personalizado);
	}
	

	public void guardarContraseniaEnlista(StringJoiner sj) {
		listaContrasenia.add(sj);
	}


	public void borrarContrasenia (StringJoiner sj) {
		listaContrasenia.remove(sj);
	}
		
	
	public void mostrarListaConstrasenia () {
		for (StringJoiner stringJoiner : listaContrasenia) {
			System.out.println(stringJoiner);
		}
	}
	
	
	public void mostrarConstrasenia (StringJoiner sj) {
		System.out.println(sj.toString());
	}
	
	
	public StringJoiner fusionarContrsenia(StringJoiner sj1, StringJoiner sj2) {
		return sj1.merge(sj2);
	}
	
	
	public int contarCaracteresContrasenia (StringJoiner sj) {
		return sj.length();
	}
	
}