package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JButton button = new JButton("Spin");
	Random num1 = new Random();
	Random num2 = new Random();
	Random num3 = new Random();
	
public static void main(String[] args) {
	SlotMachine a = new SlotMachine();
	a.run();
	
	
}
void run () {
	frame.add(panel);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	panel.add(label4);
	panel.add(button);
	frame.setVisible(true);
	frame.pack();
	button.addActionListener(this);

	
	
	
}

void spin () {
	
int b  =  num1.nextInt(4);
int c = num2.nextInt(4);
int d  = num3.nextInt(4);
	String x = Integer.toString(b);
	String y = Integer.toString(c);
	String z = Integer.toString(d);
	label1.setText(x);
	label2.setText(z);
	label3.setText(y);
	if(b == c && b==d ) {
		label4.setText("you win !!!");
	}
	else {
		label4.setText("You lose :(");
	}
	frame.pack();
}






@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
spin();
	
	
	
	
	
	
	
	
}
}
