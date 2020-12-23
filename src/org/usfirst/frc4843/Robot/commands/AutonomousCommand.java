// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc4843.Robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4843.Robot.Robot;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 */
public class  AutonomousCommand extends Command {
  // private CommandGroup autonomousCommandGroup;

    
    public AutonomousCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.shoot.shoot(.80);     //Spin up the shooter wheel to %80
        Timer.delay(3);             //Wait 3 seconds for the wheel to spin up
        Robot.fire.Fire();          //Shoot a disc
        Timer.delay(1);             //Wait for the disc to shoot
        Robot.fire.FireReset();     //Reset the fire arm
        Timer.delay(1);             //Wait for the fire arm to reset
        Robot.load.Load();          //Load a disc
        Timer.delay(1);             //Wait for disc to load
        Robot.load.LoadStop();      //Stop the load wheels
        Timer.delay(1);             //Wait for disc to load
        Robot.fire.Fire();          //Shoot a disc
        Timer.delay(1);             //Wait for disc to shoot through the backboard of a goal
        Robot.fire.FireReset();     //Reset the fire arm
        Timer.delay(1);             //Wait for the arm to reset
        Robot.load.Load();          //Load a disc
        Timer.delay(1);             //Wait for a disc to load
        Robot.load.LoadStop();      //Stop the load wheels
        Timer.delay(1);             //Wait for the disc to load
        Robot.fire.Fire();          //Shoot a disc
        Timer.delay(1);             //Wait for the disc to shoot
        Robot.fire.FireReset();     //Reset the fire arm
        Timer.delay(1);             //Wair for the arm to reset
        
        
        
        
        
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.println("AutonomousCommand intr");

    }
}
