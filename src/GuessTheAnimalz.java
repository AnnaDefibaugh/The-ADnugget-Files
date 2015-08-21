import javax.swing.JOptionPane;

public class GuessTheAnimalz {

	public static void main(String[] args) {

		JOptionPane
				.showMessageDialog(null,
						"The choises are Chicken, Monkey, Horse, Minion, and a Dolphin.");
		String Question1 = JOptionPane
				.showInputDialog("Is it a flightless bird?");
		if (Question1.equals("yes")) {

			JOptionPane.showMessageDialog(null, "It is a Chicken.");

		}

		else if ((Question1.equals("no"))) {
			String Question2 = JOptionPane
					.showInputDialog("Is it a banana loving creature?");
			if ((Question2.equals("no"))) {
				JOptionPane.showMessageDialog(null, "It is a Horse");
			}
			if ((Question2.equals("yes"))) {
				String Question3 = JOptionPane
						.showInputDialog("Is it stretchy?");
				if ((Question3.equals("yes"))) {

					JOptionPane.showMessageDialog(null, "It is a Minion");

				}
				if ((Question3.equals("no"))) {
					String Question4 = JOptionPane
							.showInputDialog("Is it slippery.");
					
					if ((Question4.equals("yes"))) {
						JOptionPane.showMessageDialog(null, "It is a Dolphin");
					}   if ((Question4.equals("no"))) {
						JOptionPane.showMessageDialog(null, "It is a Monkey");
					}
						
				}

			}
		}
	}
}