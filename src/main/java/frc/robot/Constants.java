// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

public class Constants {
  public static final int kMotorPort = 0;
  public static final int kEncoderAChannel = 0;
  public static final int kEncoderBChannel = 1;
  public static final int kJoystickPort = 0;

  public static final double kElevatorKp = 5;
  public static final double kElevatorKi = 0;
  public static final double kElevatorKd = 0;

  public static final double kElevatorkS = 0.0; // volts (V)
  public static final double kElevatorkG = 0.462; // volts (V)
  public static final double kElevatorkV = 0.462; // volt per velocity (V/(m/s))
  public static final double kElevatorkA = 0.0; // volt per acceleration (V/(m/s²))

  public static final double kElevatorGearing = 25.0;
  public static final double kElevatorSprocketDiameter = Units.inchesToMeters(1.893); // outside diameter of 22 tooth sprocket.
  public static final double kCarriageMass = 8.0; // kg

  public static final double kSetpointMeters = 0.75;
  // Encoder is reset to measure 0 at the bottom, so minimum height is 0.
  public static final double kMinElevatorHeightMeters = 0.0;
  public static final double kMaxElevatorHeightMeters = Units.inchesToMeters(72.0);

  // distance per pulse = (distance per revolution) / (pulses per revolution)
  //  = (Pi * D) / ppr
  public static final double kElevatorEncoderDistPerPulse =
      Math.PI * kElevatorSprocketDiameter / 42;
}
