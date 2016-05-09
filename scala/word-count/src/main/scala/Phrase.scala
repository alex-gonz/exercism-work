import scala.collection.immutable.HashMap

class Phrase(p: String) {

  def wordCount(): Map[String, Int] = {
    p.toLowerCase.replaceAll("[~!@#$%^&*()_+`=.<>?/\\\\:]", "")
      .split("[ ,]+")
      .groupBy(s => s)
      .mapValues(_.length)
  }
}
