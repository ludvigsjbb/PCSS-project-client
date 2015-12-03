package javagame;

import org.lwjgl.input.Mouse;

//hopefully it worked

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Lobby extends BasicGameState {
	Image StartGame;
	public Lobby (int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		StartGame = new Image("res/StartGame.png");
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		StartGame.draw(400, 510);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		
		//Start
		if( (posX>400 && posX<600)&&( posY>50 && posY < 90 ) ){
			if(Mouse.isButtonDown(0)){
				sbg.enterState(2);
			}
		}
	}
	
	public int getID() {
		
		return 1;
	}

}