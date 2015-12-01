//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class theMenu { 
	
	// hosting for startgame, true if pressed
	public Boolean hosting;
	private JFrame frame;
	// names of players, myname being the host
	public JTextField myName;
	public JTextField playerName2;
	public JTextField playerName3;
	public JTextField playerName4;
	public JTextField playerName5;
	
	// displaying playernames in lobby
	public String hostName;
	public String player2;
	public String player3;
	public String player4;
	public String player5;
	
	public theMenu() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
    
	
	
	private void initialize() {
		setFrame(new JFrame());
		// size and location of the menu
		getFrame().setBounds(300, 200, 450, 300);
		// program closes when pressed "exit"
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		// players wont be able to resize
		getFrame().setLocationRelativeTo(null); 
		
		// going to turn true when pressed "Start Game"
		hosting = false;
		
			// creating "new game" button.
			JButton btnCreateNewGame = new JButton("Create New Game");
			btnCreateNewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("New Game created...");
					hosting = true;
					getFrame().setVisible(true);
					GoLobby();
				}
			});
			btnCreateNewGame.setBounds(165, 76, 120, 23);
			getFrame().getContentPane().add(btnCreateNewGame);
	
			
			
		JButton btnNewButton = new JButton("Join Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Joining game ...");
				hosting = false;
				getFrame().setVisible(true);
				GoLobby();
			}
		});
		btnNewButton.setBounds(165, 110, 120, 23);
		getFrame().getContentPane().add(btnNewButton);

		// whole program closes when pressed "Quit"
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		btnQuit.setBounds(165, 144, 120, 23);
		getFrame().getContentPane().add(btnQuit);

	}
	
	// lobby display
	public void GoLobby(){
	hostName = "";
	player2 = "Player 2";
	player3 = "Player 3";
	player4 = "Player 4";
	player5 = "Player 5";
	JFrame	Hostedlobby = new JFrame();
		
	// same location and size as menu
	Hostedlobby.setBounds(300, 200, 450, 300);
	Hostedlobby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Hostedlobby.getContentPane().setLayout(null);
	Hostedlobby.setLocationRelativeTo(null); 
	Hostedlobby.setVisible(true);
	
	// going to print to console when hosting lobby
	System.out.println("Hosting Lobby");
		
		
		myName		= new JTextField(hostName,10);
		playerName2 = new JTextField(player2, 10);
		playerName3 = new JTextField(player3, 10);
		playerName4 = new JTextField(player4, 10);
		playerName5 = new JTextField(player5, 10);
		
		JButton btnStartGame = new JButton("Start Game"); 
		btnStartGame.setBounds(165, 165, 120, 23);
		
		//Host's name... 
			  myName.setBounds(165, 40, 120, 23);
		//Only editable by him.
			  if(hosting == true){
				  myName.setEditable(true);
			  }else if(hosting == false){ 
				  myName.setEditable(false);}
			    
			  //player fields in the lobby, they can not edit their names (in future they will)
		playerName2.setBounds(165, 65, 120, 23);
		playerName2.setEditable(false);
		
		playerName3.setBounds(165, 90, 120, 23);
		playerName3.setEditable(false);
		
		playerName4.setBounds(165, 115, 120, 23);
		playerName4.setEditable(false);
		
		playerName5.setBounds(165, 140, 120, 23);
		playerName5.setEditable(false);
	
		// when lobby appears, place the Start Game button and players
		if(hosting == true){
		Hostedlobby.add(btnStartGame);
		}
		Hostedlobby.add(myName);
		Hostedlobby.add(playerName2);
		Hostedlobby.add(playerName3);
		Hostedlobby.add(playerName4);
		Hostedlobby.add(playerName5);
		
		
	
		// registers name
		myName.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				
				if(event.getSource() == myName){
					hostName = String.format("Player %s", event.getActionCommand());
					
				}
					
			}
			
		});
		
		// actionlistener for Start Game button
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Player me = new Player(0,0, "");
				me.setName(hostName);
				System.out.println(hostName + " is starting the game!");
				System.out.println("Starting...");
				
				
				
			
			}
		});
		
	}

	

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}