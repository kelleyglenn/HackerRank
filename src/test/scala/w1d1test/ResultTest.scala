package w1d1test

class ResultTest extends org.scalatest.FunSuite {

  test("testFindMedian") {
    assert(Result.findMedian(Array(1, 2, 3)) == 2)
    assert(Result.findMedian(Array(5, 3, 1, 2, 4)) == 3)
    assert(Result.findMedian(Array(0, 1, 2, 4, 6, 5, 3)) == 3)
  }

}
