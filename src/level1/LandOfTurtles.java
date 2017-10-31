package level1;

import java.awt.Component;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		// 2. Add the panel to the frame
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		int move = 1;
		for (int i = 0; i <= 50; i++) {
			move++;
			Turtle turt = new Turtle();
			
			// 5. Add the turtle to the panel
			panel.addTurtle(turt);
			turt.move(move);
		}

		// 6. Put 50 Turtles on the beach

	}
}
