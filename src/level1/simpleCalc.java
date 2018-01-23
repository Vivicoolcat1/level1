package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class simpleCalc implements ActionListener {
JPanel panel = new JPanel();	
JFrame frame = new JFrame ();	
JButton button1 = new JButton("add");
JButton button2 = new JButton("sub");
JButton button3 = new JButton("mul");
JButton button4 = new JButton("div");
JTextField text1 = new JTextField(5);	
JTextField text2 = new JTextField(5);	
JLabel label = new JLabel();

public static void main(String[] args) {
	simpleCalc a = new simpleCalc();
	
a.run();
	
	
	
	
	
	
	
	
} 
void run () {
frame.add(panel);
panel.add(button1);	
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(text1);
panel.add(text2);	
panel.add(label);
frame.setVisible(true);
frame.pack();
	


	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	
	
}

public double add( double a, double b) {
	
	
	double c =(a+b);
	return c;
}

public double sub( double d, double e) {
	
	
	double f =(d-e);
	return f;
}
public double div( double g, double h) {
	
	
	double i =(g/h);
	return i;
}
public double mul( double j, double k) {
	
	
	double l =(j*k);
	return l;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton)e.getSource();
String x = text1.getText();	
String y = text2.getText();
double z= Double.parseDouble(x);
double v= Double.parseDouble(y);
	 if(button1 == buttonPressed) {
		
		 double answer1 =  add(z,v);
			label.setText(""+ answer1);	
		
		
	}
	 else if(button2 == buttonPressed) {
		 double answer2 =  sub(z,v);
		 label.setText(""+ answer2);	
		}
	 else if(button3 == buttonPressed) {
		 double answer3 = mul(z,v);
		 label.setText(""+ answer3);	
		}
	 else if(button4 == buttonPressed) {
		 double answer4 = div(z,v);
		 label.setText(""+ answer4);	
		}
	
	
	
	
}






}
