import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args){
		
		theMenu window = new theMenu();
		window.getFrame().setVisible(true);
		
		imageDisplay kaka = new imageDisplay();
		kaka.test();
		
		Board game = new Board();
		game.gameboard();
		
	}

}
