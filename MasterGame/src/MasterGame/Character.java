package MasterGame;

public class Character {
	private String name;
	private Position pos;

	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPos() {
		return this.pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public void movX(int X) {
		this.pos.setPosX(this.pos.getPosX()+X);
	}
	
	public void movY(int Y) {
		this.pos.setPosY(this.pos.getPosY()+Y);
	}
	

}
