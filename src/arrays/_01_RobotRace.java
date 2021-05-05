package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot[] r = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
			r[i].setSpeed(100);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		r[0].moveTo(400,550);
		r[1].moveTo(500, 550);
		r[2].moveTo(600, 550);
		r[3].moveTo(700, 550);
		r[4].moveTo(800, 550);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		boolean r1 = false;
		int whichRobot = 0;
	while (r1 == false) {
		for (int i = 0; i < r.length; i++) {
			r[i].move(new Random().nextInt(51));
		}
		if (r[0].getY() <= 5) {
			whichRobot = 1;
			r1 = true;
		}if (r[1].getY() <= 5) {
			whichRobot = 2;
			r1 = true;
		}if (r[2].getY() <= 5) {
			whichRobot = 3;
			r1 = true;
		}if (r[3].getY() <= 5) {
			whichRobot = 4;
			r1 = true;
		}if (r[4].getY() <= 5) {
			whichRobot = 5;
			r1 = true;
		}
	}
		
	//7. declare that robot the winner and throw it a party!
	JOptionPane.showMessageDialog(null, "Robot " + whichRobot + " wins!");
	r[whichRobot -1].sparkle();

	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
