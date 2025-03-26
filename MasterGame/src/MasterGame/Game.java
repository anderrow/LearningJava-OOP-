package MasterGame;
import java.util.Scanner;
//Main PROGRAM


public class Game {

	public static void main(String[] args) {
		int gameAction= -1;
		
		Scanner in = new Scanner(System.in);
		
		//Generate a Room
		Room mainRoom = new Room();
		
		//Set the position of the Entrance and Exit door
		Position doorEntry = new Position(0,3);
		mainRoom.setEntryDoor(doorEntry);
		Position doorExit = new Position(5, Room.height - 1);
		mainRoom.setExitDoor(doorExit);
		
		//Generate the character and keep it in the room
		Player player = new Player();	
		Position playerStarts = new Position(0,3);
		player.setPos(playerStarts);
		mainRoom.setCharacter(player);
		
		while(gameAction != Ingame.EXIT_GAME) {
			//Draw the room and the menu
			Ingame.drawRoom(mainRoom);
			Ingame.drawMenu();	
			
			//Ask to the user what it wanna do
			gameAction= in.nextInt();
			
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
