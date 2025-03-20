package MasterGame;

public class Position {

	private int posX;
	private int poxY;
	
	public Position() {
		this.posX=0;
		this.poxY=0;
	}
	
	public Position(int posx, int posy) {
		this.posX=posx;
		this.poxY=posy;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPoxY() {
		return poxY;
	}

	public void setPoxY(int poxY) {
		this.poxY = poxY;
	}

}
