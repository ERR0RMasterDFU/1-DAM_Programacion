package ejemploSobrecarga;

public class Operaciones {

	public double sumar (double a, double b) {
		return a+b;
	}
		
	public void sumar (double a, int b) {
		System.out.println(a+b);
	}
	
	public void sumar (int a, double b) {
		System.out.println(a+b);
	}
	
}
