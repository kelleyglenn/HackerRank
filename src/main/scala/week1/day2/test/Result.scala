package week1.day2.test

object Result {
  def flippingMatrix(matrix: Array[Array[Int]]): Int = {
    // Write your code here
    val n = matrix.length / 2
    var sum = 0
    (0 until matrix.length / 2).foreach { r =>
      (0 until matrix(r).length / 2).foreach { c =>
        val max = Seq(matrix(r)(c), matrix(matrix.length - 1 - r)(c), matrix(r)(matrix(r).length - 1 - c), matrix(matrix.length - 1 - r)(matrix(r).length - 1 - c)).max
        sum += max
      }
    }
    sum
  }
}
