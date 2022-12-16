package segunda_EV;

public class Atleta {
private String dni="";
private String nombre="";
private int year;
private float altura;
private float peso;
private boolean estudios;
public enum genero{M, F, X}
///////////////////////////////////////////////////////////
public Atleta() {
	
}//constructor
///////////////////////////////////////////////////////////
/*char unodni= dni.charAt(5);
char dosdni= dni.charAt(6);
char tresdni= dni.charAt(7);
char letradni= dni.charAt(8);*/
////////////////////////////////////////////////////////////
 public void setNombre(String newnombre) {
	 this.nombre=newnombre;
 }//setNombre
 
 public void setDNI(String newdni) {
	 this.dni=newdni;
 }//setDNI
 
 public void setYear(int newYear) {
	 this.year=newYear;
 }//setAño
 
 public void setAltura(float newaltura) {
	 this.altura=newaltura;
 }//setaltura
 
 public void setPeso(float newpeso) {
	 this.peso=newpeso;
 }//setPeso
 public void setEstudios(boolean newestudio) {
	 this.estudios=newestudio;
 }//setEstudios
@Override
public String toString() {
	return nombre + "******" +/*tresdni+dosdni+unodni+letradni +*/dni+ " " +year +" "+ altura+ "cm "+peso+ "kg "+"estudiante: "+ estudios ;
}
}//class
