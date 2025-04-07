package MasterGame;

public class GameObject {
	//Properties
	private String name="";
	private Position pos;
	private char letterMap;
		
	public GameObject() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public char getLetterMap() {
		return letterMap;
	}

	public void setLetterMap(char letterMap) {
		this.letterMap = letterMap;
	}

}
