import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {

public static void main(String[] args) {
	Tortoise.setSpeed(10);
	for (int a = 0; a < 6000; a++) {
		
	Tortoise.setPenColor(Colors.getRandomColor());
	
	for (int i = 0; i < 4; i++) {
		Tortoise.move(100);
		Tortoise.turn(90);
	}
	Tortoise.turn(1);
}
	
	}
}	
	
