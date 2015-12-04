
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		
		// 1. ask the user if they like bananas
		String Banana = JOptionPane.showInputDialog("Do you like Bananas?");

		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (Banana .equals ("No")){
			JOptionPane.showMessageDialog(null, "Why Do You Not Like Bananas?!?! You Make Me Cry.");
		}

		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		else if (Banana .equals ("Yes")){
		String Hobbie = JOptionPane.showInputDialog("What Is Your Hobbie?");
		JOptionPane.showMessageDialog(null, Hobbie+ " Would Be Much Better With Bananas!");
		}
	}

}