

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
  public void teleopPeriodic() {
    m_motor.set(m_stick.getY());
    SmartDashboard.putNumber("Encoder Position", m_encoder.getPosition());
    SmartDashboard.putNumber("Encoder Velocity", m_encoder.getVelocity());
  }

 
 
}
