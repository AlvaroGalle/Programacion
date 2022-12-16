package Simulacro;

public class ejer_1 {

	public static void main(String[] args) {
	System.out.println(PegaNVeces("*","#",10));
	
	}//main
	
	
	//CAMBIOS   ENTORNOSSSS
	public static String PegaNVeces(String asterisco,String hastag, int max) {
		String r="";
		for (int contador=0; contador<max; contador++) {
			r= r + "*" + "#";
		}//for
		return r;
	}//String
}//class
