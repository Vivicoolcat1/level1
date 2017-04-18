package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {
	JFrame window;
	JPanel panel;
	JButton button1;
	void setup() {
 window = new JFrame();
 window.setVisible(true);
 window.setSize(100, 200);
 panel = new JPanel();
 window.add(panel);
 button1 = new JButton("DON'T CLICK i know you want to");
 panel.add(button1);
 window.setSize(500, 500);
 button1.addActionListener(
		 
		(v)->{
			
			JOptionPane.showMessageDialog(null, "...");
			
			
			
		}
		 
		 
		 
		 );
	}
}
