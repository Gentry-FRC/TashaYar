package org.usfirst.frc4843.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommandGroup extends CommandGroup {
    
    public AutonomousCommandGroup() {
        addSequential( new ShootCommand());
        addSequential( new DelayCommand(3));     
        addSequential( new FireCommand());  //Fire #1 frisbee
        addSequential( new DelayCommand(2));
        addSequential( new FireResetCommand());
        addSequential( new DelayCommand(2));
        addSequential( new LoadCommand());
        addSequential( new DelayCommand(1));
        addSequential( new LoadStopCommand());
        addSequential( new DelayCommand(1));
        addSequential( new FireCommand());  //Fire #2 frisbee
        addSequential( new DelayCommand(2));
        addSequential( new FireResetCommand());
        addSequential( new DelayCommand(2));
        addSequential( new LoadCommand());
        addSequential( new DelayCommand(1));
        addSequential( new LoadStopCommand());
        addSequential( new DelayCommand(1));
        addSequential( new FireCommand());  //Fire #3 frisbee
        addSequential( new DelayCommand(2));
        addSequential( new FireResetCommand());

        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
