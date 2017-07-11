package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing {
public static void main(String[] args) {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button1 = new JButton ("Joke 1");
	JButton button2 = new JButton ("Punch line 1 (DONT PRESS BEFORE JOKE OR ELSE)");
	JButton button3 = new JButton (" Joke 2(click this after the Punch line 1)");
	JButton button4 = new JButton ("Punch line 2 (click after joke 1)");
	
	frame.add(panel);
	frame.add(button1);
	frame.add(button2);
	frame.add(button3);
	frame.add(button4);
	frame.setVisible(true);
	frame.setSize(800, 800);
	frame.pack();
}
}
