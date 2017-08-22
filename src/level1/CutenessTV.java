package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
public void start() {
	
	
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
	
	
	
	
	
	
}
	JPanel panel = new JPanel();
	
JFrame frame = new JFrame ();

JButton button1 = new JButton("Keith's video");
	JButton button2 = new JButton("Ribbit");
	JButton button3 = new JButton("Fluffs");
	
	
	
	
	
	
	
	
	void showDucks() {
			playVideo("e3PdcKcUvDY");
		}

		void showFrog() {
			playVideo("aSjCb-FfxhI");
		}
		
		void showFluffyUnicorns() {
			playVideo("qRC4Vk6kisY");
		}

		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/watch?v=" + videoID );
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton b = (JButton) e.getSource();
			if(b == button1) {
				showDucks();
			}
			else if(b == button2) {
				showFrog();
			}
			else
			{
				showFluffyUnicorns();
			}
			
			
			
		}


}
