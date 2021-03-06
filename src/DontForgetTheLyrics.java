import java.applet.AudioClip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.util.Random;
public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to
	 * guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under
	 * "src".
	 */

	public static void main(String[] args) {
		Randomness();
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "For this game, we'll play the start of a song, and you get to guess the rest of the lyrics.");
		// 5. Use the playSound method to play your song.
		playSound("centuries.wav");
		// 6. Make a pop-up for the player to type their answer.
		String Centuries = JOptionPane.showInputDialog("What is the next word?");
		// 7. If they answered correctly, tell them that they were right.
		if (Centuries .equals ("centuries")) {
			JOptionPane.showMessageDialog(null, "Thats right!");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			JOptionPane.showMessageDialog(null, "Wrong. It was centuries.");
		}
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
	public static void Randomness()
	{ Random RandomNumber=new Random();
	RandomNumber.nextInt(10);
System.out.println(RandomNumber);		
	}
		
	
}

