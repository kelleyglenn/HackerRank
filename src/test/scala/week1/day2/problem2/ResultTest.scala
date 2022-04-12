package week1.day2.problem2

class ResultTest extends org.scalatest.FunSuite {

  test("testDiagonalDifference") {
    assert(Result.diagonalDifference(Array(Array(1, 2, 3), Array(4, 5, 6), Array(9, 8, 9))) == 2)
    assert(Result.diagonalDifference(Array(Array(11, 2, 4), Array(4, 5, 6), Array(10, 8, -12))) == 15)
  }

}
