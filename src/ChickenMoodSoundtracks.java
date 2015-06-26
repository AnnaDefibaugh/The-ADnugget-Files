import java.net.URI;

import javax.swing.JOptionPane;

public class ChickenMoodSoundtracks {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "Which mood are you in", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Festive", "Murderus", "Hungry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a Hungry mood, use the playVideo method to play a calming song from YouTube.
if (userMood == 2) {
	playVideo("https://www.youtube.com/watch?v=6y_NJg-xoeE");
}
}
		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
