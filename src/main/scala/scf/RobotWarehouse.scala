package scf

/*
Robot Warehouse

We have installed a robot in our warehouse and now we need to be
able to send it commands to control it. We need you to implement
the control mechanism.

For convenience the robot moves along a grid in the roof of the warehouse
and we have made sure that all of our warehouses are built
so that the dimensions of the grid are 10 by 10. We've also made
sure that all our warehouses are aligned along north-south and east-west axes.

All of the commands to the robot consist of a single capital letter
and different commands are dilineated by whitespace.

The robot should accept the following commands:

    N move north
    W move west
    E move east
    S move south

Example command sequences

The command sequence: "N E S W" will move the robot in a full square,
returning it to where it started.

If the robot starts in the south-west corner of the warehouse then
the following commands will move it to the middle of the warehouse.

"N E N E N E N E"
Requirements

    Create a way to send a series of commands to the robot
    Make sure that the robot doesn't try to move outside the warehouse


    07 97 37 10 57 4
*/


case class RobotPosition(x:Int=0, y:Int=0) {
  if (x < 0 || x > 9 || y < 0 || y > 9) {
    throw new RuntimeException("Out of bounds.")
  }

  def n(): RobotPosition = RobotPosition(x, y+1)
  def s(): RobotPosition = RobotPosition(x, y-1)
  def e(): RobotPosition = RobotPosition(x-1, y)
  def w(): RobotPosition = RobotPosition(x+1, y)
}

class RobotWarehouse {
  def moveSequence(instructionSequence: String):Unit = {
    instructionSequence.foreach(move)
  }

  var robotPosition:RobotPosition = RobotPosition()

  def move(instruction: Char):Unit = {
    instruction match {
      case 'N' => robotPosition = robotPosition.n()
      case 'S' => robotPosition = robotPosition.s()
      case 'E' => robotPosition = robotPosition.e()
      case 'W' => robotPosition = robotPosition.w()
      case ' ' =>
      case _ => throw new RuntimeException(f"Instruction not understood")
    }
  }

  def getRobotPosition():(Int,Int) = (robotPosition.x, robotPosition.y)

}
