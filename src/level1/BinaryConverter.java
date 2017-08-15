package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	//We’re going to make an application that converts binary codes (8-bits) into letters.
	public void start(){
		
		frame.add(panel);
		panel.add(answer);
		panel.add(button1);
		panel.add(answer2);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		
		
	}
	//You’ll need a JFrame and a JPanel.
JFrame frame =new JFrame();
JPanel panel = new JPanel();

	//On the panel, put two text fields and a button. A text field is made like this:
	JTextField answer = new JTextField(20);
	JTextField answer2 = new JTextField(20);
	JButton button1 = new JButton("Converter");
	
	//It may look like this or you might have a better layout in mind.


	//Here is a method that will do the conversion for you.
//	int convert(String binary) {
//			if(binary.length() != 8){
//				JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
//				return 0;
//			}
//			 if(!Pattern.matches("\2", binary)) {
//				 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
//					return 0;
//			 }
//			try {
//				int asciiValue = Integer.parseInt(binary, 2);
//				return asciiValue;
//			} catch (Exception e) {
//				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
//				//question.setText("");
//				return 0;
//			}
//		}
	 String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String b = answer.getText();
		
	String c = convert(b);
		
		answer2.setText(c);
		
		
	}

}
