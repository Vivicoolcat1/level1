package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTest implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("In a one-storey pink house, there was a pink person, a pink cat, a pink fish, a pink computer, a pink chair, a pink table, a pink telephone, a pink shower– everything was pink!What color were the stairs?\n"  );
	JButton button1 = new JButton("hint");
	JButton button2 = new JButton("check answer");
	JTextField text = new JTextField(50);
	JPanel panel = new JPanel();
	
	public practiceTest(){
		
		frame.add(panel);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(text);
		frame.pack();
		frame.setVisible(true);
		button1.addActionListener(this);
	button2.addActionListener(this);
	
		
	}
public static void main(String[] args) {
	new practiceTest();
	
}

public static boolean answercheck (String answer ) {
	String rightAnswer = " There weren’t any stairs, it was a one storey house.";	
	if(answer.equals(rightAnswer)){
		return true;
		
		
	}
	else if(answer.equals("there weren't any stairs")) {
		
		return true;
	}
	
	else {
		
		return false;
	}
	

	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource()== button2) {
		String answer1 = text.getText();
		boolean check =answercheck(answer1);
		if(check == true) {
			label.setText("Correct!");
		}
		
		else if(check == false) {
			label.setText("Wrong");}
		}
		 if(e.getSource() == button1) {
			label.setText("How many stories were there?");
			System.out.println("hi");
		}
	}
	
	
	
	
	
	
	
	
}












