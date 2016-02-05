import java.util.Random;
public class LotteryThing {
public static void main(String[] args) {

	for (int y = 0; y < 6; y++) {
		int Random = new Random().nextInt(49) +1;
		System.out.println(Random);
	}
	
}
}
