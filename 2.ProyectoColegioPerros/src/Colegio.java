import java.util.ArrayList;

public class Colegio {

	private ArrayList<Perro> perrosInscritos;
	
	public Colegio(){
		perrosInscritos = new ArrayList<Perro>();
	}
	
	public void agregarPerro(Perro p){
		perrosInscritos.add(p);
	}
	public void agregarPerro(String n, String r, String l, String cc, String nD, String tD, String dA){
		Perro p = new Perro(n, r, l, cc, nD, tD, dA);
		perrosInscritos.add(p);
	}
	public void verInfoPerros(){
		System.out.println(" > LISTADO PERROS MATRICULADOS : ");
		System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
		System.out.println("NOMBRE PERRO  /  RAZA  /  LOCALIDAD  /  CEDULA CONTACTO  /  NOMBRE CONTACTO  /  TELEFONO  /  DIA ASISTENCIA");
		System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
		for (int i = 0; i < perrosInscritos.size(); i++) {
			System.out.println(perrosInscritos.get(i).getNombre()+"  /  "+perrosInscritos.get(i).getRaza()+"  /  "+
								perrosInscritos.get(i).getLocalidad()+"  /  "+perrosInscritos.get(i).getCcDueño()+"  /  "+
								perrosInscritos.get(i).getNombreDueño()+"  /  "+perrosInscritos.get(i).getTelefonoDueño()+"  /  "+
								perrosInscritos.get(i).getDiaAsistencia());
			System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
		}
	}
	public void agruparPorLocalidad(String localidad){
		System.out.println(" > LISTADO PERROS SECTOR : "+localidad);
		System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
		System.out.println("NOMBRE PERRO  /  RAZA  /  LOCALIDAD  /  CEDULA CONTACTO  /  NOMBRE CONTACTO  /  TELEFONO  /  DIA ASISTENCIA");
		System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
		for (int i = 0; i < perrosInscritos.size(); i++) {
			if(perrosInscritos.get(i).getLocalidad().equals(localidad)){
				System.out.println(perrosInscritos.get(i).getNombre()+"  -  "+perrosInscritos.get(i).getRaza()+"  -  "+
						perrosInscritos.get(i).getLocalidad()+"  -  "+perrosInscritos.get(i).getCcDueño()+"  -  "+
						perrosInscritos.get(i).getNombreDueño()+"  -  "+perrosInscritos.get(i).getTelefonoDueño()+"  -  "+
						perrosInscritos.get(i).getDiaAsistencia());
				System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - ");
			}
		}
	}

	public ArrayList<Perro> getPerrosInscritos() {
		return perrosInscritos;
	}
	public void setPerrosInscritos(ArrayList<Perro> perrosInscritos) {
		this.perrosInscritos = perrosInscritos;
	}
}
