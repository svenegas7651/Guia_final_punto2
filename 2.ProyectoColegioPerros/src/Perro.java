
public class Perro {

	private String nombre;
	private String raza;
	private String localidad;
	private String ccDue�o;
	private String nombreDue�o;
	private String telefonoDue�o;
	private String diaAsistencia;
	
	public Perro(String n, String r, String l, String cc, String nD, String tD, String dA){
		this.nombre = n;
		this.raza= r;
		this.localidad = l;
		this.ccDue�o = cc;
		this.nombreDue�o = nD;
		this.telefonoDue�o = tD;
		this.diaAsistencia= dA;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCcDue�o() {
		return ccDue�o;
	}
	public void setCcDue�o(String ccDue�o) {
		this.ccDue�o = ccDue�o;
	}
	public String getNombreDue�o() {
		return nombreDue�o;
	}
	public void setNombreDue�o(String nombreDue�o) {
		this.nombreDue�o = nombreDue�o;
	}
	public String getTelefonoDue�o() {
		return telefonoDue�o;
	}
	public void setTelefonoDue�o(String telefonoDue�o) {
		this.telefonoDue�o = telefonoDue�o;
	}
	public String getDiaAsistencia() {
		return diaAsistencia;
	}
	public void setDiaAsistencia(String diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
}
