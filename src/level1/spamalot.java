package level1;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class spamalot {
	static final String FAKE_USERNAME = "ctct1957@gmail.com";
static final String FAKE_PASSWORD = "112233445678";

	//reate the user interface for your spammer that looks something like this:
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("GOOD");
	JButton button2 = new JButton("BAD");
	JTextField text = new JTextField();
	text.setPreferredSize(new Dimension(500,50));
	frame.add(panel);
	panel.add(text);
	panel.add(button1);
	panel.add(button2);
	frame.setVisible(true);
	frame.pack();
	
}

		

}
