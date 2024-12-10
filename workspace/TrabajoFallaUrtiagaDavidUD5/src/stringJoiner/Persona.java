package stringJoiner;

public class Persona {

	private String nombre, apellido1, apellido2, dni, fechaNacimiento;
	

	public Persona(String nombre, String apellido1, String apellido2, String dni, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Datos de la persona [Nombre: " + nombre + " - Primer apellido: " + apellido1 + " - Segundo apellido: " + apellido2 + " - DNI: " + dni
				+ " - Fecha de nacimiento: " + fechaNacimiento + "]";
	}

	
	
}
