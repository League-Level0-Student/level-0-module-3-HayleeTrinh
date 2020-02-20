//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bo = new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		
		//5. Use an if/else statement to set the pen color that the user requested
		for (int i = 0; i < 4; i++) {
			
		String col = JOptionPane.showInputDialog("What color out of ROYGBP is you favorite?");
		
		if(col.equalsIgnoreCase("Red")) {
			bo.setPenColor(255, 4, 0);
		}
		else if(col.equalsIgnoreCase("Orange")) {
			bo.setPenColor(255, 132, 0);
		}
		else if(col.equalsIgnoreCase("Yellow")) {
			bo.setPenColor(255, 247, 0);
		}
		else if(col.equalsIgnoreCase("Green")) {
			bo.setPenColor(97, 242, 143);
		}
		else if(col.equalsIgnoreCase("Blue")) {
			bo.setPenColor(133, 226, 255);
		}
		else if(col.equalsIgnoreCase("Purple")) {
			bo.setPenColor(181, 107, 255);
		}
		else {
			bo.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bo.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bo.penDown();
		bo.setSpeed(10);
		bo.move(200);
		bo.turn(90);

	}
}}
