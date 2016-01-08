import javax.swing.JOptionPane;

public class HappyUnbirthday {
public static void main(String[] args) {
	
	String Birthday = JOptionPane.showInputDialog("Is today your birthday?");
	
	if (Birthday.equals("no")) {
		JOptionPane.showMessageDialog(null, "Happy Un-Birthday!");
	}
	
	else if (Birthday.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	
	else if (Birthday.equals("No")) {
		JOptionPane.showMessageDialog(null, "Happy Un-Birthday!");
	}
	
	else if (Birthday.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}

 }
}
