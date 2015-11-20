import javax.swing.JOptionPane;

public class YourHairColorIs {
public static void main(String[] args) {
		
	String WhoDyesTheirHairAnyway = JOptionPane.showInputDialog("What Color Is Your Hair?");
	
	if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Pink")) {
		JOptionPane.showMessageDialog(null, "Cotton Candy!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Red")) {
		JOptionPane.showMessageDialog(null, "Punk Rocker!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Orange")) {
		JOptionPane.showMessageDialog(null, "Yum...");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Yellow")) {
		JOptionPane.showMessageDialog(null, "Your Hair Hurts My Eyes!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Green")) {
		JOptionPane.showMessageDialog(null, "Sour Limes.");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Blue")) {
		JOptionPane.showMessageDialog(null, "The Color Of My Eyes...");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Purple")) {
		JOptionPane.showMessageDialog(null, "Got Any Grapes?");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Black")) {
		JOptionPane.showMessageDialog(null, "Slick Hair Man.");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Grey")) {
		JOptionPane.showMessageDialog(null, "From the 80s...");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("White")) {
		JOptionPane.showMessageDialog(null, "Oldy!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Brown")) {
		JOptionPane.showMessageDialog(null, "Betsy!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Rainbow")) {
		JOptionPane.showMessageDialog(null, "Unicorn, Unicorn, Uni-Uni-Unicorn!");
	}
	
	else if (WhoDyesTheirHairAnyway .equalsIgnoreCase("Blond")) {
		JOptionPane.showMessageDialog(null, "Twinzies!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "I Do Not Know That Color.");
	}
	
	}
}