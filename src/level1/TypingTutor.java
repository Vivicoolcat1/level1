package level1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	char currentLetter; 
	JLabel label = new JLabel();
	JFrame frame = new JFrame("Type or die");
public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.run();
	
}
	void run() {
		
		frame.setVisible(true);
		frame.pack();
		currentLetter = generateRandomLetter();
		String a = Character.toString(currentLetter);
		label.setText(a);
		frame.add(label);
		label.setFont(label.getFont().deriveFont(100.0f));
	    label.setHorizontalAlignment(JLabel.CENTER);	
frame.addKeyListener(this);
	}	
	
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			Container c = frame.getContentPane();
			c.setBackground(Color.green);
			
		}
		else {
			System.out.println("wrong");
			Container c = frame.getContentPane();
            c.setBackground(Color.red);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed " + currentLetter );
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();

	String a = Character.toString(currentLetter);
	label.setText(a);
	}
 

	
	
	
	
	
	
	
	
}
