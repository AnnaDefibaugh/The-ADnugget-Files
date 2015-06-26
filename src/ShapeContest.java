

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ShapeContest {

	public static void main(String[] args) {
		while (true) {
			Tortoise.setSpeed(10);
			Tortoise.move(44);
			Tortoise.turn(90);
			Tortoise.move(44);
			Tortoise.turn(90);
			Tortoise.move(44);
			Tortoise.turn(90);
			Tortoise.move(44);
			Tortoise.turn(45);
			Tortoise.setPenWidth(10);
			String color = JOptionPane.showInputDialog("Color?");
			if (color.equals("red")) {
				Tortoise.setPenColor(Color.red);
			}else
			{
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			Tortoise.move(55);
		}
	}
}