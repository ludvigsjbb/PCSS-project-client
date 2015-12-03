import javax.swing.JFrame;

public class Main {
	
	public static void main (String[] args){
		
		theMenu window = new theMenu();
		window.getFrame().setVisible(true);
		
		imageDisplay gui = new imageDisplay();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("Display the image");
		
		Board game = new Board();
		game.gameboard();
		
	}

}
