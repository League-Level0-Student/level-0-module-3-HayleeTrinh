
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String M = "July 12";
		String D = "July 10";
		String B = "December 24";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String dfs = JOptionPane.showInputDialog("Who's birthday from my family do you want to know? My dad's, brother, or mine?");
		// 3. Print out what the user typed
		System.out.println("dfs");
		// 4. if user asked for "mom"
			//print mom's birthday
		if(dfs.equalsIgnoreCase("Yours")) {
			JOptionPane.showMessageDialog(null, M);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(dfs.equalsIgnoreCase("Dads")) {
			JOptionPane.showMessageDialog(null,D);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(dfs.equalsIgnoreCase("Brothers")) {
			JOptionPane.showMessageDialog(null, B);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry! I don't know that persons birthday!");
		}

	} 
}
