package level1;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/level1/src/level1/liza.jpg";
	String secondImage = "/Users/league/Desktop/level1/src/level1/Hailee.jpg";
	String thirdImage = "/Users/league/Desktop/level1/src/level1/Pentatonix.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(300,400);
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer
String answer1 = JOptionPane.showInputDialog("Who is this?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(answer1 .equals("Liza Koshy")){
	JOptionPane.showMessageDialog(null, "Correct");
	score ++;
}
else {
	JOptionPane.showMessageDialog(null, "nope it is Liza Koshy");
}
showNextImage();
String answer2 = JOptionPane.showInputDialog("Who is this?");
if(answer2 .equals("Hailee Stienfield")){
	JOptionPane.showMessageDialog(null, "Correct");
	score ++;
}
else {
	JOptionPane.showMessageDialog(null, "nope it is Hailee Stienfield");
}
showNextImage();
String answer3 = JOptionPane.showInputDialog("Who is this?");
if(answer3 .equals(" The Pentatonx")){
	JOptionPane.showMessageDialog(null, "Correct");
	score ++;
}else {
	JOptionPane.showMessageDialog(null, "nope it is The Pentatonix");
}

			// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image

		// Show the score
JOptionPane.showMessageDialog(null, "Your score is " + score);
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


