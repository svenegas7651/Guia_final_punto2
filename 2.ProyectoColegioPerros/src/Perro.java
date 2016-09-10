
public class Perro {

	private String nombre;
	private String raza;
	private String localidad;
	private String ccDueño;
	private String nombreDueño;
	private String telefonoDueño;
	private String diaAsistencia;
	
	public Perro(String n, String r, String l, String cc, String nD, String tD, String dA){
		this.nombre = n;
		this.raza= r;
		this.localidad = l;
		this.ccDueño = cc;
		this.nombreDueño = nD;
		this.telefonoDueño = tD;
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
	public String getCcDueño() {
		return ccDueño;
	}
	public void setCcDueño(String ccDueño) {
		this.ccDueño = ccDueño;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	public String getTelefonoDueño() {
		return telefonoDueño;
	}
	public void setTelefonoDueño(String telefonoDueño) {
		this.telefonoDueño = telefonoDueño;
	}
	public String getDiaAsistencia() {
		return diaAsistencia;
	}
	public void setDiaAsistencia(String diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
}
