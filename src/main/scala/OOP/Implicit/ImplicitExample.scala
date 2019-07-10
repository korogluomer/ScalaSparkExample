package OOP.Implicit

object ImplicitExample {

  implicit def stringToInt(s: String) = s.toInt

  def add(x: Int, y: Int) = x + y

  def main(args: Array[String]): Unit = {
    println(add(1, "2"))
  }


}
