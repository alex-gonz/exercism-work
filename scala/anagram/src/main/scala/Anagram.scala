class Anagram(s: String) {
  def matches(toCheck: Seq[String]): Seq[String] = {
    val charMap = s.toLowerCase.groupBy(c => c)
    toCheck
      .filter(s.toLowerCase != _.toLowerCase)
      .filter(_.toLowerCase.groupBy(c => c) == charMap)
  }
}
