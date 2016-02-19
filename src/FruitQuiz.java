import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		 // 11. Make another question called "question2"

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		System.out.println(keyCode);

		int apple = 38;
		int banana = 37;
		int carrot = 40;
		if (question1.isShowing()) {
			if (keyCode == apple) {
				correct();
				nextQuestion(question2);
			}
			else {
				incorrect();
			}
		}

		// 12. If question2 is showing,

		// 13. check if it is right or wrong like you did for question1
	}

	private void correct() {
		playSound("Correct.wav");
	}

	private void incorrect() {
		playSound("Fail.wav");
	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(), question5;
}
