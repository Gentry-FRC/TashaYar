


package org.usfirst.frc4843.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4843.Robot.Robot;

/**
 *
 */
public class  RetractCommand extends Command {

    public RetractCommand() {
       
    }

 
    protected void initialize(){
        System.out.println("RetractCommand init");        
    }

    
    protected void execute() {
        System.out.println("RetractCommand exec");
        System.out.println(Robot.magazineextension.Angle());
        Robot.magazineextension.Retract();
      
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
