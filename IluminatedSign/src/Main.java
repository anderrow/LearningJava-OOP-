
public class Main {

	public static void main(String[] args) {
		int width=5;
		int height=7;
		
		// Letter L
		
		for (int row=1;row<=height;row++) {
			for (int column=1;column<=width;column++) {
				if(column==1 || row==7) System.out.print("*");
			}
			System.out.println();
		}
		
		//Letter E
		
		for (int row=1;row<=height;row++) {
			for (int column=1;column<=width;column++) {
				if(column==1) System.out.print("*");
				else if(row==1 || row==height) System.out.print("*");
				else if((row==(height/2)+1) && (column<width)) System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
