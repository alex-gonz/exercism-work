class Bob {
  def hey(words: String) = {
    words match {
      case s if s.trim.isEmpty => "Fine. Be that way!"
      case s if s.toUpperCase == s && s.toLowerCase != s => "Whoa, chill out!"
      case s if s.endsWith("?") => "Sure."
      case _ => "Whatever."
    }
  }
}
