package DrHouse;
import java.util.Scanner;

public class Main {
	
	public static String question(String p) {
		//Start out the questions of DrHouse
		Scanner sc =new Scanner(System.in);
		//Question
		System.out.println(p);
		//answer
		String answer=sc.nextLine();
		
		return answer;
	}
	
	public static void triaje(String nombre) {
		String answer="";
		System.out.println("Hey "+ nombre + "!");
		
		while(!answer.equals("Y")&&!answer.equals("N")) {
			answer=question("Did you fall lately?");
		}
		System.out.println(answer);
		
		while(!answer.equals("Y")&&!answer.equals("N")) {
			answer=question("Do you have a fever?");
		}
		
		while(!answer.equals("Y")&&!answer.equals("N")) {
			answer=question("Do you a pain in the chest?");
		}
		
		System.out.println(answer);
		
	}

	public static void main(String[] args) {
		
		triaje("ander");
		

	}

}
