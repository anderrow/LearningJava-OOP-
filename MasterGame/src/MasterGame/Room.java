package MasterGame;

public class Room {
	//Room size
	public static final int width=10;
	public static final int height=10;
	
	//Doors
	private Position entryDoor;
	private Position exitDoor;
	
	//Collection of objects inside the game 
	private GameObject[] objetcsPlayer	= new GameObject[20];
	private int numObjects=0; //Num of objects in the room
	
	//Copy of the Character
	private Character j;
	
	public Room() {
		
	}
	public boolean isItADoor(Position pos){
		if(pos.isItEqueal(entryDoor) || pos.isItEqueal(exitDoor)) return true;
		else return false;
	}
	
	public boolean isItPlayer(Position pos){
		if(pos.isItEqueal(j.getPos())) return true;
		else return false;
	}
	
	public void setObjetP(GameObject obj) {
		this.objetcsPlayer[this.numObjects]=obj;
		this.numObjects++;
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
	public void setCharacter(Player j) {
		this.j = j;
	}
	

}
