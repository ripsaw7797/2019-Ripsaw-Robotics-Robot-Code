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
public class ClawWinch extends Subsystem {
  
  private WPI_VictorSPX wintchMVictorSPX = new WPI_VictorSPX(RobotMap.wintchMotor);
   
  public  ClawWinch() {
    addChild("motor", wintchMVictorSPX);
  }
public void winchUp(){
  wintchMVictorSPX.set(ControlMode.PercentOutput, 0.2);
}
public void winchDown(){
  wintchMVictorSPX.set(ControlMode.PercentOutput, -0.2);
}
public void stop(){
  wintchMVictorSPX.set(ControlMode.PercentOutput, 0);
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //  setDefaultCommand(new ClawWinchCommand());
  }
}
