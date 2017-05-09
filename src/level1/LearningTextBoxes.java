package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LearningTextBoxes {
JFrame window = new JFrame("cool");
JPanel panel = new JPanel();
JTextField tF = new JTextField(100);
JButton button = new JButton();
void createWindow(){
	

	
	window.add(panel);
	window.setVisible(true);
	panel.add(tF);
	window.pack();
	panel.add(button);
	window.setSize(2000, 1000);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	button.addActionListener(
			(e)->{
				String result =tF.getText();
				System.out.println(result);
			});
			
			
}}