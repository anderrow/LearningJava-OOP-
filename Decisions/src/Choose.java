public class Choose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=30;i+=2) {
			System.out.print(i+" +2, ");
		}
		
		System.out.println();
		
		for(int age=10;age<=30;age+=2){
			if(age>18) {
				System.out.println("It has more than 18 years");
			}
			else if(age>=16){
				System.out.println("It has more or equal than 16 years");
			}
			else {
				System.out.println("It's younger than 16 years old");
			}
		}
	}}
