package MasterGame;

public class Hadron extends Character {

	private boolean visible = true;
	
	public Hadron() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean switchVisibility() {
		if(this.visible) this.visible=false;
		else this.visible=true;
		
		return this.visible;
	}
}
