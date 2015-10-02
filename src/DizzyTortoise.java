import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
		 // 1. Use the dance method to make the Tortoise spin.
		
		 // 2. Ask the user how dizzy you want the tortoise, then spin that number of times.
		 String Dizzy = JOptionPane.showInputDialog("How Many Times Do You Want The Tortoise");
		 int spinNumber = Integer.parseInt(Dizzy);
		 Tortoise.setSpeed(2);
		 dance(spinNumber);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
		Tortoise.turn(360);
		}
	}
}

