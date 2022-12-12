package Simulacro;

public class ejer_4 {

	public static void main(String[] args) {
		int cola[]= {1,2,3,4,5};
		System.out.println(numPares(cola));

	}//main
	public static int numPares(int cola[]) {
		int r=0;
		for(int x=0; x< cola.length;x++) {
			if(cola[x]%2==0) {
				r++;
			}//if
		}//for
		return r;
	}//numpares

}//class
