package week1.day1.problem3

import week1.day1.problem3.Result

class ResultTest extends org.scalatest.FunSuite {

  test("testTimeConversion") {
    assert(Result.timeConversion("12:00:01PM") == "12:00:01")
    assert(Result.timeConversion("12:00:01AM") == "00:00:01")
    assert(Result.timeConversion("07:05:45PM") == "19:05:45")
  }

}
