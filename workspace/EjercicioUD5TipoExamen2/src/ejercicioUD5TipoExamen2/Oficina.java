package ejercicioUD5TipoExamen2;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List <Trastero> lista;

	
	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	
	public List<Trastero> getLista() {
		return lista;
	}
	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------

	
	public void agregar (Trastero t) {
		lista.add(t);
	}
	
	
	public List <Trastero> buscarPorPrecio (double precioBuscar) {
		List <Trastero> listaPrecio = new ArrayList <Trastero> ();
		
		for (Trastero t : lista) {
			if(t.getPrecio()==precioBuscar) {
				listaPrecio.add(t);
			}
		}
		
		if(listaPrecio.isEmpty()) {
			return null;
		}else {
			return listaPrecio;
		}
	}
	
	
	public void mostrarListaPrecio (List <Trastero> listaPrecio) {
		for (Trastero t : listaPrecio) {
			System.out.println(t);
		}
	}
	
	
	public Trastero buscarPorNumero (int numTrasteroBuscar) {
		Trastero t = null;
		boolean encontrado = false;
		
		for (int i = 0; i < lista.size() && !encontrado; i++) {
			
			if(lista.get(i).getNumTrastero()==numTrasteroBuscar) {
				encontrado=true;
				t = lista.get(i);
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return t;
		}else {
			return null;
		}
	}
	
	
	public Trastero buscarTrasteroMasCaro () {
		double precio=0;
		Trastero t = null;
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(precio<=lista.get(i).getPrecio()) {
				precio = lista.get(i).getPrecio();
				t = lista.get(i);
			}else {
				i++;
			}
		}
		return t;
	}
	
	
	public void mostrarLista () {
		for (Trastero t : lista) {
			System.out.println(t);
		}
	}
	
	
	public void borrarTrastero (Trastero t) {
		lista.remove(t);
	}
	
	
	public void modificarTrastero (Trastero t, double nuevoPrecio) {
		t.setPrecio(nuevoPrecio);
	}
	
	
	public void mostrarTrasterosDisponibles () {
		for (Trastero t : lista) {
			if(t.isOcupado()==false) {
				System.out.println(t);
			}
		}
	}
	
}
