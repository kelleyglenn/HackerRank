package week1.day2.problem3

object Result {
  def countingSort(arr: Array[Int]): Array[Int] = {
    val counts = Array.fill(100)(0)
    arr.indices.foreach(i => counts(arr(i)) += 1)
    counts
  }
}
