package Simulacro;

public class ejer_2 {

	public static void main(String[] args) {
		System.out.println(enRango (8,1,7));

	}//main
	public static boolean enRango (int num, int rango1, int rango2) {
		boolean r=false;
		if(num >= rango1 && num<=rango2) {
			r=true;
		}//if
		else {
			if (num<= rango1 && num>= rango2) {
				r=true;
			}//if
		}//else
		return r;
	}//int
}//class
