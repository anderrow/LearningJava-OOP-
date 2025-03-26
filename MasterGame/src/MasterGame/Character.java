package MasterGame;

public class Character extends GameObject {
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	
	public void movX(int X) {
		Position pos = super.getPos(); //Pos is refered to the super pos
		pos.setPosX(pos.getPosX()+X); 
		//super.setPos(pos);  //It's not needed cuz pos is already refered to super pos, it's not and independent variable, is like a pointer
	}
	
	public void movY(int Y) {
		Position pos = super.getPos();
		pos.setPosY(pos.getPosY()+Y);
		//super.setPos(pos);
	}
	

}
