package org.usfirst.frc.team5700.robot;

import org.usfirst.frc.team5700.robot.commands.Reset;
import org.usfirst.frc.team5700.robot.commands.Shoot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
 
	public Joystick stick = new Joystick(0);
	
	public OI() {
		JoystickButton auxTrigger = new JoystickButton(stick, 1);
		
		auxTrigger.whileHeld(new Shoot());
		auxTrigger.whenReleased(new Reset());
	}
}

