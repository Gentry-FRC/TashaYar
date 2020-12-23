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

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Watchdog;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc4843.Robot.commands.*;
import org.usfirst.frc4843.Robot.subsystems.*;
//import edu.wpi.first.wpilibj.command.CommandGroup;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
   // CommandGroup autonomousCommandGroup;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static Lift lift;
    public static Shoot shoot;
    public static Load load;
    public static Fire fire;
    public static MagExtension magazineextension;
    
    
    
      // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
	RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        lift = new Lift();
        shoot = new Shoot();
        load = new Load();
        fire = new Fire();
        magazineextension = new MagExtension();
           
        
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        System.out.println("newoi");

        oi = new OI();
	
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new AutonomousCommand();
        System.out.println("about to newautonomouscommandgroup");

        //autonomousCommandGroup = new AutonomousCommandGroup();
        
        System.out.println("about to newautonomouscommandgroup");
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        System.out.println("autonomousInit");
        if (autonomousCommand != null) autonomousCommand.start();
       // if (autonomousCommandGroup != null) autonomousCommandGroup.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        //if (autonomousCommandGroup != null) autonomousCommandGroup.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {

        Watchdog.getInstance().feed();
//        Robot.driveTrain.drive(oi.joystick1,oi.joystick2);
        Scheduler.getInstance().run();
    }

    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}