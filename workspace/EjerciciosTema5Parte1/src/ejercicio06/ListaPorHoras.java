package ejercicio06;

import java.util.Comparator;

public class ListaPorHoras implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		if(t1.getHorasTrab() < t2.getHorasTrab()) {
			return -1;
		}else {
			return 1;
		}
	}

}
