package week1.day2.problem3

class ResultTest extends org.scalatest.FunSuite {

  test("testCountingSort") {
    assert(Result.countingSort(Array(1, 1, 3, 2, 1)).take(5) === Array(0, 3, 1, 1, 0))
  }

}
