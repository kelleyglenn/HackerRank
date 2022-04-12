package week1.day2.problem1

object Result {
  def lonelyinteger(a: Array[Int]): Int = {
    a.groupBy(x => x).find(_._2.length == 1).get._1
  }
}
