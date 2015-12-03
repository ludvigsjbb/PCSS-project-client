import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class imageDisplay extends JFrame{

		private ImageIcon image1;
		private JLabel label1;
		
		imageDisplay() {
			
		}
		
		public void test(){
			
			imageDisplay gui = new imageDisplay();
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setVisible(true);
			gui.pack();
			gui.setTitle("Display the image");
			
			setLayout(new FlowLayout());
			image1 = new ImageIcon(getClass().getResource("tickettoride.jpg"));
			label1 = new JLabel(image1);
			add(label1);
		}
		private static final long serialVersionUID = 1L;
}
