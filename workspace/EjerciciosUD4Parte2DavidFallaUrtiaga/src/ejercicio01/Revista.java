package ejercicio01;

public class Revista extends Publicacion{

	private int edicion;
	private String marca;
	
	
	public Revista(int numlectores, int anioSalida, boolean prestado, int edicion, String marca) {
		super(numlectores, anioSalida, prestado);
		this.edicion = edicion;
		this.marca = marca;
	}


	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return super.toString()+"Revista [edicion=" + edicion + ", marca=" + marca + "]";
	}
	
	
	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------	
	
	
	public void mostrarAvisoRevistas(int numRevista) {
		
		if(edicion==numRevista) {
			System.out.println("¡ENHORABUENA! HAS PUBLICADO MÁS DE "+numRevista+" REVISTAS. :P");
		}
		
	}
	
	
	
	
	
}
