package ejemploJavadoc;

/**Realiza las operaciones de la calculadora.
 * @author David Falla Urtiaga
 * @version 1.0
 * @since 1.0
 */

public class Operaciones {

	//MÉTODOS
	
	/**
	 * Sumar dos números.
	 * @param num1
	 * @param num2
	 * @return La suma de ambos números.
	 */
	public double sumar (double num1, double num2) {
		
		return num1+num2;
	}
	
	/**
	 * Resta dos números.
	 * @param num1
	 * @param num2
	 * @return La resta de ambos números.
	 */
	public double restar (double num1, double num2) {
		
		return num1-num2;
	}

	/**
	 * Multiplica dos números.
	 * @param num1
	 * @param num2
	 * @return La multiplicación de ambos números.
	 */
	public double multiplicar (double num1, double num2) {
	
		return num1*num2;
	}

	/**
	 * Divide dos números.
	 * @param num1
	 * @param num2
	 * @return La división de ambos números.
	 */
	public double dividir (double num1, double num2) {
	
		return num1/num2;
	}
	
	/**
	 * Comprobar que no se divide entre cero.
	 * @param num2
	 */
	public void comprobarDivision (double num2) {
		
		int cero=0;
		
		if(num2==cero) {
			System.out.println("\n¡No se puede dividir un número entre cero!\n");
		}
		
	}
	
	
}
