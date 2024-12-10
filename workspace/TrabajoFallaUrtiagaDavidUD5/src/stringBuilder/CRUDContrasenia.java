package stringBuilder;

import java.util.List;

public class CRUDContrasenia {

	private List <StringBuilder> listaContrasenia;

	
	public CRUDContrasenia(List<StringBuilder> listaContrasenia) {
		super();
		this.listaContrasenia = listaContrasenia;
	}
	
	
	public List<StringBuilder> getlistaContrasenia() {
		return listaContrasenia;
	}
	public void setlistaContrasenia(List<StringBuilder> listaContrasenia) {
		this.listaContrasenia = listaContrasenia;
	}


	@Override
	public String toString() {
		return "CRUDContrasenia [listaContrasenia=" + listaContrasenia + "]";
	}
	
	
	//MÉTODOS-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public void agregarElementoAContrasenia (StringBuilder sb, String personalizado) {
		sb.append(personalizado);
	}
	
	
	public void guardarContraseniaEnlista(StringBuilder sb) {
		listaContrasenia.add(sb);
	}
	
	
	public void borrarContrasenia (StringBuilder sb) {
		listaContrasenia.remove(sb);
	}
	
	
	public void mostrarListaConstrasenia () {
		for (StringBuilder stringBuilder : listaContrasenia) {
			System.out.println(stringBuilder);
		}
	}
	
	
	public StringBuilder buscarPorIndice (int posicion) {
		StringBuilder sb=null;
		boolean salir=false;
		int uno=1;
		
		for (int i = 0; i < listaContrasenia.size() && !salir; i++) {
			if(i==posicion-uno) {
				sb = listaContrasenia.get(i);
				salir=true; 
			}
		}
		
		if(salir) {
			return sb;
		}else {
			return null;
		}
	}
	
	
	public int calcularCapacidad (StringBuilder sb) {
		return sb.capacity();
	}
	
	
	public int contarCaracteresContrasenia (StringBuilder sb) {
		return sb.length();
	}
	
	
	public StringBuilder revertirCadena (StringBuilder sb) {
		return sb.reverse();
	}
	
	
	public StringBuilder agregarCaracteresAPosicion (StringBuilder sb, int indice, String personalizado) {
		return sb.insert(indice, personalizado);
	}
	
	
	public StringBuilder borrarCaracteresEntreLimites (StringBuilder sb, int indiceI, int indiceF) {
		return sb.delete(indiceI, indiceF);
	}
	
	
	public StringBuilder remplazoDeCaracteres (StringBuilder sb, int indiceI, int indiceF, String personalizado) {
		return sb.replace(indiceI, indiceF, personalizado);
	}
	
	
	public String acortarContrasenia(StringBuilder sb, int indiceI, int indiceF) {
		return sb.substring(indiceI, indiceF);
	}
	
}
