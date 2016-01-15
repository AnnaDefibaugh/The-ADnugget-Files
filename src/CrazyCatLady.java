import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String Cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int CatsA = Integer.parseInt(Cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (CatsA > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady! :3");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
		else if (CatsA == 0) {
			playVideo("https://www.youtube.com/watch?v=UoHTdq0zQVI");
		}
		
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		else {
			playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}