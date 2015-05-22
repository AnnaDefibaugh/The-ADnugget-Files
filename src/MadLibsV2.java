

import javax.swing.JOptionPane;

public class MadLibsV2 {
public static void main(String[] args) {
String Adjective = JOptionPane.showInputDialog("Pick An Adjective");
String Noun = JOptionPane.showInputDialog("Pick A Noun");
String Verb = JOptionPane.showInputDialog("Pick A Verb");
JOptionPane.showMessageDialog(null, "A " +Adjective +"\n" +Noun +"\n" +Verb + " a " +Noun);
}
}