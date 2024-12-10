package ejercicio03;

public class Operaciones {
		
		
	public boolean ComprobarPosNeg (int num) {
		
		if(num>=0) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void MostrarPosNeg(boolean ComprobarPosNeg) {
		
		if (num==true) {
			System.out.println("\nEl número introducido es POSITIVO.");
		}else {
			System.out.println("\nEl número introducido es NEGATIVO.");
		}
	}
	
	public void mostrarParImpar (int num) {
		
		if(num%2==0) {
			System.out.println("El número introducido es PAR.\n");
			
		}else {
			System.out.println("El número introducido es IMPAR.\n");
		}
		
	}
		
		
		
		
		
		
		
	

}

