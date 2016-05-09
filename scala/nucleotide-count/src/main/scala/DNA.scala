class DNA(s: String, a: Boolean) {

  def this(s: String) = {
    this(s, true)

    val defaultMap = "ACGT".map(c => c -> 0).toMap
    val newMap = defaultMap ++ s.groupBy(c => c).mapValues(s => s.length)
    if (newMap.size > 4) throw new RuntimeException()
  }

  def nucleotideCounts(): Map[Char, Int] = {
    val defaultMap = "ACGT".map(c => c -> 0).toMap
    defaultMap ++ s.groupBy(c => c).mapValues(s => s.length)
  }

  def nucleotideCounts(c: Char): Int = {
    nucleotideCounts().getOrElse(c, throw new RuntimeException())
  }
}
