package level1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot implements ActionListener {
	static final String FAKE_USERNAME = "ctct1957@gmail.com";
	static final String FAKE_PASSWORD = "112233445678";

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("GOOD");
	JButton button2 = new JButton("BAD");
	JTextField text = new JTextField();

	public static void main(String[] args) {
		new spamalot().run();
	}

	void run() {
		text.setPreferredSize(new Dimension(500, 30));
		frame.add(panel);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

;


	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button1) {
			sendSpam("Vianneschwaebe@gmail.com", "Test", "Hi this is a spam (im a honest human now!!!!) ");
		}
		else {
			sendSpam("Vianneschwaebe@gmail.com", "Test", " You have your entire life to be a jerk. Why not take today off?");
		}
		
	}

}
