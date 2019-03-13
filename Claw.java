/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class Claw extends Subsystem {
  
  private WPI_VictorSPX grabberMVictorSPX = new WPI_VictorSPX(RobotMap.grabberMotor);
   
  public  Claw() {
    addChild("motor", grabberMVictorSPX);
  }
  public void grabberOpen(){
    grabberMVictorSPX.set(ControlMode.PercentOutput, 1);
  }
  public void grabberClose(){
  grabberMVictorSPX.set(ControlMode.PercentOutput, -1);
  }
  public void stop(){
    grabberMVictorSPX.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void initDefaultCommand() {
  }
}
