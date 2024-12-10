package ejemplo01;

public class Alumno01 {

	//Atributos
	
	//En las clases que definen a los objetos NO se les da valores iniciales a los atributos.
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	//Constructores
	
	//Para crear un objeto con valores
	
	public Alumno01 (/*Lo que va aquí dentro se llama parámetro*/String nombre, int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
	}
	
	
	
	//Métodos
	
	/*Primer método propio, para imprimir en bonito*/
	
	public void mostrarDatos (String calle) {
		
		//Cuerpo
		
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Calle: "+calle);
		
	}
	
	
	
	
	
	
	
}
