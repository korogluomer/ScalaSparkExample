package OOP

object RunAnimalExample {
  val animalObject = new Animal
  println(animalObject.getAnimalName)
  animalObject.setAnimalName("cat")
  println(animalObject.getAnimalName)
}
