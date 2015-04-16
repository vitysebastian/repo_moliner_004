package ejemplouno;

	public class Alumno {
		
		/* Constructor */
		protected String nombre;
		protected int edad;
		protected String apellido;
		
		//este es el constructor con nombre y edad
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