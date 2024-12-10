package ejemplo02;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		this.nombre=nombre;
		this.notaPro=notaPro;
		this.notaBD=notaBD;
	}
	
	public double calcularMedia () {
		double suma, media;
		double dos=2;
		suma= notaPro+notaBD;
		media= suma/dos;
		return media;	//SOLO SE PONE RETURN CUANDO PUBLIC NO ES VOID (VACÍO)
	}
	
	public void mostrarMedia (double media) {
		System.out.printf("\nLa nota media de "+nombre+" es: %.2f.", media);
	}
	
	
}
