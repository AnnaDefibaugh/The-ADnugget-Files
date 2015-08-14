//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Toirtoilingaling {

	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		String Color = JOptionPane.showInputDialog("What color do you want?");
		//4. use an if/else statement to set the pen color that the user requested
if (Color .equals("Pink")) {
	Tortoise.setPenColor(Colors.Pinks.DeepPink);
}
if (Color .equals("Red")) {
	Tortoise.setPenColor(Colors.Reds.Red);
}
if (Color .equals("Orange")) {
	Tortoise.setPenColor(Colors.Oranges.Tomato);
}
if (Color .equals("Yellow")) {
	Tortoise.setPenColor(Colors.Yellows.Yellow);
}
if (Color .equals("Green")) {
	Tortoise.setPenColor(Colors.Greens.Chartreuse);
}
if (Color .equals("Blue")) {
	Tortoise.setPenColor(Colors.Blues.Blue);
}
if (Color .equals("Purple")) {
	Tortoise.setPenColor(Colors.Purples.BlueViolet);
}
if (Color .equals("Macaroni")) {
	Tortoise.setPenColor(Colors.Oranges.Orange);
}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 1000; i++) {
			if (Color .equals("Party")) {
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			Tortoise.move(i*4);
			Tortoise.turn(360/3);
			
		}

	}
}
