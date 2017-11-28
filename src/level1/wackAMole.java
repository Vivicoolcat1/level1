package level1;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class wackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b = new JButton();
	JButton c = new JButton();
	JButton d = new JButton();
	JButton e = new JButton();
	JButton f = new JButton();
	JButton g = new JButton();
	JButton h = new JButton();
	JButton i = new JButton();
	JButton j = new JButton();
	JButton k = new JButton();
	JButton l = new JButton();
	JButton m = new JButton();
	JButton n = new JButton();
	JButton o = new JButton();
	JButton p = new JButton();
	JButton q = new JButton();
	JButton r = new JButton();
	JButton s = new JButton();
Random number = new Random();
int number2 = number.nextInt(20);
public static void main(String[] args) {
		wackAMole a = new wackAMole();
	a.run();
}
void run() {
		drawButtons(number2);
}


void drawButtons(int number) {
frame.add(panel);
	
	frame.setVisible(true);
	frame.setSize(300, 200);


	
	
	panel.add(b);
	panel.add(c);
	panel.add(d);
	panel.add(e);
	panel.add(f);
	panel.add(g);
	panel.add(h);
	panel.add(i);
	panel.add(j);
	panel.add(k);
	panel.add(l);
	panel.add(m);
	panel.add(n);
	panel.add(o);
	panel.add(p);
	panel.add(q);
	panel.add(r);
	panel.add(s);
	 if(0 == number) {
		b.setText("mole");
	}
	 else if(1 == number)  {
		c.setText("mole");
	}
	 else if(2 == number)  {
		d.setText("mole");
	}
	 else if(3 == number) {
		e.setText("mole");
	}
	 else if(4 == number) {
		f.setText("mole");
	}
	 else if(5 == number) {
		g.setText("mole");
	}
	 else if(6 == number) {
		h.setText("mole");
	}
	 else if(7 == number) {
		i.setText("mole");
	}
	 else if(8 == number){
		j.setText("mole");
	}
	 else if(9 == number) {
		k.setText("mole");
	}
	 else if(10 == number) {
		l.setText("mole");
	}
	 else if(11 == number){
		m.setText("mole");
	}
	 else if(12 == number) {
		n.setText("mole");
	}
	 else if(13 == number) {
		o.setText("mole");
	}
	 else if(14 == number) {
		p.setText("mole");
	}
	 else if(15 == number) {
		q.setText("mole");
	}
	 else if(16 == number) {
		r.setText("mole");
	}
	
	else {
	s.setText("mole");	
	}
}
}
