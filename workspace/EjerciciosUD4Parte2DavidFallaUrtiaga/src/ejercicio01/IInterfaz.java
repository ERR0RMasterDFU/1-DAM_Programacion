package ejercicio01;

public interface IInterfaz {

	//a) cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están prestados.

	/*b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve cuántas 
	publicaciones tienen fecha anterior al año recibido por parámetro.*/

	
	public abstract int cuentaPrestados(Publicacion [] lista);
	
	public abstract int publicacionesAnterioresA(Publicacion [] lista, int anio);
	
}
