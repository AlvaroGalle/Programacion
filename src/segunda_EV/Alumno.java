package segunda_EV;

public class Alumno {
	private String nombre;
	private String apellido;
	public void setNombre(String nom) {
		this.nombre=nom;
	}//setNombre
	public void setApellido(String apell) {
		this.apellido=apell;
	}//setApellido
	public String getNombre() {
		return nombre;
	}//getNombre
	public String getApellido() {
		return apellido;
	}//getApellido

	 public String toString() {
		 return nombre +" "+ apellido;
	 }//toString
}// class
