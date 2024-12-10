package excepciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10, den=0;
		double res;
		
		
		
		try {
			
			res = num / den;
			System.out.println("El resultado de la división es: "+res);
			
		}catch (Exception e) {
			
			System.err.println("¡¿ESTÁS INTENTANDO DESTRUIR EL UNIVERSO, O QUÉ?!");
			
		}
		
	}

}
