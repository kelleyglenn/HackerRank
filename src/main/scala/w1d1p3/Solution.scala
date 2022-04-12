package w1d1p3

import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  def timeConversion(s: String): String = {
    val (time, amPm) = s.splitAt(8)
    val (hour, minSec) = time.splitAt(2)
    if (amPm == "AM") {
      if (hour == "12") "00" + minSec
      else time
    } else if (hour == "12") time else "" + (hour.toInt + 12) + minSec
  }
}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val result = Result.timeConversion(s)

    printWriter.println(result)

    printWriter.close()
  }
}
