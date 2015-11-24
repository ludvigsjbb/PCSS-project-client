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
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
	

		
			JButton btnCreateNewGame = new JButton("Create New Game");
			btnCreateNewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					System.out.println("NewGamecreated...");
				
					System.out.println(isMenu);
				}
			});
			btnCreateNewGame.setBounds(181, 76, 119, 23);
			getFrame().getContentPane().add(btnCreateNewGame);
	
		JButton btnNewButton = new JButton("Join Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("Joining game ...");

			}
		});
		btnNewButton.setBounds(181, 110, 119, 23);
		getFrame().getContentPane().add(btnNewButton);

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		btnQuit.setBounds(181, 144, 119, 23);
		getFrame().getContentPane().add(btnQuit);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}