
public class Execute {
	
	public static void main (String[] args){
		
		theMenu window = new theMenu();
		window.getFrame().setVisible(true);
		
		
		
		Board game = new Board();
		game.gameboard();
		
	}

}
