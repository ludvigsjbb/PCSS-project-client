import javax.swing.JFrame;
import javax.swing.JTextField;

public class Board {

	public JFrame board;
	
	//Field parameters for player 1
	public JTextField playerName;
	public JTextField playerScore;
	public JTextField playerTrainCount;
	
	//Field parameters for player 2
	public JTextField player2Name;
	public JTextField player2Score;
	public JTextField player2TrainCount;
	
	//Field parameters for player 3
	public JTextField player3Name;
	public JTextField player3Score;
	public JTextField player3TrainCount;
	
	//Field parameters for player 4
	public JTextField player4Name;
	public JTextField player4Score;
	public JTextField player4TrainCount;
		
	//Field parameters for player 5
	public JTextField player5Name;
	public JTextField player5Score;
	public JTextField player5TrainCount;
	
	
	public Board(){

		
	}
	
	
	
	public void gameboard(){
		//made canvas
		
		JFrame board = new JFrame();
		board.setBounds(0, 0, 1000, 800);
		board.setLocationRelativeTo(null);
		board.getContentPane().setLayout(null);
		board.setVisible(true);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setResizable(false);
		
		//First players score,trains and name
		//name
		playerName = new JTextField("Player: "+"Name", 10);
		board.add(playerName); // added playerName(JTextField) to the canvas.
		playerName.setBounds(0, 0, 200, 25); //creating location and size of the Text field.
		playerName.setEditable(false);
		
		//score
		playerScore = new JTextField("Score: "+"Score", 10);
		board.add(playerScore); // added playerName(JTextField) to the canvas.
		playerScore.setBounds(0, 24, 200, 25); //creating location and size of the Text field.
		playerScore.setEditable(false);
		
		//trains left
		playerTrainCount = new JTextField("Trains left: "+"Some number", 10);
		board.add(playerTrainCount); // added playerName(JTextField) to the canvas.
		playerTrainCount.setBounds(0, 48, 200, 25); //creating location and size of the Text field.
		playerTrainCount.setEditable(false);
		
		
		
		//Second players score,trains and name
		//name
		player2Name = new JTextField("Player 2: "+"Name", 10);
		board.add(player2Name); // added playerName(JTextField) to the canvas.
		player2Name.setBounds(200, 0, 200, 25); //creating location and size of the Text field.
		player2Name.setEditable(false);
				
		//score
		player2Score = new JTextField("Score: "+"Score", 10);
		board.add(player2Score); // added playerName(JTextField) to the canvas.
		player2Score.setBounds(200, 24, 200, 25); //creating location and size of the Text field.
		player2Score.setEditable(false);
				
		//trains left
		player2TrainCount = new JTextField("Trains left: "+"Some number", 10);
		board.add(player2TrainCount); // added playerName(JTextField) to the canvas.
		player2TrainCount.setBounds(200, 48, 200, 25); //creating location and size of the Text field.
		player2TrainCount.setEditable(false);
	
			
				
		//Third players score,trains and name
		//name
		player3Name = new JTextField("Player 3: "+"Name", 10);
		board.add(player3Name); // added playerName(JTextField) to the canvas.
		player3Name.setBounds(400, 0, 200, 25); //creating location and size of the Text field.
		player3Name.setEditable(false);
				
		//score
		player3Score = new JTextField("Score: "+"Score", 10);
		board.add(player3Score); // added playerName(JTextField) to the canvas.
		player3Score.setBounds(400, 24, 200, 25); //creating location and size of the Text field.
		player3Score.setEditable(false);
				
		//trains left
		player3TrainCount = new JTextField("Trains left: "+"Some number", 10);
		board.add(player3TrainCount); // added playerName(JTextField) to the canvas.
		player3TrainCount.setBounds(400, 48, 200, 25); //creating location and size of the Text field.
		player3TrainCount.setEditable(false);
				
		
		
		
		//Forth players score,trains and name
		//name
		player4Name = new JTextField("Player: "+"Name", 10);
		board.add(player4Name); // added playerName(JTextField) to the canvas.
		player4Name.setBounds(600, 0, 200, 25); //creating location and size of the Text field.
		player4Name.setEditable(false);
				
		//score
		player4Score = new JTextField("Score: "+"Score", 10);
		board.add(player4Score); // added playerName(JTextField) to the canvas.
		player4Score.setBounds(600, 24, 200, 25); //creating location and size of the Text field.
		player4Score.setEditable(false);
				
		//trains left
		player4TrainCount = new JTextField("Trains left: "+"Some number", 10);
		board.add(player4TrainCount); // added playerName(JTextField) to the canvas.
		player4TrainCount.setBounds(600, 48, 200, 25); //creating location and size of the Text field.
		player4TrainCount.setEditable(false);
		
		
		
		
		//5th players score,trains and name
		//name
		player5Name = new JTextField("Player: "+"Name", 10);
		board.add(player5Name); // added playerName(JTextField) to the canvas.
		player5Name.setBounds(800, 0, 200, 25); //creating location and size of the Text field.
		player5Name.setEditable(false);
		
		//score
		player5Score = new JTextField("Score: "+"Score", 10);
		board.add(player5Score); // added playerName(JTextField) to the canvas.
		player5Score.setBounds(800, 24, 200, 25); //creating location and size of the Text field.
		player5Score.setEditable(false);
		
		//trains left
		player5TrainCount = new JTextField("Trains left: "+"Some number", 10);
		board.add(player5TrainCount); // added playerName(JTextField) to the canvas.
		player5TrainCount.setBounds(800, 48, 200, 25); //creating location and size of the Text field.
		player5TrainCount.setEditable(false);
		
		
				
		
	}
	
	public void mycards(){
		
	}
	
	public void showplaced(){
		
	}
	
	
}
