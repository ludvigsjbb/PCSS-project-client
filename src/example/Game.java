import java.awt.List;
import java.lang.reflect.Array;

import javax.swing.JFrame;

public class Game {

	public static String[] CARD_COLORS = {"Yellow", "Blue", "White", "Black", "Red", "Orange", "Purple", "Green", "Wildcard"};
	public static final int COLORED_CARD_COUNT = 10;
	public static final int WILDCARD_COUND = 16;
	public static final int CARD_COUNT = 96;
	public static final int MISSION_DECK_COUNT = 46;
	
	GameFrame frame = null;
	
	public Card[] colorDeck;
	public Card[] missionDeck;
	public Object[] cities;
	public Object[] cars;
	
	public Game(GameFrame frame)
	{
		System.out.println("Create game object ...");
		this.frame = frame;
		colorDeck = new Card[CARD_COUNT];
		for(int c = 0; c < CARD_COLORS.length; c++)
		{
			int cardCount = COLORED_CARD_COUNT;
			// iterate colors and create card objects
			if(c == CARD_COLORS.length - 1)
			{
				cardCount = WILDCARD_COUND;
			}
			
			for(int n = 0; n < cardCount; n++)
			{
				int pos = (int)(Math.random() * CARD_COUNT);
				while(colorDeck[pos] != null)
				{
					pos = (int)(Math.random() * CARD_COUNT);
				}
				colorDeck[pos] = new Card(CARD_COLORS[c], Card.COLORED_CARD);
				//System.out.println("Putting " + colorDeck[pos] + " into " + pos);
			}
		}
		// create mission deck
		missionDeck = new Card[MISSION_DECK_COUNT];
		Card[] defaultMissionDeck = createMissionDeck();
		for(int m = 0; m < MISSION_DECK_COUNT; m++)
		{
			int pos = (int)(Math.random() * MISSION_DECK_COUNT);
			while(missionDeck[pos] != null)
			{
				pos = (int)(Math.random() * MISSION_DECK_COUNT);
			}
			missionDeck[pos] = defaultMissionDeck[m];
		}
		System.out.println("Game object created!");
		//printDeck(colorDeck);
		printDeck(missionDeck);
	}
	
	public void printDeck(Card[] deck) {
		for (Card card : deck) {
			System.out.println(card.name);
		}
	}
	
	public Card[] createMissionDeck()
	{
		Card[] md = new Card[MISSION_DECK_COUNT];
		for(int i = 0; i< md.length; i++){
			
		md[i] = new Card("MD" + i, Card.MISSION_CARD, 10);
		}
		return md;
	}
	
}
