package _07_years_alive;

import javax.swing.JOptionPane;

public class YA {
	public static void main(String[] args) {
		int year = 2007;
		for (int i = 0; i < 14; i++) {
			JOptionPane.showMessageDialog(null, year);
			year = year+1;
		}
	}

}
