package ejemplouno;

	public class Alumno {
		
		/* Constructor */
		protected String nombre;
		protected int edad;
		protected String apellido;
		public Alumno(String a, int b){
			nombre = a;
			edad = b;
			
}
		public int getEdad() {
			return edad;
		}
public String getNombre() {
	return nombre;
	}
}