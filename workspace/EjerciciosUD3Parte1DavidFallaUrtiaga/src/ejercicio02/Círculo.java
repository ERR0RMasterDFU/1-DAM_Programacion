package ejercicio02;

public class Círculo {

	private double radio;
	
	public Círculo(double radio) {
		this.radio=radio;
	}
	
	public double calcularAreaCm2() {
		int dos=2;
		double areaCm;
		
		areaCm= Math.PI*Math.pow(radio, dos);
		return areaCm;
	}
		
	public double calcularAreaM2() {
		int dos=2, cien=100;
		double areaM;
			
		areaM= (Math.PI*Math.pow(radio, dos))/cien;
		return areaM;
	}
	
	public void mostrarDatos(double areaCm, double areaM) {
	System.out.printf("\nEl área del círculo sería de %.2f cm2 y %.2f m2.\n\n", areaCm, areaM);
	}
}
