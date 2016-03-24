import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	public static void main(String[] args) {

		// Ask the user how many hours they spent coding this week.
		String CodingHours = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
		// 1. If it's 3 or more, tell them they're a Code Ninja.
		int HoursOfCode = Integer.parseInt(CodingHours);
		if (HoursOfCode >= (5)) {
			playBatmanTheme();
		}
	
		else if (HoursOfCode >= (3)) {
			JOptionPane.showMessageDialog(null, "Your a coding ninja");
		}
		// 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
		else if (HoursOfCode < (2)) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code."); 
		}
		else {
			JOptionPane.showMessageDialog(null, "Good enough.");
		}
	}
		// 3. If it's more than 5, play the Batman theme song.

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}