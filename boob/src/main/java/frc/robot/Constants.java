// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int frontLeftWheel_port = 0;
    public static final int frontRightWheel_port = 1;
    public static final int rearLeftWheel_port = 2;
    public static final int rearRightWheel_port = 4;

    public static final int ingester_port = 5;
    public static final int lifter1_port = 6;
    public static final int lifter2_port = 7;
    public static final int loader_port = 8;
    public static final int shooter1_port = 9;
    public static final int shooter2_port = 3;

    public static final double ingester_power = 0.5;
    public static final double lifter_power = 0.5;
    public static final double loader_power = 0.5;
    public static final double shooter_power = 0.5;
}
