package Westeros

import Capabilities.Diagonal.{DiagonalDownLeft, DiagonalDownRight, DiagonalUpLeft, DiagonalUpRight}
import Capabilities.Sideways.{Leftward, Rightward}
import Capabilities.Straight.{StraightDown, StraightUp}
import Objects.MaxBlastRadius

class Queen (var xAxis: Int, var yAxis: Int )
  extends DiagonalUpLeft with DiagonalUpRight with DiagonalDownLeft with DiagonalDownRight
  with StraightDown with StraightUp with Leftward with Rightward {

  private var superSet: Set[(Int, Int)] = Set()
  superSet = superSet ++ diagonalDownLeftComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.LowerLeft)
  superSet = superSet ++ diagonalDownRightComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.LowerRight)
  superSet = superSet ++ diagonalUpLeftComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.UpperLeft)
  superSet = superSet ++ diagonalUpRightComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.UpperRight)
  //
  superSet = superSet ++ straightUPComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.UpperRight)
  superSet = superSet ++ straightDownComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.LowerLeft)
  //
  superSet = superSet ++ leftwardComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.UpperLeft )
  superSet = superSet ++ rightwardComputeBlastRadius((xAxis,yAxis), MaxBlastRadius.LowerRight )

  val finalSet = superSet

}
