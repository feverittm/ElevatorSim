// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.Elevator;

/** This is a sample program to demonstrate the use of elevator simulation. */
public class Robot extends TimedRobot {
  private final Joystick m_joystick = new Joystick(Constants.kJoystickPort);
  private final Elevator m_elevator = new Elevator();

  public Robot() {
  }

  @Override
  public void robotPeriodic() {
    // Update the telemetry, including mechanism visualization, regardless of mode.
    m_elevator.updateTelemetry();
  }

  @Override
  public void simulationPeriodic() {
    // Update the simulation model.
    m_elevator.simulationPeriodic();
  }

  @Override
  public void teleopPeriodic() {
    if (m_joystick.getRawButton(1)) {
      m_elevator.reachGoal(Constants.kSetpointMeters);
    } else if (m_joystick.getRawButton(2)) {
      m_elevator.reachGoal(2 * Constants.kSetpointMeters);
    } else {
      m_elevator.reachGoal(Constants.kMinElevatorHeightMeters);
    }

    SmartDashboard.putNumber("Elevator Height", m_elevator.getHeight());
  }

  @Override
  public void disabledInit() {
    // This just makes sure that our simulation code knows that the motor's off.
    m_elevator.stop();
  }

  @Override
  public void close() {
    m_elevator.close();
    super.close();
  }
}
