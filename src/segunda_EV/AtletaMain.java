package segunda_EV;
import java.util.Scanner;
public class AtletaMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantos atletas quieres inscribir");
		int num_atl=sc.nextInt();
		Atleta atl[]=new Atleta[num_atl];
		sc.nextLine();
		for(int x=0; x<num_atl; x++) {
			atl[x]=new Atleta();
			System.out.println("Nombre del atlela");
			String nom=sc.nextLine();
			atl[x].setNombre(nom);
			System.out.println("DNI del atlela");
			String dni=sc.nextLine();
			atl[x].setDNI(dni);
			/*sc.nextInt();*/
			System.out.println("Año de nacimiento");
			int year=sc.nextInt();
			atl[x].setYear(year);
			//sc.nextFloat();
			System.out.println("Altura (en metros)");
			float altura=sc.nextFloat();
			atl[x].setAltura(altura);
			//sc.nextInt();
			System.out.println("Peso (en Kg)");
			float peso=sc.nextFloat();
			atl[x].setPeso(peso);
			char estudia=' ';
			while (estudia !='s' || estudia !='n') {
				System.out.println("¿Estudia? (s/n)");
				estudia= sc.next().charAt(0);
			}//while
			if (estudia=='s') {
				boolean est= true;
				atl[x].setEstudios(est);
			}//if
			else {
				boolean est= false;
				atl[x].setEstudios(est);
			}//else
			
		}//for
		System.out.println(atl[0].toString());
		sc.close();
	}//main

}//class
