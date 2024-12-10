package ejercicio01;

import java.util.Arrays;

public class Biblioteca implements IInterfaz {

	
	private Publicacion [] lista;
	

	public Biblioteca(Publicacion[] lista) {
		super();
		this.lista = lista;
	}

	
	public Publicacion[] getLista() {
		return lista;
	}
	public void setLista(Publicacion[] lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Distribuidora [lista=" + Arrays.toString(lista) + "]";
	}


	@Override
	public int cuentaPrestados(Publicacion[] lista) {
		// TODO Auto-generated method stub
		int encontrado=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			
			if(lista[i].isPrestado()) {
				encontrado++;
			}
		}
		return encontrado;
	}

	
	@Override
	public int publicacionesAnterioresA(Publicacion[] lista, int anio) {
		// TODO Auto-generated method stub
		int encontrado=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			
			if(lista[i].getanioSalida()<anio) {
				encontrado++;
			}
		}
		return encontrado;
	}

	
	public void mostrarLista() {
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			System.out.println(lista[i]);
		}
	}
	
	
	public void avisoRevista(Publicacion[] lista, int numRevista) {
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			
			if(lista[i] instanceof Revista) {
				((Revista) lista[i]).mostrarAvisoRevistas(numRevista);
			}
		}
	}
	
	

}
