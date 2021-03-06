package Capabilities.Straight

trait StraightDown {

  def straightDownComputeBlastRadius(p: (Int, Int), MaxBlastRadius: (Int, Int)): Set[(Int, Int)] = {
    var s: Set[(Int, Int)] = Set()
    var tracker: (Int, Int) = (p._1, p._2) //Init with current point of object & tracks location

    while(tracker._2 >= MaxBlastRadius._2) {
      s = s ++ Set(tracker)
      tracker = (tracker._1,tracker._2 - 1)
    }
    s
  }

}
