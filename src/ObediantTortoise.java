import org.teachingextensions.logo.Tortoise;

public class ObediantTortoise {
	public static void main(String[] args) {

		/*
		 * We are going to make an obedient tortoise that will obey our commands
		 * to draw shapes. Please note that this is not a recipe, but a list
		 * step-by-step instructions.
		 * 
		 * import org.teachingextensions.logo.Tortoise;
		 * 
		 * 1. Make a new class, create a main method, and show the tortoise.
		 * 
		 * 2. Have the Tortoise draw a square.
		 * 
		 * 3. Extract this code into a drawSquare() method.
		 * 
		 * 4. Have the Tortoise draw a triangle.
		 * 
		 * 5. Extract this code into a drawTriangle() method.
		 * 
		 * 6. Have the Tortoise draw a circle.
		 * 
		 * 7. Extract this code into a drawCircle() method.
		 * 
		 * 8. Ask the user which shape they want. Draw the appropriate shape
		 * depending on their answer.
		 * 
		 * 9. Ask the user which color they want. Color the the shape depending
		 * on their answer.
		 */

	}

	void drawSquare() {

		Tortoise.show();
		for (int i = 0; i < 4; i++) {
		Tortoise.move(50);
		Tortoise.turn(90);
		}
	}

	void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(120);
		}
	}

}
