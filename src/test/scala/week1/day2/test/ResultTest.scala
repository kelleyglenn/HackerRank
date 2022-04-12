package week1.day2.test

class ResultTest extends org.scalatest.FunSuite {

  test("testFlippingMatrix") {
    assert(Result.flippingMatrix(Array(Array(1, 2), Array(3, 4))) == 4)
    assert(Result.flippingMatrix(Array(Array(112, 42, 83, 119), Array(56, 125, 56, 49), Array(15, 78, 101, 43), Array(62, 98, 114, 108))) == 414)
  }

}
