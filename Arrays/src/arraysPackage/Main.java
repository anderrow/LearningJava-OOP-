package arraysPackage;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Array definitions
		String nombres[]= {"Paco", "Lucía", "Marcos", "Sandra", "Nate", ""};
		float calificaciones[]= new float[10];
		String apellidos[]=new String[20];
		
		
		Scanner sc = new Scanner(System.in); //Enable Scanner
		System.out.println("Introduce a new name?"); //Ask to the user
		String nombreFinal=sc.nextLine(); //Answer of the user
		
		nombres[nombres.length-1]=nombreFinal;
		
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
		}
	}

}
