// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {
  private Joystick m_stick;
  private static final int deviceID = 6;
  private CANSparkMax m_motor;
  private RelativeEncoder m_encoder;

  
  @Override
  public void robotInit() {
    m_motor = new CANSparkMax(deviceID, MotorType.kBrushless);
    m_motor.restoreFactoryDefaults();
    m_encoder = m_motor.getEncoder();

    m_stick = new Joystick(0);
  }

  
  @Override
  public void robotPeriodic() {}

  
  @Override
  public void autonomousInit() {
    
  }

    @Override
  public void autonomousPeriodic() {
    
  }

  
  @Override
  public void teleopInit() {}


  @Override
  public void teleopPeriodic() {
    m_motor.set(m_stick.getY());
    SmartDashboard.putNumber("Encoder Position", m_encoder.getPosition());
    SmartDashboard.putNumber("Encoder Velocity", m_encoder.getVelocity());
  }

 
  @Override
  public void disabledInit() {}

 
  @Override
  public void disabledPeriodic() {}

  
  @Override
  public void testInit() {}


  @Override
  public void testPeriodic() {}

  
  @Override
  public void simulationInit() {}

  
  @Override
  public void simulationPeriodic() {}
}
