
import javax.swing.JOptionPane;

public class SwaggerMcPoppinsRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int abcdefghijklmnopqrstuvwxyz = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String aabcdefghijklmnopqrstuvwxyzz = JOptionPane
				.showInputDialog("Why do you not play games in the jungle?");
		System.out.println(aabcdefghijklmnopqrstuvwxyzz);
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (aabcdefghijklmnopqrstuvwxyzz
				.equals("Because there are too many cheatahs.")) {
			JOptionPane.showMessageDialog(null, "Great Job! XD");
			abcdefghijklmnopqrstuvwxyz = abcdefghijklmnopqrstuvwxyz +1;
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