import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Main extends JFrame {
	/**
	 * 
	 */
	public String name; 
	private static final long serialVersionUID = 1L;
	// Makes field item called "player name" 
	private JTextField playername;
	//public boolean checker = false; 

	
	public Main(){ 
		
		super("Ticket to Ride");//canvas name
		
		setLayout(new FlowLayout()); //Default layout
		
		
		playername = new JTextField("Player",10); // (10) is the length of the box
		
		add(playername); //adds to frame
		
		thehandler handler = new thehandler(); //actionListener object
		handler.getName();
		
		
		playername.addActionListener(handler);
	}
	

	
	public class thehandler implements ActionListener{ //class to handle the events
		//whenever an action  occurs, this will happen
		public String name;
		
		
		public void actionPerformed(ActionEvent event) {
			//String name = ""; 
			//Takes written and places it in "name";
			if(event.getSource() == playername)
				this.name = String.format("Player %s", event.getActionCommand());
			JOptionPane.showMessageDialog(null, name);
			System.out.println(name + " is joining the Lobby ... ");
			
			
			
			theMenu window = new theMenu();
			window.getFrame().setVisible(true);
			
			
		
			
		} 
		
		public void createName(String name){
			this.name =  name;
		}
		
		public String getName(){
			return name;
		}
		
	}
	
}
