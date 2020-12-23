// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc4843.Robot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainRightDrive;
    public static SpeedController driveTrainLeftDrive;
    public static RobotDrive driveTrainDrive;
    public static Relay liftLiftRelay;
    public static SpeedController shootShootMotor;
    public static SpeedController loadLoadMotor;
    public static Servo fireFireMotor;
    public static Servo MagExtension;
    public static Relay lightsLightsRelay;
    public static Relay lights2Lights2Relay;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
   
    

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainRightDrive = new Victor(1, 1);
	LiveWindow.addActuator("DriveTrain", "RightDrive", (Victor) driveTrainRightDrive);
        
        driveTrainLeftDrive = new Victor(1, 2);
	LiveWindow.addActuator("DriveTrain", "LeftDrive", (Victor) driveTrainLeftDrive);
        
        driveTrainDrive = new RobotDrive(driveTrainLeftDrive, driveTrainRightDrive);
        
        loadLoadMotor = new Victor (1, 4);
        LiveWindow.addActuator("Load","LoadMotor", (Victor) loadLoadMotor);
        
        fireFireMotor = new Servo (1, 5);
        fireFireMotor.setAngle(30);
        LiveWindow.addActuator("Fire", "FireServo", (Servo) fireFireMotor);
        
        MagExtension = new Servo (1,6);
        MagExtension.setAngle(30);
        LiveWindow.addActuator("Extend", "Extend Servo", (Servo) MagExtension);
        
        
        driveTrainDrive.setSafetyEnabled(true);
        driveTrainDrive.setExpiration(0.1);
        driveTrainDrive.setSensitivity(0.5);
        driveTrainDrive.setMaxOutput(1.0);
        driveTrainDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        

        lightsLightsRelay = new Relay(1, 1);
	LiveWindow.addActuator("Lights", "LightsRelay", lightsLightsRelay);
        
        lights2Lights2Relay = new Relay(1, 2);
	LiveWindow.addActuator("Lights2", "Lights2Relay", lights2Lights2Relay);
        
        liftLiftRelay = new Relay(1, 3);
        LiveWindow.addActuator("lift", "LiftRelay", liftLiftRelay);
        
        
        
        shootShootMotor = new Jaguar(1, 3);
	LiveWindow.addActuator("Shoot", "ShootMotor", (Jaguar) shootShootMotor);
         
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
