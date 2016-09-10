import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		Colegio colegioPerros = new Colegio();
		inscribirPerros(colegioPerros);
		System.out.println("---------------------------------------");
		System.out.println(">>> BIENVENIDO AL COLEGIO DE PERROS <<<");
		System.out.println("---------------------------------------");
		menu(colegioPerros);
	}

	public static void inscribirPerros(Colegio c){
		Perro p = new Perro("Asterix", 			"BullDog", 				"Teusaquillo", 	"23.456.765",		"Andrea Martinez", 		"(300)4506789",	"Lunes");
		c.agregarPerro(p);
		p = new Perro("Barney", 				"Akita", 				"Usaquén", 		"74.232.456", 		"Leydi Castellanos",	"(311)6543322", "Lunes");
		c.agregarPerro(p);
		p = new Perro("Dakota", 				"Rootweiler", 			"Suba", 		"1.018.440.484", 	"Rubén Gallego", 		"(305)2231211", "Martes");
		c.agregarPerro(p);
		p = new Perro("Anelka", 				"Boxer", 				"Chapinero", 	"12.345.431", 		"Lucho Ruiz", 			"(310)4226788", "Viernes");
		c.agregarPerro(p);
		p = new Perro("Atila", 					"Galgo", 				"Teusaquillo", 	"4.128.970", 		"Milena Alvarez", 		"(300)2387751", "Lunes");
		c.agregarPerro(p);
		p = new Perro("Negra Tomasa", 			"Criollo", 				"Chapinero", 	"27.689.564", 		"Jorge Granados", 		"(300)8097677", "Martes");
		c.agregarPerro(p);
		p = new Perro("Dara", 					"Chihuahua", 			"Teusaquillo", 	"10.507.893", 		"Pablo Gomez", 			"(322)3706551", "Lunes");
		c.agregarPerro(p);
		p = new Perro("Bob", 					"Criollo", 				"Suba", 		"34.245.654", 		"Fernando Roa", 		"(300)5525187", "Viernes");
		c.agregarPerro(p);
		p = new Perro("Dexter", 				"Beagle", 				"Chapinero", 	"12.908.768", 		"Laura Espitia", 		"(313)2546509", "Viernes");
		c.agregarPerro(p);
		p = new Perro("Axel", 					"Pastor Alemán", 		"Chapinero", 	"1.020.435.441", 	"Bruno Alvarez", 		"(302)5442111", "Jueves");
		c.agregarPerro(p);
		p = new Perro("Wallas", 				"Mastín Napolitano", 	"Chapinero", 	"78.961.112", 		"Lorena Mejía", 		"(350)3325676", "Jueves");
		c.agregarPerro(p);
		p = new Perro("Benyi", 					"Shar Pei", 			"Suba", 		"1.087.432.122", 	"Dago Castro", 			"(310)3442390", "Miércoles");
		c.agregarPerro(p);
		p = new Perro("Puchis", 				"Maltés", 				"Teusaquillo", 	"75.678.433", 		"Ana Carvajal", 		"(322)7886612", "Jueves");
		c.agregarPerro(p);
		p = new Perro("Trementina", 			"Schnauzer", 			"Usaquén", 		"12.908.790", 		"Sofia Chica", 			"(312)8595469", "Viernes");
		c.agregarPerro(p);
		p = new Perro("Dumbo", 					"Papillón", 			"Usaquén", 		"5.789.670", 		"Gloria Araújo", 		"(310)8232271", "Miércoles");
		c.agregarPerro(p);
		System.out.println("DataBase OK! : 15 Registros.");
	}
	public static void menu(Colegio c){
		Scanner s = new Scanner(System.in);
		String opcion = "", localidad = "";
		System.out.println("***********************************************");
		System.out.println("¿Que desea hacer? Escoja una opción...");
		System.out.println("1 >> Matricular Perro");
		System.out.println("2 >> Ver información de Perros MATRICULADOS");
		System.out.println("3 >> Ver información de Perros POR LOCALIDAD");
		System.out.println("X >> SALIR");
		System.out.println("***********************************************");
		opcion = s.next();
		if(opcion.equals("1")){
			formularioMatriculaPerro(c);
			menu(c);
		}else if(opcion.equals("2")){
			c.verInfoPerros();
			menu(c);
		}else if(opcion.equals("3")){
			localidad = menuLocalidades(c);
			c.agruparPorLocalidad(localidad);
			menu(c);
		}else if(!opcion.equals("X")){
			System.out.println("Opción Inválida!!");
			menu(c);
		}else{
			System.out.println("FIN DEL PROGRAMA.");
		}
	}
	public static String menuLocalidades(Colegio c) {
		Scanner s = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Escoja una LOCALIDAD...");
		System.out.println("1 >> Teusaquillo");
		System.out.println("2 >> Suba");
		System.out.println("3 >> Usaquén");
		System.out.println("4 >> Chapinero");
		opcion = s.nextInt();
		if(opcion == 1){
			return "Teusaquillo";
		}else if(opcion == 2){
			return "Suba";
		}else if(opcion == 3){
			return "Usaquén";
		}else if(opcion == 4){
			return "Chapinero";
		}else{
			System.out.println("Opción Inválida!!!");
			menuLocalidades(c);
		}
		return null;
	}
	public static void formularioMatriculaPerro(Colegio c) {
		Scanner s = new Scanner(System.in);
		String n, r, l, cc, nD, tD, dA;
		System.out.print("Ingrese el NOMBRE del Perro :");
		n = s.nextLine();
		System.out.print("Ingrese la RAZA del Perro :");
		r = s.nextLine();
		System.out.print("Ingrese la LOCALIDAD donde reside el Perro :");
		l = menuLocalidades(c);
		System.out.print("Ingrese la CÉDULA del DUEÑO del Perro:");
		cc = s.nextLine();
		System.out.print("Ingrese el NOMBRE del DUEÑO del Perro :");
		nD = s.nextLine();
		System.out.print("Ingrese el TELEFONO del DUEÑO del Perro :");
		tD = s.nextLine();
		System.out.print("Ingrese el DIA de ASISTENCIA del Perro :");
		dA = s.nextLine();
		if(n.equals("") || r.equals("") || l.equals("") || cc.equals("")
				|| nD.equals("") || tD.equals("") || dA.equals("")){
			System.out.println("DATOS INVÁLIDOS!!!");
			formularioMatriculaPerro(c);
		}else{
			c.agregarPerro(n, r, l, cc, nD, tD, dA);
			System.out.println("     > PERRO MATRICULADO!");
		}
	}
}
