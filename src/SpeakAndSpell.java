import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		int score = 0;
		
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Sasquatch");
		
		// 2. Catch the user's answer in a String
		String abc = JOptionPane.showInputDialog("Spell the word");

		// 3. If the user spelled the word correctly, speak "correct"
		if (abc.equalsIgnoreCase ("Sasquatch")) {
			speak("Correct");
			score = score + 5;
		}

		// 4. Otherwise say "wrong"
		else {
			speak("Yo Wrong Boy!");
		}
		
		// 5. repeat the process for other words
		
speak("El Pollo");
		
		String def = JOptionPane.showInputDialog("Spell the word");

		if (def.equalsIgnoreCase ("El Pollo")) {
			speak("Correct");
			score = score + 5;
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}