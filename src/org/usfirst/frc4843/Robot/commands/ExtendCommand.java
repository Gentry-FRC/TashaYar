


package org.usfirst.frc4843.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4843.Robot.Robot;

/**
 *
 */
public class  ExtendCommand extends Command {

    public ExtendCommand() {
       
    }

 
    protected void initialize(){
        System.out.println("ExtendCommand init");        
    }

    
    protected void execute() {
        System.out.println("ExtendCommand exec");
        System.out.println(Robot.magazineextension.Angle());
        Robot.magazineextension.Extend();
      
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return true;
    }

    // Called once after isFinished returns true
    protected void end() {
      
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

    

