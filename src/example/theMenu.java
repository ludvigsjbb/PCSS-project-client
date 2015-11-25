//import java.awt.EventQueue;

import javax.swing.JFrame;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class theMenu {
	boolean isMenu;
	private JFrame frame;

	
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
		
	
		

		

		JButton btnHello = new JButton("Hello, ");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("hello");
			
			}
		});
		btnHello.setBounds(165, 42, 120, 23);
		getFrame().getContentPane().add(btnHello);
		
		
			JButton btnCreateNewGame = new JButton("Create New Game");
			btnCreateNewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					System.out.println("NewGamecreated...");
				
					System.out.println(isMenu);
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

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}