

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Nugget {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		String color =JOptionPane.showInputDialog("What color would you like to use for the turtle to draw?");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("green")) {
	Tortoise.setPenColor(Color.green); }
	else 
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}

//5. if the user doesn�t enter anything, choose a random color
Tortoise.setPenColor(Colors.getRandomColor());
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.show();
for (int i = 0; i < 4; i++) {
	Tortoise.turn(90);
	Tortoise.setSpeed(10);
	Tortoise.move(100);
}

	}
}

