package level1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener  {
	public void	start() {
		
		frame.setVisible(true);
		frame.addKeyListener(this);
		
		
		
		
	}
		
		
		
		
		
		
		
JFrame frame = new JFrame();
public static void main(String[] args) {
	
SensitiveKeyboard a = new SensitiveKeyboard();
	a.start();
	
	

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("OUCH!");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

}
