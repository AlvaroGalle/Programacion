package Simulacro;
import java.util.Scanner;
public class ejer_3 {

	public static void main(String[] args) {
	int ancho;
	System.out.println("Dame la anchura");
	Scanner sc= new Scanner(System.in);
	ancho= sc.nextInt();
	for( int contador=0; contador<ancho;contador++) {
		for (int espacio=0; espacio<contador; espacio++) {
			System.out.print(" ");
		}//for_espacios
	System.out.print("*");
	System.out.println();
	}//for_contador
	for( int contador=ancho; contador>=0;contador--) {
		for (int espacio=0; espacio<contador; espacio++) {
			System.out.print(" ");
		}//for_espacios_2
	System.out.print("*");
	System.out.println();
	}//for_contador_2
	sc.close();
	}//main

}//class
