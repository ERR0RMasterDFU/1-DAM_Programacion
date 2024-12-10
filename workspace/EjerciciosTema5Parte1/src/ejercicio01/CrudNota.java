package ejercicio01;

import java.util.List;

public class CrudNota {

	private List <Nota> lista;

	
	public CrudNota(List<Nota> lista) {
		super();
		this.lista = lista;
	}

	
	public List<Nota> getLista() {
		return lista;
	}
	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "CrudNota [lista=" + lista + "]";
	}
	
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------------------
	
	
	public void imprimirLista() {
		for (Nota n : lista) {
			System.out.println(n);
		}
	}
	
	
	public Nota mostrarNota(int indice) {
		int uno=1;
		return lista.get(indice-uno);
	}
	
	
	public int mostrarNumeroNotas() {
		return lista.size();
	}

	
	public void aniadirNota(Nota n) {
		lista.add(n);
	}
	
	public void borrarNota (int indice) {
		int uno=1;
		
		if(!lista.isEmpty()) {
			lista.remove(indice-uno);
		}
	}
	
	public void modificar (Nota n, String titulo) {
		n.setTitulo(titulo);
	}
	
}
