package ejemplouno;

import ejemplouno.Lista;
public class GestionarAlumnos {
	
public static void main(String[] args) {
	

	/* Crea una lista de alumnos */
	Lista listaDAW;
	listaDAW = new Lista(3);
	/* Creo dos alumnos */
	Alumno alumno1;
	Alumno alumno2;
	alumno1 = new Alumno("Pedro", 19);
	alumno2 = new Alumno("Mar�a", 18);
	/* A�adimos los alumnos a la lista */
	listaDAW.a�adirAlumno(alumno1);
	listaDAW.a�adirAlumno(alumno2);
	/* Obtenemos los valores de los atributos de listaDAW */
	Alumno[] miLista;
	miLista = listaDAW.getListaAlumno();
	int numero;
	numero = listaDAW.getNumeroAlumnos();
	/* Mostramos los alumnos que hay en la lista */
	// mostrarAlumnos(miLista, numero);
	mostrarAlumnos(miLista, numero);
	/* Borramos a Pedro de la lista */
	listaDAW.borrarAlumno("Pedro");
	miLista = listaDAW.getListaAlumno();
	numero = listaDAW.getNumeroAlumnos();
	for (int i = 0; i < numero; i++) {
		System.out.println(miLista[i].getNombre() + " " +
				miLista[i].getEdad());
	}
}
private static void mostrarAlumnos(Alumno[] miLista, int numero) {
	for (int i = 0; i < numero; i++) {
		System.out.println(miLista[i].getNombre() + " " +
				miLista[i].getEdad());
	}
	}
}