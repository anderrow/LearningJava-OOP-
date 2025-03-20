package MasterGame;

public class Ingame {

	public Ingame() {
		// TODO Auto-generated constructor stub
	}
	
	public static void drawRoom(Room h) {
		for(int row=0;row<Room.width;row++) {
			for(int col=0;col<Room.height;col++) {
				Position actualPosition=new Position(col, row);
				
				if(h.isItADoor(actualPosition)) System.out.print(" ");
				else if (col==0 || col==(Room.height - 1)) System.out.print("|"); //Right and Left Walls
				else if (row==0 || row ==(Room.width -1)) System.out.print("="); //Upper and Lower Walls
				else System.out.print(" "); // Map itself
				
				if(col==(Room.width-1)) System.out.println(); // New line 
			}
		}
	}

}
