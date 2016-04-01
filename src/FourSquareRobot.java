import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquareRobot {

	// 2. Create a new Robot
	Robot roboto = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		roboto.setSpeed(10);
		// 5. Set the pen width to 5
		roboto.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {
			drawSquare();
		// 7. Set the pen color to random
		// 8. Turn the robot 90 degrees to the right
				roboto.turn(90);
		}
		// 1. Call the drawSquare() method
		drawSquare();
	}

	/* 3. Fill in the code to draw a square inside the method below. */

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
			roboto.penDown();
			roboto.move(400);
			roboto.setRandomPenColor();
			roboto.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquareRobot().go();
	}

}
