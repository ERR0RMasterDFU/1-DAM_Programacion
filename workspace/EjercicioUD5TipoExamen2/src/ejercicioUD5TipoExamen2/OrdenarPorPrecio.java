package ejercicioUD5TipoExamen2;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator <Trastero>{

	@Override
	public int compare(Trastero t1, Trastero t2) {
		// TODO Auto-generated method stub
		if (t1.getPrecio()>=t2.getPrecio()) {
			return -1;
		}else {
			return 1;
		}
	}

}
