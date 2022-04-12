package indeed

import scala.io.StdIn

object Solution {

  def main(args: Array[String]): Unit = {
    val jobDescriptions = jobDescriptionWordCountsFromStdIn()
    val queries = queriesFromStdIn()
    val results = fuzzyJobSearch(jobDescriptions, queries)
    resultsToStdOut(results)
  }

  def fuzzyJobSearch(jobDescriptions: Array[Map[String, Int]], queries: Array[Set[String]]): Array[Array[Int]] = {
    val results: Array[Array[Int]] = queries.map { q: Set[String] =>
      val scoresForAllJobs: Array[(Int, Int)] = jobDescriptions.zipWithIndex.map { case (scores: Map[String, Int], i) =>
        (q.map(w => scores(w)).sum, i)
      }
      val sortedScores = scoresForAllJobs.filterNot(_._1 == 0).sortBy(s => s)(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int))
      val topScores = sortedScores.take(Math.min(10, sortedScores.length))
      if (topScores.isEmpty) Array(-1) else topScores.map(_._2)
    }
    results
  }

  /*
    Returns an array of all job searches, converted to a map of their unique words to the word counts
   */
  def jobDescriptionWordCountsFromStdIn(): Array[Map[String, Int]] = {
    val jobCount = StdIn.readLine().toInt
    val wordCounts = new Array[Map[String, Int]](jobCount)
    for (i <- 0 until jobCount) {
      val words: Seq[String] = StdIn.readLine().split(' ').toSeq
      val grouped: Map[String, Seq[String]] = words.groupBy(s => s)
      wordCounts(i) = grouped.view.mapValues(_.length).toMap.withDefaultValue(0)
    }
    wordCounts
  }

  def queriesFromStdIn(): Array[Set[String]] = {
    val queryCount = StdIn.readLine().toInt
    val queries = new Array[Set[String]](queryCount)
    for (i <- 0 until queryCount) {
      queries(i) = StdIn.readLine().split(' ').toSet
    }
    queries
  }

  def resultsToStdOut(results: Array[Array[Int]]): Unit = {
    results.foreach(r => println(r.mkString(" ")))
  }
}
