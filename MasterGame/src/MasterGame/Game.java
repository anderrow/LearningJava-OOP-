package MasterGame;
import java.util.Scanner;
//Main PROGRAM


public class Game {

	public static void main(String[] args) {
		int gameAction= -1; //Init gameAction variable
		
		Scanner in = new Scanner(System.in); //Init the scanner
		
		//Set the position of the Entrance and Exit door
		Position doorEntryPos = new Position(0,3);		
		Position doorExitPos = new Position(5, Room.height - 1);
		
		GameObject doorEntry = new GameObject(); //Init
		GameObject doorExit = new GameObject(); //Init
		
		doorEntry.setPos(doorEntryPos); //Set Door Position
		doorExit.setPos(doorExitPos);
		doorEntry.setLetterMap(' '); //Set the letter that represents a door
		doorExit.setLetterMap(' ');
		
		
		//Generate the character and keep it in the room
		Player player = new Player();	
		player.setPos(doorEntryPos);
		player.setLetterMap('P');
		
		//Generate a Room
		Room mainRoom = new Room();
		mainRoom.setObjetP(player);
		mainRoom.setObjetP(doorEntry);
		mainRoom.setObjetP(doorExit);
		
		
		//**//
		//
		//---------OLD CODE: Now we use Object for everything insteand of Character, entry door, exit door...
		//--------- this makes the code much more flexible.
		//mainRoom.setCharacter(player);
		//mainRoom.setEntryDoor(doorEntryPos);
		//mainRoom.setExitDoor(doorExitPos);
		//
		//
		//**//
		
		while(gameAction != Ingame.EXIT_GAME) {
			//Draw the room and the menu
			Ingame.drawRoom(mainRoom);
			Ingame.drawMenu();	
						
			gameAction= in.nextInt();//Ask to the user what it wants to do
			
			switch(gameAction) {
				case Ingame.THROW_DADE :
					int numMov = Ingame.throwDade();
					System.out.println("How much columns do you wanna move? You have "+numMov+" movements");
					int numCol = in.nextInt();
					player.movX(numCol);
					numMov -= numCol;
					System.out.println("How much rows do you wanna move? You have "+numMov+" movements");
					int numRow= in.nextInt();
					player.movY(numRow);
					numMov -= numRow;
					break; //Garbage erase temp variables
			}
			
		}
		
	}

}
