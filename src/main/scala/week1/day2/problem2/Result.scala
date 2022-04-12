package week1.day2.problem2

object Result {
  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    var (leftToRight, rightToLeft) = (0, 0)
    arr.indices.foreach { i =>
      leftToRight += arr(i)(i)
      rightToLeft += arr(i)(arr(i).length - 1 - i)
    }
    (leftToRight - rightToLeft).abs
  }
}
