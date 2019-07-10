package OOP.AbstractClass

class ConsolePrinter extends MyWriter {
  override def setMessage(message: String): Unit = {
    this.message=message
  }

  override def printMessage(): Unit = {
    println(message)
  }
}
