package week1.day2.problem1

class ResultTest extends org.scalatest.FunSuite {

  test("testLonelyinteger") {
    assert(Result.lonelyinteger(Array(1, 2, 3, 4, 3, 2, 1)) == 4)
  }

}
