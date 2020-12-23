// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc4843.Robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4843.Robot.RobotMap;
import org.usfirst.frc4843.Robot.commands.*;

// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import org.usfirst.frc4843.Robot.Robot;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController rightDrive = RobotMap.driveTrainRightDrive;
    SpeedController leftDrive = RobotMap.driveTrainLeftDrive;
    RobotDrive drive = RobotMap.driveTrainDrive;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEClARATIONS
    
    
    
    
       //use this drive for xbox controller
    public void drive (GenericHID leftStick ,int leftAxis, GenericHID rightStick, int rightAxis){
        drive.tankDrive(leftStick, 2, leftStick, 5);
    }
    
    //Us this drive for joysticks
  //public void drive (GenericHID leftStick, GenericHID rightStick){
  // drive.tankDrive(leftStick,rightStick);
  //}
   
    
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	setDefaultCommand(new DriveCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

