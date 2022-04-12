package w1d1p1

import scala.io.StdIn

object Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def plusMinus(arr: Array[Int]) {
    val floatLen = arr.length.toFloat
    val output = "%.6f\n%.6f\n%.6f".format(arr.count(_ > 0)/floatLen, arr.count(_ < 0).toFloat/floatLen, arr.count(_ == 0).toFloat/floatLen)
    println(output)
  }

}

object Solution {
  def main(args: Array[String]) {
    val n = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    Result.plusMinus(arr)
  }
}

