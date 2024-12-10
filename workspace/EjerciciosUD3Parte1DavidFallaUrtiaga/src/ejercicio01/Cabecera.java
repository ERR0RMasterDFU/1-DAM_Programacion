package ejercicio01;

public class Cabecera {

	private String nomAsig;
	private int aula;
	private String fecha;
	
	public Cabecera(String nomAsig, int aula, String fecha) {
		this.nomAsig=nomAsig;
		this.aula=aula;
		this.fecha=fecha;
	}
	
	public void cabeceraExam () {
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("|         IES ANTONIO MACHADO, COMUNIDAD AUTÓNOMA DE SEVILLA            |");
		System.out.println("|                       Prueba de evaluación                            |");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("FECHA: "+fecha+"                  AULA Nº: "+aula);
		System.out.println("MATERIA: "+nomAsig);
		System.out.println("-------------------------------------------------------------------------\n");
	}
	
}
