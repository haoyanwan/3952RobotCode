// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {


  private final Talon frontLeftWheel;
	private final Talon frontRightWheel;
	private final Talon rearLeftWheel;
	private final Talon rearRightWheel;
  private final MotorControllerGroup left;
  private final MotorControllerGroup right;
  private final DifferentialDrive drive_train;

  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {
    frontLeftWheel = new Talon(Constants.frontLeftWheel_port);
		frontRightWheel = new Talon(Constants.frontRightWheel_port);
		rearLeftWheel = new Talon(Constants.rearLeftWheel_port);
		rearRightWheel = new Talon(Constants.rearRightWheel_port);
    left = new MotorControllerGroup(frontLeftWheel, rearLeftWheel);
    right = new MotorControllerGroup(frontRightWheel, rearRightWheel);
    drive_train = new DifferentialDrive(left,right);
  }


  public void drive(double speed, double rot){
    drive_train.arcadeDrive(speed, rot);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  
}
