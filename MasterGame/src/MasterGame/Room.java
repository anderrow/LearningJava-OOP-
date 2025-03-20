package MasterGame;

public class Room {
	//Room size
	public static final int width=10;
	public static final int height=10;
	
	//Doors
	private Position entryDoor;
	private Position exitDoor;
	
	//Copy of the Character
	private Character j;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public boolean isItADoor(Position pos){
		if(pos.isItEqueal(entryDoor) || pos.isItEqueal(exitDoor)) return true;
		else return false;
	}
	
	public Position getEntryDoor() {
		return entryDoor;
	}
	public void setEntryDoor(Position entryDoor) {
		this.entryDoor = entryDoor;
	}
	public Position getExitDoor() {
		return exitDoor;
	}
	public void setExitDoor(Position exitDoor) {
		this.exitDoor = exitDoor;
	}
	public void setCharacter(Character j) {
		this.j = j;
	}
}
