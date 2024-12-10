package ejercicio04;

public class Cilindro {

	
	public double calcularVolumenCilindro (double radio, double altura) {
		int dos=2;
		double VolumenCil=0;
		
		VolumenCil=Math.PI*Math.pow(radio, dos)*altura;
		
		return VolumenCil;
	}
	
	
	public void MostrarVol (double VolumenCil) {
		
		System.out.printf("\nEl volumen del cilindro es de %.2f m3.\n\n", VolumenCil);
	}
}
