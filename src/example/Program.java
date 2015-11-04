import javax.swing.JFrame;

public class Program {

	public static Game game = null;
	
	public static void main (String[] args){	
		
		 java.awt.EventQueue.invokeLater(new Runnable() {
	          public void run() {
	               JFrame frame = new GameFrame();
	               frame.setSize(1000, 700);
	               frame.setVisible(true); 
	             
	          }
	    });
		
		
		/*for (int i = 0; 1 < deck.length; i++){
			int index = (int)(Math.random()*deck.length);
			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
			}
		*/
	}
}
