package ejercicio01;

public class Producto {

	/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta 
	clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje 
	pasado como parámetro que será el coste en el transporte.
	En una clase Tienda, con un array de productos como atributo se podrá: 
	
	- Listar datos de todos los productos.
	
	- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
	
	- Añadir un producto a la lista pasando como parámetro un producto. 
	
	- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los 
	precios de fábrica.
	
	- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio 
	de fábrica
	
	- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los 
	precios de venta al público menos la suma de todos los precios de fábrica.
	
	Crear un main de prueba con un menú donde se pueda hacer todo esto.*/
	
	
	//ATRIBUTOS----------------------------------------------------------------------------------
	
	private double precioFabrica;
	private String nombre;
	private double precioVentaPublico;
	private boolean fragilidad;
	private double codigo;
	
	
	//CONSTRUCTORES------------------------------------------------------------------------------
	
	public Producto(double precioFabrica, String nombre, double precioVentaPublico, boolean fragilidad, double codigo) {
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.precioVentaPublico = precioVentaPublico;
		this.fragilidad = fragilidad;
		this.codigo = codigo;
	}
	
	
	//GETTERS & SETTERS--------------------------------------------------------------------------
	
	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioVentaPublico() {
		return precioVentaPublico;
	}

	public void setPrecioVentaPublico(double precioVentaPublico) {
		this.precioVentaPublico = precioVentaPublico;
	}


	public boolean isFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(boolean fragilidad) {
		this.fragilidad = fragilidad;
	}


	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	
	
	//TO STRING----------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", nombre=" + nombre + ", precioVentaPublico="
				+ precioVentaPublico + ", fragilidad=" + fragilidad + ", codigo=" + codigo + "]";
	}
	
	
	//MÉTODOS------------------------------------------------------------------------------------
	
	public double calcularPrecioCoste(double costeTransporte) {
		
		int cien=100;
		return (costeTransporte/cien)+precioFabrica;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
