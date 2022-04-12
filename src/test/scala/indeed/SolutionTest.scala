package indeed

class SolutionTest extends org.scalatest.FunSuite {

  test("testFuzzyJobSearch") {
    assert(Solution.fuzzyJobSearch(Array(Map("some" -> 1, "job" -> 1, "desc" -> 1, "search" -> 1).withDefaultValue(0)), Array(Set("search", "query"))) === Array(Array(0)))
  }

}
