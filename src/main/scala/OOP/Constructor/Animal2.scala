package OOP.Constructor

class Animal2(animalName: String, animalAge: Int) {
  def getAnimalName(): String = {
    animalName
  }

  def getAnimalAge(): Int = {
    animalAge
  }
}

object Animal2 {
  def main(args: Array[String]): Unit = {
    val animal2 = new Animal2("cat", 10)
    println(animal2.getAnimalAge())
    println(animal2.getAnimalName())
  }
}