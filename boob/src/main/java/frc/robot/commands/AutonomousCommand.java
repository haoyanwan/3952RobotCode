package frc.robot.commands;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Limelight;
import frc.robot.LimelightConstants;

public class AutonomousCommand extends CommandBase {
    /**
     * Creates a new AutonomousCommand.
     */
    private final DriveTrain drive;
    private final Limelight limelight;



    public AutonomousCommand(DriveTrain subsystem) {
      // Use addRequirements() here to declare subsystem dependencies.
      drive = subsystem;
      limelight = new Limelight(new LimelightConstants());
      addRequirements(drive);
      
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
       limelight.outputTelemetry();
       limelight.readPeriodicInputs();
       drive.drive(0,limelight.getX());
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      drive.drive(0, 0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }