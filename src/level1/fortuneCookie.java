package level1;

import java.awt.Window;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fortuneCookie {
	public static void main(String[] args) {

		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Fortune");

		window.setVisible(true);
		window.add(panel);
		panel.add(button);

		button.addActionListener((e) -> {
			Random r = new Random();

			int x = r.nextInt(5);

			if (x == 0) {
				JOptionPane.showMessageDialog(null, "You will eat the best sandwich of your life");
			} else if (x == 1) {
				JOptionPane.showMessageDialog(null, "You will waste time of your life ");

			} else if (x == 2) {
				JOptionPane.showMessageDialog(null, "You will earn a million dollars  ");

			} else {
				JOptionPane.showMessageDialog(null, "you will lose your  best friend");

			}
		});
	}
}
