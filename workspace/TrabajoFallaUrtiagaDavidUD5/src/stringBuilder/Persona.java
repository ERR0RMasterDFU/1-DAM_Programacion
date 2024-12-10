package stringBuilder;

public class Persona {

	private String nombre, apellidos, dni;
	private double altura, peso;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, String dni, double altura, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.altura = altura;
		this.peso = peso;
		this.edad = edad;
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

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Datos de la persona [Nombre: " + nombre + " - Apellidos: " + apellidos + " - DNI: " + dni + " - Altura: " + altura
				+ "m - Peso: " + peso + "Kg - Edad: " + edad + " año/s]";
	}
	
}
