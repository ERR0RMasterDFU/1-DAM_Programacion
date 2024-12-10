package ejercicio03;

public class Movil {

	/*3. Vamos a intentar modelar a un vendedor "callejero" móviles. Los atributos de la clase Móvil serán, como 
	mínimo, marca, modelo, vendido o no, nuevo o de segunda mano y precio unitario. En la clase Vendedor 
	tendremos como características un array de Móviles y total vendido (se pueden añadir más atributos si se 
	quiere o precisa). Se deben crear métodos que hagan las siguientes operaciones:
	
	- Comprobar cuántos móviles le quedan sin vender.
	
	- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano. 
	
	- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. 
	
	- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
	
	Escribir también una clase de prueba para hacer todas las operaciones.*/
	
	
	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private boolean disponible;
	private boolean estado;
	private double precioUnitario;
	
	
	//CONSTRUCTORES
	
	public Movil(String marca, String modelo, boolean disponible, boolean estado, double precioUnitario) {
		this.marca = marca;
		this.modelo = modelo;
		this.disponible = disponible;
		this.estado = estado;
		this.precioUnitario = precioUnitario;
	}

	
	//GETTERS & SETTERS
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	//TO STRING
	
	@Override
	public String toString() {
		return "Vendedor [marca=" + marca + ", modelo=" + modelo + ", disponible=" + disponible + ", estado=" + estado
				+ ", precioUnitario=" + precioUnitario + "]";
	}
	
	
	
	
	
	
	
	
	
}
