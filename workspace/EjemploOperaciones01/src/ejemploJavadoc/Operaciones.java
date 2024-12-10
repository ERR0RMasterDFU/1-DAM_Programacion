package ejemploJavadoc;


public class Operaciones {

	//MÉTODOS
	
	
	public double sumar (double num1, double num2) {
		
		return num1+num2;
	}
	
	
	public double restar (double num1, double num2) {
		
		return num1-num2;
	}


	public double multiplicar (double num1, double num2) {
	
		return num1*num2;
	}

	
	public double dividir (double num1, double num2) {
	
		return num1/num2;
	}
	
	
	public void comprobarDivision (double num2) {
		
		int cero=0;
		
		if(num2==cero) {
			System.out.println("\n¡No se puede dividir un número entre cero!\n");
		}
		
	}
	
	
}
