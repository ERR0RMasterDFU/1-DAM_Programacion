package ejercicio02;

public class Trabajador implements IImpuesto {

	private String nombre;

	
	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + "]";
	}

	//MÉTODOS--------------------------------------------------------------------------------------------------------------------------
	
	@Override
	public double calcularIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
