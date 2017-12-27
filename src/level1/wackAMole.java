package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class wackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b = new JButton();
	JButton c = new JButton();
	JButton d = new JButton();
	JButton e1 = new JButton();
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
	Random generator = new Random();
	int number2 = generator.nextInt(20);
	int score = 0;
	int noMole = 0;

	Date TAS;
	
	public static void main(String[] args) {
		wackAMole a = new wackAMole();
		a.setup();
		
	}

	void setup() {
		run();
		TAS = new Date();
		
	}

	void run() {
		frame = new JFrame();
		panel = new JPanel();
		b = new JButton();
		c = new JButton();
		d = new JButton();
		e1 = new JButton();
		f = new JButton();
		g = new JButton();
		h = new JButton();
		i = new JButton();
		j = new JButton();
		k = new JButton();
		l = new JButton();
		m = new JButton();
		n = new JButton();
		o = new JButton();
		p = new JButton();
		q = new JButton();
		r = new JButton();
		s = new JButton();
		
		number2 = generator.nextInt(20);
		drawButtons(number2);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e1.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		m.addActionListener(this);
		n.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		q.addActionListener(this);
		r.addActionListener(this);
		s.addActionListener(this);
		
	}

	void drawButtons(int number) {
		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(300, 200);

		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e1);
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
		if (0 == number) {
			b.setText("mole");
		} else if (1 == number) {
			c.setText("mole");
		} else if (2 == number) {
			d.setText("mole");
		} else if (3 == number) {
			e1.setText("mole");
		} else if (4 == number) {
			f.setText("mole");
		} else if (5 == number) {
			g.setText("mole");
		} else if (6 == number) {
			h.setText("mole");
		} else if (7 == number) {
			i.setText("mole");
		} else if (8 == number) {
			j.setText("mole");
		} else if (9 == number) {
			k.setText("mole");
		} else if (10 == number) {
			l.setText("mole");
		} else if (11 == number) {
			m.setText("mole");
		} else if (12 == number) {
			n.setText("mole");
		} else if (13 == number) {
			o.setText("mole");
		} else if (14 == number) {
			p.setText("mole");
		} else if (15 == number) {
			q.setText("mole");
		} else if (16 == number) {
			r.setText("mole");
		}

		else if (17 == number) {
			s.setText("mole");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (b.equals(e.getSource()) && 0 != number2) {
		
			frame.dispose();
			noMole ++;

		}

		else if (c.equals(e.getSource()) && 1 != number2) {
			
			frame.dispose();
			noMole ++;
		}

		else if (d.equals(e.getSource()) && 2 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (e1.equals(e.getSource()) && 3 != number2) {
			
			frame.dispose();
			noMole ++;
		}

		else if (f.equals(e.getSource()) && 4 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (g.equals(e.getSource()) && 5 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (h.equals(e.getSource()) && 6 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (i.equals(e.getSource()) && 7 != number2) {

			frame.dispose();
			noMole ++;
		}

		else if (j.equals(e.getSource()) && 8 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (k.equals(e.getSource()) && 9 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (l.equals(e.getSource()) && 10 != number2) {
			
			frame.dispose();
			noMole ++;
		}

		else if (m.equals(e.getSource()) && 11 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (n.equals(e.getSource()) && 12 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (o.equals(e.getSource()) && 13 != number2) {
			
			frame.dispose();
			noMole ++;
		}

		else if (p.equals(e.getSource()) && 14 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (q.equals(e.getSource()) && 15 != number2) {
		
			frame.dispose();
			noMole ++;
		}

		else if (r.equals(e.getSource()) && 16 != number2) {
	
			frame.dispose();
			noMole ++;
		}

		else if (s.equals(e.getSource()) && 17 != number2) {
	
			frame.dispose();
			noMole ++;
		} else {
			System.out.println("hi");
			frame.dispose();
			score++;
			System.out.println("You have hit the mole " + score + " time(s)");
			
		}
		if(noMole == 1) {
			speak("dork");
			
		}
		else if(noMole == 2) {
			speak("idiot");
		}
		else if(noMole == 3) {
			speak("moron");}
			else if(noMole ==4 ) {
				speak("waste of atoms");}
		//setup();
		run();
		System.out.println(number2);
		if(score == 10) {
		endGame(TAS,score);}
		
}
}
