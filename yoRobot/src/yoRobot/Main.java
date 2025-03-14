package yoRobot;

public class Main {

	public static void main(String[] args) {
		
		Robot r=new Robot();
		Robot patata=new Robot();
		
		r.setPeso(-12.3121f);
		patata.setPeso(10.254f);
		
		
		System.out.println(r.getPeso());
		System.out.println(patata.getPeso());
	}

}
