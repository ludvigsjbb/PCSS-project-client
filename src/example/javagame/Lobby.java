package javagame;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;

//hopefully it worked

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Lobby extends BasicGameState {
	
//	boolean host = false;
	Image StartGame;
	
	public Lobby (int state) {
		
		
		//arraylist
		String p1 = "playerone";
		ArrayList<String> players = new ArrayList<String>();
		players.add(p1);
		
		players.get(0);
		players.remove(0);
		players.trimToSize();
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		StartGame = new Image("res/StartGame.png");
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		Menu fagoot = new Menu(0);
		boolean checker = fagoot.host;

		if (checker == true) {
			StartGame.draw(400, 510);
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		Menu fagoot = new Menu(0);
		boolean checker = fagoot.host;
		
		int posX = Mouse.getX();
		int posY = Mouse.getY();

		// Start

		if (checker == true) {
			if ((posX > 400 && posX < 600) && (posY > 150 && posY < 190)) {
				if (Mouse.isButtonDown(0)) {
					sbg.enterState(2);

				}
			}

		}
	}
	public int getID() {
		
		return 1;
	}

}