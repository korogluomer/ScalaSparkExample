package OOP.Match

object Matching {
  def main(args: Array[String]): Unit = {
    println(matchInteger(5))
  }
  def matchInteger(x:Int):String=x match {
    case 1 => " one"
    case 2 => " two"
    case _ => x+" not one, not two"
  }
}
