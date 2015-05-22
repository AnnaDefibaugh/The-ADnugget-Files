

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ShapeContest {

	public static void main(String[] args) {
		while (true) {
			tortoise.setSpeed(10);
			tortoise.move(44);
			tortoise.turn(90);
			tortoise.move(44);
			tortoise.turn(90);
			tortoise.move(44);
			tortoise.turn(90);
			tortoise.move(44);
			tortoise.turn(45);
			tortoise.setPenWidth(10);
			String color = JOptionPane.showInputDialog("Color?");
			if (color.equals("red")) {
				tortoise.setPenColor(Color.red);
			}else
			{
				tortoise.setPenColor(Colors.getRandomColor());
			}
			tortoise.move(55);
		}
	}
}