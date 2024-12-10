package ejercicio07;

import java.util.Random;

public class CaraCruz {

	/*7. Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
	• Método que simule el lanzamiento de la moneda y resultado. 
	• Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará 
	el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
	• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y 
	si no, debe mostrar "Siga jugando".
	• En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/
	
	public boolean lanzar () {
		Random rnd=new Random(System.nanoTime());
		int desde=1, hasta=2, num=0;
		num=rnd.nextInt(hasta-desde+1)+desde;
		
		if(num==1) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	
	public void ComprobarGanador(lanzar()) {
		
		
	}
}
	
		
