package week1.day1.problem2

import scala.io._

object Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def miniMaxSum(arr: Array[Int]): Unit = {
    val longs:Array[Long] = arr.map(_.toLong)
    val combos = longs.combinations(4).map(_.sum).toSeq
    println("%d %d".format(combos.min, combos.max))
  }

}

object Solution {
  def main(args: Array[String]): Unit = {

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    Result.miniMaxSum(arr)
  }
}

