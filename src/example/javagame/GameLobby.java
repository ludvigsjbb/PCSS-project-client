package javagame;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;

//hopefully it worked

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class GameLobby extends BasicGameState {

	// boolean host = false;
	Image StartGame;
	Image lobbyfull;
	Image closed;
	Image open;
	static int index = 0;
	
	
	public static String slot2 = "empty";
	public static String slot3 = "empty";
	public static String slot4 = "empty";
	public static String slot5 = "empty";

	public boolean checkifopen;

	public GameLobby(int state) {

		this.checkifopen = true;

		// arraylist
		String p1 = "playerone";
		ArrayList<String> players = new ArrayList<String>();
		players.add(p1);
		players.get(0);
		players.remove(0);
		players.trimToSize();
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		StartGame = new Image("res/StartGame.png");
		lobbyfull = new Image("res/lobbyfull.png");
		closed = new Image("res/closed.png");
		open = new Image("res/open.png");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
		g.drawString("PLAYER 1", 420,200);
		
		if(slot2 != null){
		g.drawString(slot2, 420,240);
		}else{
		g.drawString(slot2, 420,240);
		}
		if(slot2 != null){
		g.drawString(slot3, 420,280);
		}else{
		g.drawString(slot3, 420,280);
		}
		if(slot2 != null){
		g.drawString(slot4, 420,320);
		}else{
		g.drawString(slot4, 420,320);
		}
		if(slot2 != null){
		g.drawString(slot5, 420,360);
		}else{
		g.drawString(slot5, 420,360);
		}
		
		if (Menu.menuHost == true) { // not working
			StartGame.draw(400, 510);
		}

		if (checkifopen == false) {
			closed.draw(620, 510);
		} else {
		
			open.draw(620, 510);
		}

		// if (players.get(4) != null){ //ERRRRRROOOOOR HERE!!
		// lobbyfull.draw(450, 510);
		// }
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		// Open close lobby button
		if (Menu.menuHost == true) {
			if ((posX > 620 && posX < 820) && (posY > 150 && posY < 190)) {
				if (Mouse.isButtonDown(0) && checkifopen == true) {

					checkifopen = false;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Player pl = new Player("tmp");
					Lobby lobby = new Lobby("tmp",pl,"closeLobby");
					lobby.setState("closeLobby");
					ClientProgram.client.sendTCP(lobby);
				} else if (Mouse.isButtonDown(0) && checkifopen == false) {
					checkifopen = true;					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Player pl = new Player("tmp");
					Lobby lobby = new Lobby("tmp",pl,"openLobby");
					lobby.setState("openLobby");
					ClientProgram.client.sendTCP(lobby);
				}
			}
		}

		// Start
		if (Menu.menuHost == true) {
			if ((posX > 400 && posX < 600) && (posY > 150 && posY < 190)) {
				if (Mouse.isButtonDown(0)) {
					Player pl = new Player("tmp");
					Lobby lobby = new Lobby("tmp",pl,"startLobby");
					ClientProgram.client.sendTCP(lobby);
					index = 2;
					sbg.enterState(index);
						
				}
			}
		}

	}

	public int getID() {
		
		return 1;
	}
}