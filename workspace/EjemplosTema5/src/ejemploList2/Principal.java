package ejemploList2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona ("Naoya", "Toudou", 17, 1.75, 56);
		Persona p2 = new Persona ("Tatsuya", "Suou", 18, 1.81, 68);
		Persona p3 = new Persona ("Makoto", "Yuki", 17, 1.70, 54.2);
		Persona p4 = new Persona ("Yu", "Narukami", 17, 1.80, 55.6);
		Persona p5 = new Persona ("Ren", "Amamiya", 17, 1.75, 58.9);
		
		List <Persona> lista = new ArrayList <>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		System.out.println(lista);
		
		System.out.println(lista.contains(p4));
		
		System.out.println(lista.size());
		
		lista.remove(2);
		
		System.out.println(lista);
		
		System.out.println(lista.contains(p3));
		
		System.out.println(lista.size());
		
		
		
		
		
		
		
	}

}
