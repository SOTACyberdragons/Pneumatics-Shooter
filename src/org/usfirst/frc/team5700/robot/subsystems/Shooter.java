package org.usfirst.frc.team5700.robot.subsystems;

import org.usfirst.frc.team5700.robot.commands.Reset;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private DoubleSolenoid leftSide;
	private DoubleSolenoid rightSide;
    
    public Shooter() {
    	super();
    	System.out.println("In Shooter super()");
    	leftSide = new DoubleSolenoid(0, 1);
    	rightSide = new DoubleSolenoid(2, 3);
    	
    	leftSide.set(DoubleSolenoid.Value.kReverse);
    	rightSide.set(DoubleSolenoid.Value.kReverse);
    }
	
	public void pistonsGoUp() {
		leftSide.set(DoubleSolenoid.Value.kForward);
    	rightSide.set(DoubleSolenoid.Value.kForward);
	}
	
	public void pistonsGoDown() {
		leftSide.set(DoubleSolenoid.Value.kReverse);
    	rightSide.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new Reset());
    }
}

