

import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
	
public static void main(String[] args) {
	String CrankyChicken = JOptionPane.showInputDialog("What Is Your Name?");
	String ADnugget = JOptionPane.showInputDialog("What Did You Do Last Summer?");
	JOptionPane.showMessageDialog(null, CrankyChicken+ ", I know that you " + ADnugget+ " last summer. Muahahahahaaaa!");
}

}