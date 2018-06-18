package org.usfirst.frc.team3039.robot.commands;

import org.usfirst.frc.team3039.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TrackCubeX extends Command {

    public TrackCubeX() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.visionpid.enablePID();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.visionpid.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.visionpid.disablePID();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.visionpid.disablePID();
    }
}
