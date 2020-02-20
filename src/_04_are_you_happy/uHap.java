package _04_are_you_happy;

import javax.swing.JOptionPane;

public class uHap {
public static void main(String[] args) {
	String uno= JOptionPane.showInputDialog(null, "Yes or no question, Are You Happy?");
	
	if (uno.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null,"Keep Doing Whatever You're Doing");
	}
	else if (uno.equalsIgnoreCase("No")) {
		String dos= JOptionPane.showInputDialog(null,"Do You Want To Be Happy?");
		if (dos.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null,"Keep Doing Whatever You're Doing");
		}
		else if (dos.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null,"Change Something.");
		}
	}
	
}
}
