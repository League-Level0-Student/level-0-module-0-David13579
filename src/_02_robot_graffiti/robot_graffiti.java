package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robot_graffiti {
	public static void main(String[] args) throws Exception {
		Robot graffiti = new Robot();
		graffiti.penDown();
		graffiti.setSpeed(100);
		graffiti.move(114);
		graffiti.turn(90);
		for(int i=0; i<180; i++) {
			graffiti.move(1);
			graffiti.turn(1);	
		}
		graffiti.hide();
	}
}
