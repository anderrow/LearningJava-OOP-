package MasterGame;

public class Position {

	private int posX;
	private int posY;
	
	public Position() {
		this.posX=0;
		this.posY=0;
	}
	
	public Position(int posx, int posy) {
		this.posX=posx;
		this.posY=posy;
	}
	
	public boolean isItEqueal(Position p) {
		if(p.posX==this.posX && p.posY==this.posY) return true;
		else return false;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
