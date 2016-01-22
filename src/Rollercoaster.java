import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String Height = JOptionPane.showInputDialog("How tall (in ft) are you?");
	int	HeightFt = Integer.parseInt(Height);
	if (HeightFt > 4) {
		JOptionPane.showMessageDialog(null, "You are tall enough.");
	}
	else if (HeightFt < 4) {
		JOptionPane.showMessageDialog(null, "You need to grow more.");
	}
	else if (HeightFt == 4) {
		JOptionPane.showMessageDialog(null, "Just enough.");
	}
	}
}