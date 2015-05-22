
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		//int TheNuggetOfAD = 1;
		// 3. Make a variable to hold the number of sides and set it to 0
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 1000; i++) {
			//Tortoise.setPenWidth(TheNuggetOfAD);
			//TheNuggetOfAD = TheNuggetOfAD+1;
			Tortoise.move(i*4);
			Tortoise.turn(360/3);
			
		}
		// Do the following 80 times
				//Move the Tortoise a distance of 4 multiplied by i
				//Turn the Tortoise 360/4
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}
