package javagame;

import java.util.Arrays;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;


public class ClientProgram extends Listener {

	//The client object.
	static Client client;
	
	//IP to connect to. !IMPORANT VARIABLE! REMEMBER TO CHANGE BASED ON HOST IP
	static String ip = "192.168.43.14";
	
	//Ports to connect to.
	static int udpPort = 4445, tcpPort = 4444;
	
	//Boolean to check if a packet is received
	static boolean gameOver = false;
	
	//Test objects
	static Player pl = new Player("Name");
	static Lobby test = new Lobby("Kek",pl,"joinLobby");
	
	public static void update() throws Exception {
		System.out.println("Connecting to the server...");
		
		//Create the client.
		client = new Client();
		
		//Register different classes.
		client.getKryo().register(Lobby.class);
		client.getKryo().register(Player.class);
		client.getKryo().register(Player[].class);
		client.getKryo().register(TrainCard.class);
		client.getKryo().register(Map.class);
		client.getKryo().register(Route.class);
		client.getKryo().register(java.util.ArrayList.class);
		client.getKryo().register(String.class);
		
		//Start the client
		client.start();
		//The client MUST be started before connecting can take place.
		
		//Connect to the server - wait 5000ms before failing.
		client.connect(5000, ip, tcpPort, udpPort);
		
		//Add a listener
		client.addListener(new ClientProgram());
		
		System.out.println("Connected! The client program is now waiting for a packet...\n");
		
		//This is here to stop the program from closing before we receive a message.
		class MyRunnable implements Runnable {

		    public void run(){
				while(!gameOver){
					System.out.println("Not ending yet");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//This happens when messegeReceived is true
				System.out.println("Client will now exit.");
				//System.exit(0);
		    }
		  }
		 Thread thread = new Thread(new MyRunnable());
		   thread.start();
	}
	
	//This is called whenever a packet is received from the server
	public void received(Connection c, Object p){
		//If the class of the packet is Lobby then do the following
		if (p instanceof Lobby){
			Lobby lobby = (Lobby) p;
				if(lobby.commandString.equalsIgnoreCase("update")){

				}
		}else if(p instanceof Player){
			Player plr = (Player) p;
				if(plr.commandString.equalsIgnoreCase("joinLobby")){
					if(GameLobby.slot2 == null){
						GameLobby.slot2 = "player2";
					}else if(GameLobby.slot3 == null){
						GameLobby.slot3 = "player3";
					}else if(GameLobby.slot4 == null){
						GameLobby.slot4 = "player4";
					}else if(GameLobby.slot5 == null){
						GameLobby.slot5 = "player5";
					}
				}
		}
	}
}