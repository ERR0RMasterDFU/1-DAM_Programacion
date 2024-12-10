package ejercicio03;

import java.util.Arrays;

public class Vendedor {

	/*3. Vamos a intentar modelar a un vendedor "callejero" móviles. Los atributos de la clase Móvil serán, como 
	mínimo, marca, modelo, vendido o no, nuevo o de segunda mano y precio unitario. En la clase Vendedor 
	tendremos como características un array de Móviles y total vendido (se pueden añadir más atributos si se 
	quiere o precisa). Se deben crear métodos que hagan las siguientes operaciones:
	
	- Comprobar cuántos móviles le quedan sin vender.
	
	- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano. 
	
	- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. 
	
	- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
	
	Escribir también una clase de prueba para hacer todas las operaciones.*/
	
	
	//ATRIBUTOS
	
	private Movil [] lista;
	private double totalVendido;
	private int numMoviles;
	private Movil m;
	
	//CONSTRUCTOR
	
	public Vendedor(Movil[] lista, double totalVendido, int numMoviles) {
		super();
		this.lista = lista;
		this.totalVendido = totalVendido;
		this.numMoviles = numMoviles;
	}

	
	//GETTERS & SETTERS
	
	public Movil[] getLista() {
		return lista;
	}

	public void setLista(Movil[] lista) {
		this.lista = lista;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	public int getNumMoviles() {
		return numMoviles;
	}

	public void setNumMoviles(int numMoviles) {
		this.numMoviles = numMoviles;
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		return "Vendedor [lista=" + Arrays.toString(lista) + ", totalVendido=" + totalVendido + ", numMoviles="
				+ numMoviles + "]";
	}
	
	
	
	//MÉTODOS
	
	//System.out.println("1. COMPROBAR MÓVILES SIN VENDER.");
		
	public void comprobarMovilesDisponibles() {
		boolean encontrado=false;
		
		for (int i = 0; i < numMoviles; i++) {
			
			if(disponible==encontrado) {
				System.out.println(lista[i]);
			}
			
		}
		
	}


	public Movil getM() {
		return m;
	}


	public void setM(Movil m) {
		this.m = m;
	}
	
	
	//System.out.println("2. MOSTRAR PRECIO FINAL (+ DESCUENTO).");
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println("3. AÑADIR MÓVIL A LA SÁBANA.");
	
	public boolean comprobarDecison1(String decision1) {
		String afirmacion=("SI");
		boolean resultado;
		
		if(decision1.equalsIgnoreCase(afirmacion)) {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	

	public boolean comprobarDecison2(String decision1) {
		String afirmacion=("SI");
		boolean resultado;
		
		if(decision1.equalsIgnoreCase(afirmacion)) {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	
	
	
	
	public void aniadirMovil(String marca, String modelo, boolean disponible, boolean estado, double precioUnitario, int tam) {
		
		for (int i = 0; i < numMoviles; i++) {
		
			lista[i]=m;
			i++;
		}	
		
	}
	
	
	
	
	
	
	//System.out.println("4. MOSTRAR SÁBANA.");
	
	public void mostrarSabana() {
		for (int i = 0; i < numMoviles && lista[i]!=null; i++) {
			
			System.out.println(lista[i]);
			
		}
	}
	
	
	
	//System.out.println("5. CALCULAR SUMA RATILLA.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
