package ejercicio05;

public abstract class Empleado {

	private String nombre, apellidos;
	private double SueldoBase;
	private int NumEmpleado;
	
	
	public Empleado(String nombre, String apellidos, double sueldoBase, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		SueldoBase = sueldoBase;
		NumEmpleado = numEmpleado;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return SueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		SueldoBase = sueldoBase;
	}

	public int getNumEmpleado() {
		return NumEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		NumEmpleado = numEmpleado;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", SueldoBase=" + SueldoBase
				+ ", NumEmpleado=" + NumEmpleado + "]";
	}
	
	
	public abstract double calcularSueldo ();
	
	
	
	
	
	
	
	
	
	
}
