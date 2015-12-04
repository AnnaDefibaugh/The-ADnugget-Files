	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	public class BanananaQuiz {
	
		
		public static void main(String[] args)
		{
			//1. ask the user if they like bananas
			String Bananana = JOptionPane.showInputDialog("Do you like Banananas?");
			//2. if they say no, 
				//tell them they are crazy 
				//and end quiz
			if (Bananana.equals("No")) {
				JOptionPane.showMessageDialog(null,"☹ You Do Not Like Banananas?!?! Who Taught You Life! ☹");
			}
			//3. if they say yes
			//	ask them what is their favorite hobby
			//	show a pop up that says "<your hobby> is much better with bananas!"
			else if (Bananana.equals("Yes")) {
				String Boonana = JOptionPane.showInputDialog("What Is Your Favorite Hobbie?");
				JOptionPane.showMessageDialog(null, Boonana+ " Would Be Better With Banananas.");
			} 
		}

	}


