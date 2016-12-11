package org.usfirst.frc.team5700.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private DoubleSolenoid leftSide;
	private DoubleSolenoid rightSide;
    
    public Shooter()
    {
    	leftSide = new DoubleSolenoid(0, 1);
    	rightSide = new DoubleSolenoid(2, 3);
    	
    	leftSide.set(DoubleSolenoid.Value.kReverse);
    	rightSide.set(DoubleSolenoid.Value.kReverse);
    }
	
	public void pistonsGoUp()
	{
		leftSide.set(DoubleSolenoid.Value.kForward);
    	rightSide.set(DoubleSolenoid.Value.kForward);
	}
	
	public void pistonsGoDown()
	{
		leftSide.set(DoubleSolenoid.Value.kReverse);
    	rightSide.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

