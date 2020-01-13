import Objects.Point

object test {
  def main(args: Array[String]): Unit = {
    val outcome = computeBlastRadius(2,4)
    println("There are " + outcome.size + " items" )
    for(x <- outcome) {
      println(x._1 + " " + x._2)
    }
  }

  def computeBlastRadius(p: (Int, Int)): Set[(Int, Int)] = {
    var s: Set[(Int, Int)] = Set()
    var s2: Set[(Int, Int)] = Set()

    s = s ++ Set( (p._1 + 2, p._2 + 1) )
    s = s ++ Set( (p._1 + 2, p._2 - 1) )
    s = s ++ Set( (p._1 + 1, p._2 + 2) )
    s = s ++ Set( (p._1 + 1, p._2 - 2) )
    s = s ++ Set( (p._1 - 2, p._2 - 1) )
    s = s ++ Set( (p._1 - 2, p._2 + 1) )
    s = s ++ Set( (p._1 - 1, p._2 + 2) )
    s = s ++ Set( (p._1 - 1, p._2 - 2) )

    for ( x <- s) {
      if(x._1 <= 7 && x._2 <= 7 && x._1 >= 1 && x._2 >= 1 ) {
        s2 = s2 + x
      }
    }
    s2
  }

}
