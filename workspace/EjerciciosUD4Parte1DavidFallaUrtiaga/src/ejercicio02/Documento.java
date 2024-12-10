package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	private String direccionEmpresa;
	private String numeroTelefono;
	private String correo;
	
	
	public Documento(String nombreEmpresa, String direccionEmpresa, String numeroTelefono, String correo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.numeroTelefono = numeroTelefono;
		this.correo = correo;
	}
	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", direccionEmpresa=" + direccionEmpresa
				+ ", numeroTelefono=" + numeroTelefono + ", correo=" + correo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
