//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Boonana {

	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
String Boonana =JOptionPane.showInputDialog("Do you like boonanas?");
		if (Boonana .equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy dumb!!!");
		}
		if (Boonana .equals("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy dumb!!!");
		}
		
		if (Boonana .equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You are crazy beautiful with your mind!!!");
		}
		
		if (Boonana .equals("yes")) {
			JOptionPane.showMessageDialog(null, "You are crazy beautiful with your mind!!!");
		}
		
		String Hobbie = JOptionPane.showInputDialog("What is your hobbie?");
		
		if (Boonana .equals ("yes")) {
			JOptionPane.showMessageDialog(null, Hobbie + " is much better with boonanas!!!");
		}
		
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}
}