package ejercicio01;

public class Libro extends Publicacion{

	private int numPaginas;
	private String titulo;
	

	public Libro(int numlectores, int anioSalida, boolean prestado, int numPaginas, String titulo) {
		super(numlectores, anioSalida, prestado);
		this.numPaginas = numPaginas;
		this.titulo = titulo;
	}
	
	
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return super.toString()+"Libro [numPaginas=" + numPaginas + ", titulo=" + titulo + "]";
	}

	
	//MÉTODOS--------------------------------------------------------------------------------------------------------------------------
	
	
}
