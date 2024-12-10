package ejercicio02;

public interface IImpuesto {

	public abstract double calcularIva (double precio, int iva);
	
	public abstract double calcularIrpf (double sueldo);

}
