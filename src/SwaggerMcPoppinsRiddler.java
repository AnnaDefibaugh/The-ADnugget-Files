import javax.swing.JOptionPane;

public class SwaggerMcPoppinsRiddler {

	public static void main(String[] args) {

		int abcdefghijklmnopqrstuvwxyz = 0;

		String aabcdefghijklmnopqrstuvwxyzz = JOptionPane
				.showInputDialog("Why do you not play games in the jungle?");

		if (aabcdefghijklmnopqrstuvwxyzz
				.equals("Because there are too many cheatahs.")) {
			JOptionPane.showMessageDialog(null, "Great Job! XD");
			abcdefghijklmnopqrstuvwxyz = abcdefghijklmnopqrstuvwxyz + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT! \n");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, abcdefghijklmnopqrstuvwxyz);
	}
}