package ejercicio05;

import java.util.Comparator;

public class ListaAlfabetica implements Comparator<DatosPersonales>{

	@Override
	public int compare(DatosPersonales dp1, DatosPersonales dp2) {
		// TODO Auto-generated method stub
		return dp1.getNombre().toLowerCase().compareTo(dp2.getNombre().toLowerCase());
	}

}
