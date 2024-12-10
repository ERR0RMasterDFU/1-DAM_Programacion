package ejercicio03SET;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private double nota1;
	private double nota2;
	private double nota3;
	
	
	public Alumno(String nombre, String apellidos, int edad, double nota1, double nota2, double nota3) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
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

	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}


	@Override
	public String toString() {
		return "Alumno [Nombre:" + nombre + " - Apellidos=" + apellidos + " - Edad=" + edad + " - Nota 1=" + nota1
				+ " - nota 2=" + nota2 + " - Nota 3=" + nota3 + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre, nota1, nota2, nota3);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3);
	}
	
}
