object Hamming {
  def compute(s1: String, s2: String): Int = {
    if (s1.length != s2.length) {
      throw new IllegalArgumentException()
    }
    s1.zip(s2).foldLeft(0)((distSoFar, charTuple) => if (charTuple._1 == charTuple._2) distSoFar else distSoFar + 1)
  }
}
