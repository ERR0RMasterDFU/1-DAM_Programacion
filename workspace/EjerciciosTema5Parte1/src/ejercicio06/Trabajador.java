package ejercicio06;

public class Trabajador implements Comparable<Trabajador> {

	private String nombre;
	private String dni;
	private int horasTrab;
	private double sueldoFinal;
	
	
	public Trabajador(String nombre, String dni, int horasTrab, double sueldoFinal) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrab = horasTrab;
		this.sueldoFinal = sueldoFinal;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}
	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}


	@Override
	public String toString() {
		return "Trabajador [Nombre: " + nombre + " - DNI: " + dni + " - Horas trabajadas: " + horasTrab + " - Sueldo final: "
				+ sueldoFinal + "]";
	}
	
	
	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		if(this.sueldoFinal > t.getSueldoFinal()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
