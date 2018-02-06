package level1;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton ("common fart");
	JButton button2 = new JButton ("silly fart");
public static void main(String[] args) {
	tootMachine a = new tootMachine();
	a.run();
	
	
	
	
}
void run() {
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.pack();
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	
	
}
private void playSound(String fileName) {
AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton)e.getSource();
	if(buttonPressed == button1) {
		playSound("fart1.wav");
	}
	else {
		playSound("fart2.wav");
	}
	
	
	
}


}
