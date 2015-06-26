import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ShinyObjects {

	public static void main(String[] args) {
		
		// 2. Ask the user how many shiny objects they want
		String MyEyesAreBleeding = JOptionPane.showInputDialog(null, "How many shiny objects do you want?");
		// 3. Play the sound that many times
		//int number = for
		// 1. Call the method below
		playMisterZee();

	}

	public static void playMisterZee() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/Guest/Google Drive/LeagueStuff/league-sounds/llama.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}


