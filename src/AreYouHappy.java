import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Happiness = JOptionPane.showInputDialog("♡ Are you Happy?");
		if (Happiness.equals("yes")) {
			JOptionPane.showMessageDialog(null,"☺ Keep doing what ever you are doing.");
					
		}
		if (Happiness.equals("no")) {
			String Sadness = JOptionPane.showInputDialog("☹ Do you want to be happy?");
					
			if (Sadness.equals("yes")) {
				JOptionPane.showMessageDialog(null,"☺ Change something. Geez.");
			}
			if (Sadness.equals("no")) {
			JOptionPane.showMessageDialog(null,"☹ Keep doing what ever you are doing.");
		}
		}

	}
}
