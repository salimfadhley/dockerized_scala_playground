package scf

import org.scalatest.{FlatSpec, Matchers}

class RobotWarehouseSpec extends FlatSpec with Matchers {

  "RobotWarehouse" should "be creatable" in {
      val rw = new RobotWarehouse()
      assert(rw.getRobotPosition()==(0,0))
  }

  it can "move the robot north" in {
    val rw = new RobotWarehouse()
    rw.move('N')
    assert(rw.getRobotPosition()==(0,1))
  }

  it can "move in a sequence" in {
    val rw = new RobotWarehouse()
    rw.move('N')
    rw.move('W')
    rw.move('S')
    rw.move('E')
    assert(rw.getRobotPosition()==(0,0))
  }

//  it can "throws out of bounds if out of vounds" in {
//    val rw = new RobotWarehouse()
//
//    rw.move('S')
//
//  }

  it can "can move in a sequence" in {
    val rw = new RobotWarehouse()
    rw.moveSequence("N W S E")
    assert(rw.getRobotPosition()==(0,0))

  }


}
