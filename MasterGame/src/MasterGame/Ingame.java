package MasterGame;
import java.util.concurrent.ThreadLocalRandom;

public class Ingame {
	public static final int THROW_DADE = 1; //Final cuz no changes are allowed
	public static final int EXIT_GAME= 0;
	
	public Ingame() {
		// TODO Auto-generated constructor stub
	}
	
	public static void drawRoom(Room h) {
		for(int row=-1;row<Room.height;row++) {
			for(int col=0;col<=Room.width;col++) {
				Position actualPosition=new Position(col, row);
				
				if(h.isItPlayer(actualPosition)) System.out.print("J");
				else if(row==-1 && col!= Room.width) System.out.print(col);
				else if(col==Room.width && row!=-1) System.out.print(row);
				else if(h.isItADoor(actualPosition)) System.out.print(" ");
				else if (col==0 || col==(Room.height - 1)) System.out.print("|"); //Right and Left Walls
				else if (row==0 || row ==(Room.width -1)) System.out.print("="); //Upper and Lower Walls
				else System.out.print(" "); // Map itself
				
				if(col==(Room.width)) System.out.println(); // New line 
			}
		}
	}
	
	public static void drawMenu() {
		System.out.println("---------JAVA GAME---------");
		System.out.println("[1] Launch the dade");
		System.out.println("[0] Exit");
		System.out.println("----------------------------");
	}
	
	public static int throwDade() {
		int dade= ThreadLocalRandom.current().nextInt(1, 7);
		System.out.println("The dade has been thrown ["+dade+"]");
		return dade;
	}

}
