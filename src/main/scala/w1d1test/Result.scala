package w1d1test

object Result {
  def findMedian(arr: Array[Int]): Int = {
    arr.sorted.apply((arr.length - 1) / 2)
  }
}
