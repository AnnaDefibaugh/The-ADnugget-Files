 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class DontCareAlreadyDid {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 20th";
		String dadsBirthday = "May 2th";
		String brothersBirthday = "March 11th";
		String myBirthday = "November 6th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String MyEyesAreBleeding = JOptionPane.showInputDialog("What birthday do you want to know?");
		
		// 3. Print out what the user typed
		System.out.println(MyEyesAreBleeding);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		
		if (MyEyesAreBleeding .equals("Yo Mama"))   {
			
			JOptionPane.showMessageDialog(null, momsBirthday);
			
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		
		if (MyEyesAreBleeding .equals("Yo Puapa"))   {
			
			JOptionPane.showMessageDialog(null, dadsBirthday);
			
		}
		
		// 6. if user asked for "brother"
			// print brothersBirthday
		
		if (MyEyesAreBleeding .equals("Yo Brobro"))
			
			JOptionPane.showMessageDialog(null, brothersBirthday);	
		
		// 6. if user asked for your name
			// print myBirthday
		
			JOptionPane.showMessageDialog(null, myBirthday);
		
		//7. otherwise print "Sorry, I don't remember that person's birthday!"
		
		
	} 
}