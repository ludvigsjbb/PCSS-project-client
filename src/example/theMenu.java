//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class theMenu { 
	
	
	public Boolean hosting;
	public Boolean joining;
	//boolean isMenu;
	private JFrame frame;
	public JTextField myname;
	public JTextField playername2;
	public JTextField playername3;
	public JTextField playername4;
	public JTextField playername5;
	
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
		getFrame().setBounds(300, 200, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setLocationRelativeTo(null); 
		
	
		

		

		JButton btnHello = new JButton("Hello, ");  // in the brackets : + myplayer.getName()  
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("hello " ); // in the brackets: + myplayer.getName()
			
			}
		});
		btnHello.setBounds(165, 42, 120, 23);
		getFrame().getContentPane().add(btnHello);
		
		
		
			JButton btnCreateNewGame = new JButton("Create New Game");
			btnCreateNewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("New Game created...");
					boolean hosting = false;
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

			}
		});
		btnNewButton.setBounds(165, 110, 120, 23);
		getFrame().getContentPane().add(btnNewButton);

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		btnQuit.setBounds(165, 144, 120, 23);
		getFrame().getContentPane().add(btnQuit);

	}
	
	public void GoLobby(){
		
	hostName = "";
	player2 = "Player 2";
	player3 = "Player 3";
	player4 = "Player 4";
	player5 = "Player 5";
	JFrame	Hostedlobby = new JFrame();
		
	Hostedlobby.setBounds(300, 200, 450, 300);
	Hostedlobby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Hostedlobby.getContentPane().setLayout(null);
	Hostedlobby.setLocationRelativeTo(null); 
	Hostedlobby.setVisible(true);
		System.out.println("Hosting Lobby");
		
		
		myname		= new JTextField(hostName,10);
		playername2 = new JTextField(player2, 10);
		playername3 = new JTextField(player3, 10);
		playername4 = new JTextField(player4, 10);
		playername5 = new JTextField(player5, 10);
		
		JButton btnStartGame = new JButton("Start Game"); 
		
		btnStartGame.setBounds(165, 165, 120, 23);
			  myname.setBounds(165, 40, 120, 23);
		
		playername2.setBounds(165, 65, 120, 23);
		playername2.setEditable(false);
		
		playername3.setBounds(165, 90, 120, 23);
		playername3.setEditable(false);
		
		playername4.setBounds(165, 115, 120, 23);
		playername4.setEditable(false);
		
		playername5.setBounds(165, 140, 120, 23);
		playername5.setEditable(false);
	
		//if(hosting == true){
		Hostedlobby.add(btnStartGame);
		//}
		Hostedlobby.add(myname);
		Hostedlobby.add(playername2);
		Hostedlobby.add(playername3);
		Hostedlobby.add(playername4);
		Hostedlobby.add(playername5);
		
		
	
		
		myname.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				
				if(event.getSource() == myname){
					hostName = String.format("Player %s", event.getActionCommand());
					
				}
					
			}
			
		});
		
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