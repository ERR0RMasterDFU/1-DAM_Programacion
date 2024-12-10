package ejercicio01;

public abstract class Publicacion {

	private int numlectores;
	private int anioSalida;
	private boolean prestado; 
	
	
	public Publicacion(int numlectores, int anioSalida, boolean prestado) {
		super();
		this.numlectores = numlectores;
		this.anioSalida = anioSalida;
		this.prestado = prestado;
	}
	
	
	public int getNumlectores() {
		return numlectores;
	}
	public void setNumlectores(int numlectores) {
		this.numlectores = numlectores;
	}
	
	public int getanioSalida() {
		return anioSalida;
	}
	public void setanioSalida(int anioSalida) {
		this.anioSalida = anioSalida;
	}

	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	@Override
	public String toString() {
		return "Publicacion [numlectores=" + numlectores + ", Año de salida=" + anioSalida + ", prestado=" + prestado + "]";
	}

	

	//MÉTODOS---------------------------------------------------------------------------------------------------------------------------






}
