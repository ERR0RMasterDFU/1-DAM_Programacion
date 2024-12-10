package ejercicio05;

import java.util.List;

public class CRUDDatosPersonales {

	private List <DatosPersonales> lista;

	
	public CRUDDatosPersonales(List<DatosPersonales> lista) {
		super();
		this.lista = lista;
	}

	
	public List<DatosPersonales> getLista() {
		return lista;
	}
	public void setLista(List<DatosPersonales> lista) {
		this.lista = lista;
	}

	
	@Override
	public String toString() {
		return "CRUDDatosPersonales [lista=" + lista + "]";
	}
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	public void agregarDatos (DatosPersonales dp) {
		lista.add(dp);
	}
	
	
	public DatosPersonales buscarDatos (int indice) {
		
		if(lista.size()!=0) {
			for (DatosPersonales dp : lista) {
				if(dp.getCodPersona()==indice) {
					return dp;
				}
			}
		}
		return null;
	}
	
	
	public void modificarDatos (DatosPersonales dp, int nuevoCodPersona, String nuevoNombre, String nuevosApellidos, int nuevaEdad, double nuevaAltura) {
		dp.setCodPersona(nuevoCodPersona);
		dp.setNombre(nuevoNombre);
		dp.setApellidos(nuevosApellidos);
		dp.setEdad(nuevaEdad);
		dp.setAltura(nuevaAltura);
	}
	
	
	public void borrarDatos (DatosPersonales dp) {
		lista.remove(dp);
	}
	
	
	public void mostrarListaDatos () {
		for (DatosPersonales datosPersonales : lista) {
			System.out.println(datosPersonales);
		}
	}
}
