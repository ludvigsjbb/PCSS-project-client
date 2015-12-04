package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class Game extends StateBasedGame {
	
	public static final String gameName = "Ticket To Ride";
	public static final int menu = 0;
	public static final int gamelobby = 1;
	public static final int play = 2;
	public Game(String gameName) {
		
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new GameLobby(gamelobby));
		this.addState(new Play(play));
		
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(gamelobby).init(gc,this);
		this.enterState(menu);

	}
	

	public static void main(String[] args) {
		try {
			ClientProgram.update();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		AppGameContainer appgc;
		
		try{
			
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(950, 700, false);
			appgc.start();
			
			
		}catch(SlickException e) {
			e.printStackTrace();
		}

	}

}
