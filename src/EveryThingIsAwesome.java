import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Everything is awesome!");
	String Awesome = JOptionPane.showInputDialog(null, "What Do You Think Is Awesome?");
	JOptionPane.showMessageDialog(null, Awesome+ " Is awesome");
}
}
