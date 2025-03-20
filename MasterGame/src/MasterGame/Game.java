package MasterGame;
//Main PROGRAM


public class Game {

	public static void main(String[] args) {
		//Generate a Room
		Room mainRoom = new Room();
		
		//Set the position of the Entrance and Exit door
		Position doorEntry = new Position(0,3);
		mainRoom.setEntryDoor(doorEntry);
		Position doorExit = new Position(5, Room.height - 1);
		mainRoom.setExitDoor(doorExit);
		
		//Generate the character and keep it in the room
		Character player = new Character();	
		mainRoom.setCharacter(player);
		//Draw the room
		Ingame.drawRoom(mainRoom);
	
	}

}
