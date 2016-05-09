object Pangrams {
  def isPangram(s: String): Boolean = {
    s.toLowerCase.replaceAll("[^a-z]","").groupBy(c => c).size == 26
  }
}
