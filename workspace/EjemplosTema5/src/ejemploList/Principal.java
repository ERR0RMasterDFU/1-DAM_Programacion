package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <>();
		
		lista.add("Cless Alvein");
		lista.add("Stahn Aileron");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("Cless Alvein"));
		
		System.out.println(lista.size());
		
		lista.remove(0);
		
		System.out.println(lista);
		
		System.out.println(lista.contains("Cless Alvein"));
		
		System.out.println(lista.size());
		
		
		
	}

}
