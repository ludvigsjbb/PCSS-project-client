package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState {
	
	public static boolean menuHost;
	
	Image HostGame;
	Image JoinGame;
	Image Quit;
	
	public boolean host;
	public boolean join = false;
	public int[] players;
	public boolean open;
	public boolean closed;
	public boolean full;
	
	public Menu(int state) {	
		
		this.host = false;
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		JoinGame = new Image("res/Start.png");
		HostGame = new Image("res/Host a game.png");
		Quit	 = new Image("res/quit.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Ticket to Ride!", 430, 50);
		JoinGame.draw(400,100);
		HostGame.draw(400,175);
		Quit.draw(400, 250);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
			int posX = Mouse.getX();
			int posY = Mouse.getY();
			
			//joining game
			if( (posX>400 && posX<600)&&( posY>560 && posY < 600 ) ){
				if(Mouse.isButtonDown(0)){
					sbg.enterState(1);
					//join = true;
				}
			}
			//creating a lobby.
			if( (posX>400 && posX<600)&&( posY>495 && posY < 525 ) ){
				if(Mouse.isButtonDown(0)){
					menuHost = true;
					sbg.enterState(1);
				}
			}
			
			if( (posX>400 && posX<600)&&( posY>420 && posY < 450 ) ){
				if(Mouse.isButtonDown(0)){
					System.exit(0);
				}
			}
		
	}
	
	public int getID() {
		
		return 0;
	}

}