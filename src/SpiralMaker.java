//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {

			// int TheNuggetOfAD = 1;
			// 3. Make a variable to hold the number of sides and set it to 0
		int Sides = 0;
			// 4. Ask the user which spiral they would like (square, triangle, or
			// pentagon)
		String ShapeMaker = JOptionPane.showInputDialog("What shape do you want to draw?");
			// 5. Set the number of sides depending on what the user entered
			// (multiple lines of code)
		if (ShapeMaker .equals ("Triangle")) {
			Sides = 3;
			}
		else if (ShapeMaker .equals ("Square")) {
			Sides = 4;
			}
		else if (ShapeMaker .equals ("Pentagon")) {
			Sides = 5;
			}
		else if (ShapeMaker .equals ("Hexagon")) {
			Sides = 6;
			}
		else if (ShapeMaker .equals ("Septagon")) {
			Sides = 7;
			}
		else if (ShapeMaker .equals ("Octogon")) {
			Sides = 8;
			}
		else if (ShapeMaker .equals ("Nonagon")) {
			Sides = 9;
			}
		else if (ShapeMaker .equals ("Decagon")) {
			Sides = 10;
			}
		else if (ShapeMaker .equals ("Hendagon")) {
			Sides = 11;
			}
		else if (ShapeMaker .equals ("Dodecagon")) {
			Sides = 12;
			}
		else if (ShapeMaker .equals ("Doubble Dodecagon")) {
			Sides = 20;
			}
		// 6. If the user enters something else, say
		// "Sorry, I don't know how to draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw a \n" +ShapeMaker);
		}
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 1000; i++) {
			// Tortoise.setPenWidth(TheNuggetOfAD);
			// TheNuggetOfAD = TheNuggetOfAD+1;
			Tortoise.move(i * 4);
			Tortoise.turn(360 / Sides);

		}
		// Do the following 80 times
		// Move the Tortoise a distance of 4 multiplied by i
		// Turn the Tortoise 360/4

		// 2. Change your code to turn the square spiral into a triangle spiral

	}

}
