

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class Candy_Crush {

	public class MadLibs3 {

	}

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String QWERTYUIOPASDFGHJKLZXCVBNM = JOptionPane.showInputDialog("What do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " +QWERTYUIOPASDFGHJKLZXCVBNM +"!");
		// 3. Ask the user for the name of their best friend
		String MNBVCXZLKJHGFDSAPOIUYTREWQ = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, MNBVCXZLKJHGFDSAPOIUYTREWQ +"is as sweet as candy! <3");
	} 
}

