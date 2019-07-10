package OOP.CaseClass

object CaseClass {
  def main(args: Array[String]): Unit = {
    case class Character(name: String, isHacker: Boolean)

    val nail = Character("Nail", true)
    val joyce = nail.copy("Joyce") //joyce de artık Hacker
    val sad=nail.copy(isHacker = false)
    println(sad.name)
    println(nail == joyce)
    println(nail.equals(joyce))
    println(nail.hashCode())
    println(nail.equals(nail))
    joyce match {
      case Character(x, true) => println(x + " is a hacker")
      case Character(x, false) => println(x + " is not haccker")
    }
  }
}
