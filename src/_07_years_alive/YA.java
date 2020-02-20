package _07_years_alive;

import javax.swing.JOptionPane;

public class YA {
	public static void main(String[] args) {
		int year = 0;
		for (int i = 0; i < 13; i++) {
			JOptionPane.showMessageDialog(null, year);
			year = year+2007;
		}
	}

}
