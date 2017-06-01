package level1;

// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String pusheen = "https://s-media-cache-ak0.pinimg.com/236x/9f/4c/3d/9f4c3d55413be9030fcef76dca16281c.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component p;
		// 3. use the "createImage()" method below to initialize your Component
		p = createImage("https://s-media-cache-ak0.pinimg.com/236x/9f/4c/3d/9f4c3d55413be9030fcef76dca16281c.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(p);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer1 = JOptionPane.showInputDialog("Is this weird?yes or no");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer1.equals("no")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "NOPE");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(p);
		// 10. find another image and create it (might take more than one line
		// of code)
String snap = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjTmPnlxZvUAhXlrlQKHZmgBnEQjRwIBw&url=http%3A%2F%2Fwww.ucrallycats.com%2Fsnapchat%2F&psig=AFQjCNFIW970IZXog5rNCf8YIl9cOMPBNg&ust=1496368645368778";
Component s;
s = createImage("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjTmPnlxZvUAhXlrlQKHZmgBnEQjRwIBw&url=http%3A%2F%2Fwww.ucrallycats.com%2Fsnapchat%2F&psig=AFQjCNFIW970IZXog5rNCf8YIl9cOMPBNg&ust=1496368645368778");
		// 11. add the second image to the quiz window
quizWindow.add(s);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question

	

String answer2 = JOptionPane.showInputDialog("you might have to look this up. What year was this company founded?");

		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equals("2011")){
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else{
	JOptionPane.showMessageDialog(null, "sorry u r WRONG try again");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
