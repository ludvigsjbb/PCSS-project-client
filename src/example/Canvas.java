import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel {

		public Game game = null;
		
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.BLACK);
            g.fillOval(100, 100, 30, 30);
            g.setColor(Color.RED);
            g.drawString(this.game.colorDeck[0].name, 59, 59);
            // draw background
            
            // draw cities
            
            // draw cars
            for (Object car : game.cars) {
				// draw car
            	//if(car.owner == player.x)
            		// draw green
            		
            		//if(car owner == null)
            			// draw empty
			}
            // draw decks
            
            // draw user info
            
            
        }
    }