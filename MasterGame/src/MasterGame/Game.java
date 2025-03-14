package MasterGame;

public class Game {

	public static void main(String[] args) {
		Position posInicial=new Position();
		posInicial.setPosX(3);
		posInicial.setPoxY(0);
		
		
		//Generate the first two objects
		Room room1 = new Room();
		Character player = new Character();
		
		player.setPos(posInicial);
	}

}
