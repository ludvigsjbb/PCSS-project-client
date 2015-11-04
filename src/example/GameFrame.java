import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameFrame extends JFrame {
	
	// static variables
	private static final long serialVersionUID = 1L;
	
	// my object intances
	public Game game = null;
	
	// GUI object instances
	JMenuBar _menu;
	Canvas _canvas;
	//
	
	public GameFrame()
	{
		this.game = new Game(this);
		// create GUI controls
		createMenu();
		// create canvas
		_canvas = new Canvas();
		_canvas.game = this.game;
		
		this.add(_canvas);
		_canvas.setLocation(100, 100);
		_canvas.setSize(100, 100);
		
	}
	void startGame()
	{
		game = new Game(this);
		
	}
	// implement events & gui actions
	void createMenu()
	{
		_menu = new JMenuBar();
		// set menu bar parameters
		_menu.setVisible(true);
		_menu.setLocation(0, 0);
		// add menu 
		JMenu newGameMenu = new JMenu("New Game");
		newGameMenu.setForeground(Color.BLUE);
		_menu.add(newGameMenu);
		// add menu items
		JMenuItem newGame = new JMenuItem("Start Game");
		newGameMenu.add(newGame);
		newGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);
				System.out.println("New Game Clicked!");
				startGame();
				
			}
		});
		_menu.add(new JMenu("Quit"));
		
		this.add(_menu);
	}
	
}
