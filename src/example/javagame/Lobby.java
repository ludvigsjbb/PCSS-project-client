package javagame;

import java.util.ArrayList;

public class Lobby {

	protected String lobbyName;
	protected String state;
	protected ArrayList<Player> players = new ArrayList<Player>();
	protected int runtime;
	public String commandString;
	
	//no-arg constructor because Kryonet requires it. 
	Lobby(){}
	
	Lobby(String lobbyName, Player player, String command) {
		this.lobbyName = lobbyName;
		this.players.add(player);
		this.commandString = command;
	}


	//Player join
	public String joinLobby(Player newPlayer) {
		if (players.size() <= 5) {				//The game can only hold a maximum of 5 players
			this.players.add(newPlayer);		//New player is added to the next spot in the array
			return "Joined lobby";				//String is returned to player, client
		} else {
			return "Lobby is full";				//String is returned if full
		}
	}
	
	
	//Get and Set
	//Lobby name
	public String getLobbyName() {
		return lobbyName;
	}
	
	public void setLobbyName(String lobbyName) {
		this.lobbyName = lobbyName;
	}
	//end lobby name
	
	//State
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	//end state
	
	//Player array
	public ArrayList<Player> getPlayer() {
		return players;
	}
	//end player
	
	//Runtime
	public int getRuntime() {
		return runtime;
	}
	//end runtime
	//end Get and Set
}