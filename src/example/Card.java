
public class Card {

	public static final int COLORED_CARD = 0;
	public static final int MISSION_CARD = 1;
	
	public static final int ON_DECK = 0;
	public static final int IN_HAND = 1;
	public static final int ON_BOARD_REVEALED = 2;
	public static final int DISCARD = 3;
	
	public Object player = null;
	public int location;
	public int type;
	public String name = "";
	public int points = 0;
	
	// constructor for colored card
	public Card(String color, int type)
	{
		this.name = color;
		this.location = ON_DECK;
		this.type = type;
		
	}
	
	public Card (String name, int type, int points)
	{
		this.name = name;
		this.type = type;
		this.points = points;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CARD : " + this.name + " (" + (this.type == COLORED_CARD ? "COLORED CARD" : "MISSION CARD") + ")";
	}
}
