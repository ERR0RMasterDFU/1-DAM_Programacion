package ejercicio05;

public class DatosPersonales implements Comparable<DatosPersonales> {

	private int codPersona;
	private String nombre;
	private String apellidos;
	private int edad;
	private double altura;
	
	
	public DatosPersonales(int codPersona, String nombre, String apellidos, int edad, double altura) {
		super();
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
	}
	
	
	public int getCodPersona() {
		return codPersona;
	}
	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
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
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Datos Personales [Código persona: " + codPersona + " - Nombre: " + nombre + " - Apellidos: " + apellidos
				+ " - Edad: " + edad + " años - Altura: " + altura + "m]";
	}


	
	//MÉTODOS----------------------------------------------------------------------------------------------------------------------------


	@Override
	public int compareTo(DatosPersonales dp) {
		// TODO Auto-generated method stub
		
		if (this.codPersona<dp.getCodPersona()) {
			return -1;
		}else {
			return 1;
		}
	}
}
