import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String Age = JOptionPane.showInputDialog("How old are you?");
		int Age1 = Integer.parseInt(Age);

		if (Age1 < 18) {
			JOptionPane.showMessageDialog(null, "You need to get older.");
		} 
		
		else if (Age1 >= 18) {
			JOptionPane.showMessageDialog(null, "Your just old enough to vote.");
			String Vote = JOptionPane.showInputDialog("Who do you vote for? Donald Trump or Hillary Clinton.");

			if (Vote.equals("Donald Trump")) {
				JOptionPane.showMessageDialog(null, "No! Not Trump!");
			}

			else if (Vote.equals("Hillary Clinton")) {
				JOptionPane.showMessageDialog(null, "Girl Power!");
			}
		}

	}
}